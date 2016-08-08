package com.smk.pay.order.result;

import com.smk.pay.order.enums.ResultEnum;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 马传志 on 2016/8/1.
 */
public class ResultResponse<T> implements Serializable {


    private String resultCode;
    private String resultMsg;
    // 默认成功
    private Boolean isSucc = Boolean.TRUE;

    private T t;

    public ResultResponse() {
        super();
    }

    public ResultResponse(Boolean isSucc, T t) {
        this.isSucc = isSucc;
        this.t = t;
    }

    public ResultResponse(Boolean isSucc, ResultEnum result, String resultMsg) {
        this.isSucc = isSucc;
        this.resultCode = result.name();
        this.resultMsg = resultMsg;
    }


    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultEnum resultCode) {
        this.resultCode = resultCode.name();
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Boolean getIsSucc() {
        return isSucc;
    }

    public void setIsSucc(Boolean isSucc) {
        this.isSucc = isSucc;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "ResultResponse{" +
                "resultCode='" + resultCode + '\'' +
                ", resultMsg='" + resultMsg + '\'' +
                ", isSucc=" + isSucc +
                '}';
    }
}
