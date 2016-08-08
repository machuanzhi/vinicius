package com.smk.pay.order.validator;

import com.smk.pay.order.enums.ResultEnum;
import com.smk.pay.order.result.ResultResponse;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * Created by 马传志 on 2016/8/1.
 */
public class ValidatorResultHandler {

    public static ResultResponse handle(BindingResult bindingResult, ResultEnum resultEnum) {

        if (bindingResult != null && bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            if(CollectionUtils.isNotEmpty(errors)) {
                ObjectError error = errors.get(0);
                return new ResultResponse(Boolean.FALSE, resultEnum, error.getDefaultMessage());
            }
        }
        return new ResultResponse(Boolean.TRUE, ResultEnum.SUCCESS, null);
    }
}
