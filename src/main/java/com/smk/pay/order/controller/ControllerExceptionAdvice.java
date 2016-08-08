package com.smk.pay.order.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 马传志 on 2016/7/31.
 */
@ControllerAdvice
public class ControllerExceptionAdvice {

    public static final Logger logger = Logger.getLogger(ControllerExceptionAdvice.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ModelAndView exceptionHandler(Exception ex, HttpServletRequest request) {
        logger.error("Controller,except!", ex);
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("exception", ex.getMessage());
        return mv;
    }


}
