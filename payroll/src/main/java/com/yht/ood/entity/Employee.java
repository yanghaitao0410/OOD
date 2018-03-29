package com.yht.ood.entity;

import com.yht.ood.payclassification.Affiliation;
import com.yht.ood.payclassification.Paycheck;
import com.yht.ood.payclassification.PaymentClassification;
import com.yht.ood.paymethod.PaymentMethod;
import com.yht.ood.payschedule.PaymentSchedule;

import java.util.Date;

public class Employee {
    private String name;
    private String address;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //获取薪资的方式
    PaymentClassification paymentClassification;

    //发薪方式
    PaymentMethod paymentMethod;

    //发薪周期
    PaymentSchedule paymentSchedule;

    //协会
    Affiliation affiliation;

    public boolean isPayDay(Date date) {
        return this.paymentSchedule.isPayDay(date);
    }

    public Date getPayPeriodStartDate(Date date) {
        return this.paymentSchedule.getPayPeriodStartDate(date);
    }

    public void pay(Paycheck paycheck) {
        Double grossPay = paymentClassification.calculateSalary(paycheck);
        Double deductions = affiliation.calculateDeductions(paycheck);
        Double netPay = grossPay - deductions;
        paycheck.setGrossPay(grossPay);
        paycheck.setDeductions(deductions);
        paycheck.setNetPay(netPay);
        paymentMethod.pay(paycheck);
    }

}
