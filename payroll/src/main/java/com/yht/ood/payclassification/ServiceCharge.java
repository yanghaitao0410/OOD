package com.yht.ood.payclassification;

import java.util.Date;

/**
 * 服务费
 */
public class ServiceCharge {
    //产生日期
    private Date date;
    //费用总计
    private Double amount;
    //产生详情，文字描述
    private String text;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
