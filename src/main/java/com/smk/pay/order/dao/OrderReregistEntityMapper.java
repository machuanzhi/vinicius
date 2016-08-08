package com.smk.pay.order.dao;

import com.smk.pay.dal.condtion.EntityCondition;
import com.smk.pay.order.entity.OrderReregistEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderReregistEntityMapper {
    int count(EntityCondition condition);

    int delete(EntityCondition condition);

    int deleteByPrimaryKey(String orderId);

    int insert(OrderReregistEntity record);

    int insertSelective(OrderReregistEntity record);

    List<OrderReregistEntity> selectList(EntityCondition condition);

    OrderReregistEntity selectByPrimaryKey(String orderId);

    int updateSelective(@Param("record") OrderReregistEntity record, @Param("condition") EntityCondition condition);

    int update(@Param("record") OrderReregistEntity record, @Param("condition") EntityCondition condition);

    int updateByPrimaryKeySelective(OrderReregistEntity record);

    int updateByPrimaryKey(OrderReregistEntity record);

}