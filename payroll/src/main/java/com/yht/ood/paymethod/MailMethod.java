package com.yht.ood.paymethod;

import com.yht.ood.payclassification.Paycheck;

public class MailMethod implements PaymentMethod {
    private String payAdderss;

    @Override
    public void pay(Paycheck paycheck) {

        System.out.println("将支票邮寄至：" + payAdderss);
    }
}
