package com.yht.ood.paymethod;

import com.yht.ood.payclassification.Paycheck;

public interface PaymentMethod {
    public void pay(Paycheck paycheck);
}
