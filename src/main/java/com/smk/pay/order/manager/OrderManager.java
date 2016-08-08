package com.smk.pay.order.manager;

import com.smk.pay.order.dto.OrderInfo;

import java.util.List;

/**
 * Created by 马传志 on 2016/7/28.
 */
public interface OrderManager {

    OrderInfo queryByOrderId(String orderId);

    int addOrder(OrderInfo orderInfo);

}
