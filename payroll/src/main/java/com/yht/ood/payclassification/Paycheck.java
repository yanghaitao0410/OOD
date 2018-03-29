package com.yht.ood.payclassification;

import java.util.Date;

/**
 * 该类的作用是记录发薪信息：
 *      payPeriodStart : 发薪区间的开始日期
 *      payPeriodStart : 发薪区间的结束日期
 *      grossPay : 工资总额
 *      deductions : 扣除项
 *      netPay : 实发工资
 */
public class Paycheck {
    private Date payPeriodStart;
    private Date payPeriodEnd;
    private Double grossPay;
    private Double deductions;
    private Double netPay;

    public Date getPayPeriodStart() {
        return payPeriodStart;
    }

    public void setPayPeriodStart(Date payPeriodStart) {
        this.payPeriodStart = payPeriodStart;
    }

    public Date getPayPeriodEnd() {
        return payPeriodEnd;
    }

    public void setPayPeriodEnd(Date payPeriodEnd) {
        this.payPeriodEnd = payPeriodEnd;
    }

    public Double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(Double grossPay) {
        this.grossPay = grossPay;
    }

    public Double getDeductions() {
        return deductions;
    }

    public void setDeductions(Double deductions) {
        this.deductions = deductions;
    }

    public Double getNetPay() {
        return netPay;
    }

    public void setNetPay(Double netPay) {
        this.netPay = netPay;
    }
}
