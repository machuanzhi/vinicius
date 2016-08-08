package com.smk.pay.order.interceptor;

import java.lang.annotation.*;

/**
 * Created by 马传志 on 2016/8/2.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TraceLog {

    String value() default "";
}
