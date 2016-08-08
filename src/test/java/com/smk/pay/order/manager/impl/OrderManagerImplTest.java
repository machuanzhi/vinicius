package com.smk.pay.order.manager.impl;

import com.alibaba.fastjson.JSONObject;
import com.smk.pay.order.dto.OrderInfo;
import com.smk.pay.order.manager.OrderManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * OrderManagerImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>07/29/2016</pre>
 */
public class OrderManagerImplTest extends AbstractManagerImplTest {

    @Test
    public void testAddOrder() {
        // TODO
    }

    @Test
    public void testQueryListForPage() {

        OrderManager orderManager = (OrderManager) ctx.getBean(OrderManagerImpl.class);
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId("100201412241615060000");
        int offset = 20;
        int limit = 10;
        List<OrderInfo> list = orderManager.queryList(orderInfo, offset, limit);
        Assert.assertNotNull(list);
    }

}
