package com.smk.pay.order.entity;

public class OrderEntity {
    private String orderId;

    private Integer payGatewayId;

    private Short orderState;

    private Short payType;

    private String issuedTime;

    private String person;

    private String userId;

    private Short cardType;

    private String cardNo;

    private Long goodsAmount;

    private Long otherPay;

    private String settleFormula;

    private Long settleAmount;

    private String debitSno;

    private String creditSno;

    private String transactionRecord;

    private String ubgSno;

    private String merchantId;

    private String merchantName;

    private String businessTagName;

    private Integer businessTagCode;

    private String payTime;

    private String closeTime;

    private Integer channelId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getPayGatewayId() {
        return payGatewayId;
    }

    public void setPayGatewayId(Integer payGatewayId) {
        this.payGatewayId = payGatewayId;
    }

    public Short getOrderState() {
        return orderState;
    }

    public void setOrderState(Short orderState) {
        this.orderState = orderState;
    }

    public Short getPayType() {
        return payType;
    }

    public void setPayType(Short payType) {
        this.payType = payType;
    }

    public String getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(String issuedTime) {
        this.issuedTime = issuedTime == null ? null : issuedTime.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Short getCardType() {
        return cardType;
    }

    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public Long getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Long goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Long getOtherPay() {
        return otherPay;
    }

    public void setOtherPay(Long otherPay) {
        this.otherPay = otherPay;
    }

    public String getSettleFormula() {
        return settleFormula;
    }

    public void setSettleFormula(String settleFormula) {
        this.settleFormula = settleFormula == null ? null : settleFormula.trim();
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
        this.debitSno = debitSno == null ? null : debitSno.trim();
    }

    public String getCreditSno() {
        return creditSno;
    }

    public void setCreditSno(String creditSno) {
        this.creditSno = creditSno == null ? null : creditSno.trim();
    }

    public String getTransactionRecord() {
        return transactionRecord;
    }

    public void setTransactionRecord(String transactionRecord) {
        this.transactionRecord = transactionRecord == null ? null : transactionRecord.trim();
    }

    public String getUbgSno() {
        return ubgSno;
    }

    public void setUbgSno(String ubgSno) {
        this.ubgSno = ubgSno == null ? null : ubgSno.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getBusinessTagName() {
        return businessTagName;
    }

    public void setBusinessTagName(String businessTagName) {
        this.businessTagName = businessTagName == null ? null : businessTagName.trim();
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
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime == null ? null : closeTime.trim();
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
}