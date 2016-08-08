package com.smk.pay.order.interceptor;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

/**
 * Created by 马传志 on 2016/8/2.
 */
@Component
@Aspect
public class TraceLogInterceptor {

    public static final Logger logger = Logger.getLogger(TraceLogInterceptor.class);

    @Around("execution(* com.smk.pay.order.manager..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Class targetCls = joinPoint.getTarget().getClass();
        Class[] argClass = null;

        StringBuffer argsBuffer = new StringBuffer("params is : ");
        if (null != args && args.length > 0) {
            argClass = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                argsBuffer.append("args[").append(i + 1).append("] = ").append(toJsonStr(args[i])).append(",");
                argClass[i] = args[i].getClass();
            }
        } else {
            argsBuffer.append("empty");
        }

        String common = targetCls.getSimpleName() + "." + methodName + ": ";

        Method method = targetCls.getMethod(methodName, argClass);
        boolean isTraceLogMarked = method.isAnnotationPresent(TraceLog.class);

        if (isTraceLogMarked)
            logger.info(common + argsBuffer.toString());

        Object retVal = joinPoint.proceed();

        if (isTraceLogMarked)
            logger.info(common + "result is : " + toJsonStr(retVal));

        return retVal;
    }

    // Object 2 json string
    private String toJsonStr(Object object) {
        if (object == null)
            return StringUtils.EMPTY;

        if (object instanceof Object || object instanceof Array)
            return JSONObject.toJSONString(object);
        else
            return object.toString();
    }
}
