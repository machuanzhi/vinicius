package com.smk.pay.order.dao;

import com.smk.pay.dal.condtion.EntityCondition;
import com.smk.pay.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderEntityMapper {
    int count(EntityCondition condition);

    int delete(EntityCondition condition);

    int deleteByPrimaryKey(String orderId);

    int insert(OrderEntity record);

    int insertSelective(OrderEntity record);

    List<OrderEntity> selectList(EntityCondition condition);

    OrderEntity selectByPrimaryKey(String orderId);

    int updateSelective(@Param("record") OrderEntity record, @Param("condition") EntityCondition condition);

    int update(@Param("record") OrderEntity record, @Param("condition") EntityCondition condition);

    int updateByPrimaryKeySelective(OrderEntity record);

    int updateByPrimaryKey(OrderEntity record);
}