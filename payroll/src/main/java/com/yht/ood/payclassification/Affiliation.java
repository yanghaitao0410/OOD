package com.yht.ood.payclassification;

import com.yht.ood.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 协会
 */
public class Affiliation {
    private String memberId;
    private Double weeklyDue;
    private List<ServiceCharge> charges = new ArrayList<>();

    public void addCharges(ServiceCharge charge) {
        charges.add(charge);
    }


    /**
     * 计算会费和服务费扣除项
     * @param paycheck
     * @return
     */
    public Double calculateDeductions(Paycheck paycheck) {
        Double totalCharge = new Double(0);
        for(ServiceCharge charge : charges) {
            if(DateUtil.between(charge.getDate(), paycheck.getPayPeriodStart(), paycheck.getPayPeriodEnd())) {
                totalCharge += charge.getAmount();
            }
        }
        int fridayTimes = DateUtil.getFriendTimes(paycheck.getPayPeriodStart(), paycheck.getPayPeriodEnd());
        Double totalDue = fridayTimes * weeklyDue;

        return totalDue + totalCharge;
    }



}
