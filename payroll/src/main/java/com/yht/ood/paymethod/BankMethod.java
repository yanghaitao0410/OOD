package com.yht.ood.paymethod;

import com.yht.ood.payclassification.Paycheck;

public class BankMethod implements PaymentMethod {
    private String bank;
    private String account;

    @Override
    public void pay(Paycheck paycheck) {
        System.out.println("银行转账方式：转到" + bank);
    }
}
