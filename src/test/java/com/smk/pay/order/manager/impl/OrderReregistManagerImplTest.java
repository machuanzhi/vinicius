package com.smk.pay.order.manager.impl;

import com.smk.pay.dal.condtion.Criteria;
import com.smk.pay.dal.condtion.EntityCondition;
import com.smk.pay.order.entity.OrderReregistEntity;
import com.smk.pay.order.manager.OrderReregistManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Project vinicius
 * Created by chuanzhi.mcz
 * Date 2016/8/6 13:51
 */
public class OrderReregistManagerImplTest extends AbstractManagerImplTest {

    @Test
    public void testQueryForList() {

        OrderReregistManager orderReregistManager = (OrderReregistManager)ctx.getBean(OrderReregistManagerImpl.class);
        Criteria criteria = new Criteria();
        criteria.addCriterion("ORDER_ID in ", Arrays.asList("100201607151126280000", "100201607131529200000"), "ORDER_ID")
                .addCriterion("CARD_CODE = ", "32323", "CARD_CODE");

        List<OrderReregistEntity> list = orderReregistManager.queryForList(new EntityCondition().addCriteria(criteria));
        Assert.assertNotNull(list);
    }
}
