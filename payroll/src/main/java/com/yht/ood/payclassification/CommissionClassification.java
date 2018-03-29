package com.yht.ood.payclassification;

import com.yht.ood.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

public class CommissionClassification implements  PaymentClassification {
    private List<SalesReceipt> salesReceipts = new ArrayList<>();
    //提成
    private Double rate;
    //底薪
    private Double salary;

    public CommissionClassification(Double salary, Double rate) {
        this.salary = salary;
        this.rate = rate;
    }


    public void addSalesReceipt(SalesReceipt salesReceipt) {
        salesReceipts.add(salesReceipt);
    }

    @Override
    public Double calculateSalary(Paycheck paycheck) {
        Double commission = new Double(0);
        for(SalesReceipt salesReceipt : salesReceipts) {
            if(DateUtil.between(salesReceipt.getDate(), paycheck.getPayPeriodStart(), paycheck.getPayPeriodEnd())) {
                commission += salesReceipt.getAmount() * rate;
            }
        }
        return salary + commission;
    }
}
