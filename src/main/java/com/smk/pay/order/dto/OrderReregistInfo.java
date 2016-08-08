package com.smk.pay.order.dto;

import java.io.Serializable;

/**
 * Project vinicius
 * Created by chuanzhi.mcz
 * Date 2016/8/7 14:55
 */
public class OrderReregistInfo implements Serializable {

    private String orderId;

    private String cardCode;

    private String cardNo;

    private String type;

    private String reqSeq;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode == null ? null : cardCode.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getReqSeq() {
        return reqSeq;
    }

    public void setReqSeq(String reqSeq) {
        this.reqSeq = reqSeq == null ? null : reqSeq.trim();
    }
}
