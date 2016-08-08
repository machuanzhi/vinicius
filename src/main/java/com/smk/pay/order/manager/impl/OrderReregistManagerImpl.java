package com.smk.pay.order.manager.impl;

import com.smk.pay.dal.condtion.EntityCondition;
import com.smk.pay.order.dao.OrderReregistEntityMapper;
import com.smk.pay.order.manager.OrderReregistManager;
import com.smk.pay.order.dto.OrderReregistInfo;
import com.smk.pay.order.entity.OrderReregistEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 马传志 on 2016/8/2.
 */
@Service
public class OrderReregistManagerImpl implements OrderReregistManager {
    @Autowired
    private OrderReregistEntityMapper orderReregistEntityMapper;

    public int addOrderReregist(OrderReregistInfo orderReregistInfo) {
        OrderReregistEntity reregistEntity = new OrderReregistEntity();
        BeanUtils.copyProperties(orderReregistInfo, reregistEntity);
        return orderReregistEntityMapper.insert(reregistEntity);
    }

    public List<OrderReregistEntity> queryForList(EntityCondition condition) {

        List<OrderReregistEntity> entityList = orderReregistEntityMapper.selectList(condition);
        return entityList;
    }
}
