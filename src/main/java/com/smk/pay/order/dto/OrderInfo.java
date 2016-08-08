package com.smk.pay.order.dto;

import java.beans.Transient;
import java.io.Serializable;

/**
 * Project vinicius
 * Created by chuanzhi.mcz
 * Date 2016/8/4 19:31
 */
public class OrderInfo implements Serializable{

    private String orderId;

    private Short orderState;

    private String issuedTime;

    private String userId;

    private Long goodsAmount;

    private Long settleAmount;

    private String debitSno;

    private String creditSno;

    private String transactionRecord;

    private String merchantId;

    private String merchantName;

    private String businessTagName;

    private Integer businessTagCode;

    private String payTime;

    private String closeTime;

    private Integer channelId;

    private String cardCode;

    private String cardNo;

    private String type;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Short getOrderState() {
        return orderState;
    }

    public void setOrderState(Short orderState) {
        this.orderState = orderState;
    }

    public String getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(String issuedTime) {
        this.issuedTime = issuedTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Long goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Long getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(Long settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getDebitSno() {
        return debitSno;
    }

    public void setDebitSno(String debitSno) {
        this.debitSno = debitSno;
    }

    public String getCreditSno() {
        return creditSno;
    }

    public void setCreditSno(String creditSno) {
        this.creditSno = creditSno;
    }

    public String getTransactionRecord() {
        return transactionRecord;
    }

    public void setTransactionRecord(String transactionRecord) {
        this.transactionRecord = transactionRecord;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getBusinessTagName() {
        return businessTagName;
    }

    public void setBusinessTagName(String businessTagName) {
        this.businessTagName = businessTagName;
    }

    public Integer getBusinessTagCode() {
        return businessTagCode;
    }

    public void setBusinessTagCode(Integer businessTagCode) {
        this.businessTagCode = businessTagCode;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
