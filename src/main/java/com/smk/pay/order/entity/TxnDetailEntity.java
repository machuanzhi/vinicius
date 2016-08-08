package com.smk.pay.order.entity;

public class TxnDetailEntity {
    private Long txnId;

    private String orderId;

    private Long relId;

    private String seq;

    private Short txnCategory;

    private Short txnResult;

    private String txnTime;

    public Long getTxnId() {
        return txnId;
    }

    public void setTxnId(Long txnId) {
        this.txnId = txnId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Long getRelId() {
        return relId;
    }

    public void setRelId(Long relId) {
        this.relId = relId;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq == null ? null : seq.trim();
    }

    public Short getTxnCategory() {
        return txnCategory;
    }

    public void setTxnCategory(Short txnCategory) {
        this.txnCategory = txnCategory;
    }

    public Short getTxnResult() {
        return txnResult;
    }

    public void setTxnResult(Short txnResult) {
        this.txnResult = txnResult;
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime == null ? null : txnTime.trim();
    }
}