package com.smk.pay.order.dao;

import com.smk.pay.dal.condtion.EntityCondition;
import com.smk.pay.order.entity.TxnDetailEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TxnDetailEntityMapper {
    int count(EntityCondition condition);

    int delete(EntityCondition condition);

    int deleteByPrimaryKey(Long txnId);

    int insert(TxnDetailEntity record);

    int insertSelective(TxnDetailEntity record);

    List<TxnDetailEntity> selectList(EntityCondition condition);

    TxnDetailEntity selectByPrimaryKey(Long txnId);

    int updateSelective(@Param("record") TxnDetailEntity record, @Param("condition") EntityCondition condition);

    int update(@Param("record") TxnDetailEntity record, @Param("condition") EntityCondition condition);

    int updateByPrimaryKeySelective(TxnDetailEntity record);

    int updateByPrimaryKey(TxnDetailEntity record);
}