package com.smk.pay.order.controller;

import com.smk.pay.order.enums.ResultEnum;
import com.smk.pay.order.validator.OrderGroup;
import com.smk.pay.order.result.ResultResponse;
import com.smk.pay.order.validator.ValidatorResultHandler;
import com.smk.pay.order.dto.OrderInfo;
import com.smk.pay.order.manager.OrderManager;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Created by 马传志 on 2016/7/25.
 */
@Controller
@RequestMapping("order")
public class OrderController {

    private final static Logger logger = Logger.getLogger(OrderController.class);
    @Autowired
    private OrderManager orderManager;

    @RequestMapping("/query/{orderId}")
    @ResponseBody
    public OrderInfo queryByOrderId(@PathVariable String orderId, HttpServletRequest request, HttpServletResponse response) {

        logger.info("query order, orderId= " + orderId);
        if (StringUtils.isBlank(orderId)) {
            logger.info("query order, orderId is blank! ");
            return null;
        }
        return orderManager.queryByOrderId(orderId);
    }
    @RequestMapping("/add")
    @ResponseBody
    public ResultResponse addOrder(@RequestBody @Validated(OrderGroup.class) OrderInfo orderInfo, BindingResult result) {
        logger.info("add order, order = " + orderInfo);
        ResultResponse resultResponse = ValidatorResultHandler.handle(result, ResultEnum.PARAM_INVALID);
        if (!resultResponse.getIsSucc()) {
            return resultResponse;
        }
        int id = orderManager.addOrder(orderInfo);
        return resultResponse;
    }
}
