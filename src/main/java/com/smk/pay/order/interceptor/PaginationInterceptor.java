package com.smk.pay.order.interceptor;

import com.smk.pay.dal.condtion.EntityCondition;
import com.smk.pay.dal.enums.DialectEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.util.Properties;

/**
 * Project vinicius
 * Created by chuanzhi.mcz
 * Date 2016/8/4 20:33
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class})})
public class PaginationInterceptor implements Interceptor {

    private static final Logger logger = Logger.getLogger(PaginationInterceptor.class);


    public Object intercept(Invocation invocation) throws Throwable {

        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();

        BoundSql boundSql = statementHandler.getBoundSql();
        Object parameterObject = boundSql.getParameterObject();
        // 如果参数类型非EntityCondition 或者是limit小于1，不做分页处理
        EntityCondition condition;
        if (parameterObject instanceof EntityCondition) {
            condition = (EntityCondition) boundSql.getParameterObject();
            if (condition.getLimit() < 1)
                return invocation.proceed();
        } else {
            return invocation.proceed();
        }


        MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, new DefaultObjectFactory(), new DefaultObjectWrapperFactory());

        Configuration configuration = (Configuration) metaStatementHandler.getValue("delegate.configuration");

        String dialectType = configuration.getVariables().getProperty("dialect").toUpperCase();
        if (StringUtils.isBlank(dialectType)) {
            throw new RuntimeException("Database dialect not defined in configuration.xml, dialect=" + dialectType);
        }

        Dialect dialect;

        DialectEnum dialectEnum = DialectEnum.valueOf(dialectType);
        switch (dialectEnum) {
            case ORACLE:
                dialect = new OracleDialect();
                break;
            default:
                dialect = new MysqlDialect();
                break;
        }


        metaStatementHandler.setValue("delegate.boundSql.sql", dialect.getLimitString(boundSql.getSql(), condition.getOffset(), condition.getLimit()));
        metaStatementHandler.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);
        metaStatementHandler.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);

        logger.debug("MyBatisPaginationInterceptor, sql = " + boundSql.getSql());

        return invocation.proceed();
    }

    abstract class Dialect {
        abstract String getLimitString(String sql, int index, int limit);
    }

    class OracleDialect extends Dialect {
        @Override
        String getLimitString(String sql, int offset, int limit) {
            return new StringBuffer("select * from (")
                    .append(" select rownum rn, s.*")
                    .append(" from (").append(sql).append(") s")
                    .append(" where rownum <= ").append((offset + limit)).append(") r ")
                    .append(" where r.rn > ").append(limit).toString();
        }
    }

    class MysqlDialect extends Dialect {
        @Override
        String getLimitString(String sql, int index, int limit) {
            return new StringBuffer(sql).append(" limit ").append(index).append(", ").append(limit).toString();
        }
    }

    public Object plugin(Object o) {
        if (o instanceof StatementHandler)
            return Plugin.wrap(o, this);
        else
            return o;
    }

    public void setProperties(Properties properties) {

    }
}
