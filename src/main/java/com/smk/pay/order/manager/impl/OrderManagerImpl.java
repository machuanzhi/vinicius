package com.smk.pay.order.manager.impl;

import com.smk.pay.order.dao.OrderEntityMapper;
import com.smk.pay.order.dao.OrderReregistEntityMapper;
import com.smk.pay.order.dto.OrderInfo;
import com.smk.pay.order.entity.OrderEntity;
import com.smk.pay.order.interceptor.TraceLog;
import com.smk.pay.order.manager.OrderManager;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 马传志 on 2016/7/28.
 */
@Service
public class OrderManagerImpl implements OrderManager {

    public static final Logger logger = Logger.getLogger(OrderManagerImpl.class);
    @Autowired
    private OrderEntityMapper orderEntityMapper;

    public OrderInfo queryByOrderId(String orderId) {
        logger.info("queryById, orderId= " + orderId);
        OrderEntity orderEntity = orderEntityMapper.selectByPrimaryKey(orderId);
        OrderInfo orderInfo = new OrderInfo();
        if (orderEntity != null) {
            BeanUtils.copyProperties(orderEntity, orderInfo);
        }
        return orderInfo;
    }

    @TraceLog
    @Transactional
    public int addOrder(OrderInfo orderInfo) {
        OrderEntity orderEntity = new OrderEntity();
        BeanUtils.copyProperties(orderInfo, orderEntity);
        orderEntityMapper.insertSelective(orderEntity);

        return 1;
    }

}
