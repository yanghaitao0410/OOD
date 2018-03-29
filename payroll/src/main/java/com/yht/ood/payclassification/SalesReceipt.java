package com.yht.ood.payclassification;

import java.util.Date;

public class SalesReceipt {
    private Date date;
    private Integer amount;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
