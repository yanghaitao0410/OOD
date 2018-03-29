package com.yht.ood.payclassification;

public class SalariedClassification implements PaymentClassification {
    private Double salary;

    @Override
    public Double calculateSalary(Paycheck paycheck) {
        return salary;
    }
}
