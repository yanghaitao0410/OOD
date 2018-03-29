package com.yht.ood.payclassification;

import com.yht.ood.util.DateUtil;

import java.util.ArrayList;
import java.util.List;

public class HourlyClassification implements PaymentClassification {
    private Double hourlyRate;
    private List<TimeCard> timeCardList = new ArrayList<>();

    public HourlyClassification(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


   public void addTimeCard(TimeCard timeCard) {
       timeCardList.add(timeCard);
   }

    @Override
    public Double calculateSalary(Paycheck paycheck) {
        Double salary = new Double(0);
        if(timeCardList != null && timeCardList.size() > 0){
            for(TimeCard timeCard : timeCardList){
                if(DateUtil.between(timeCard.getDate(), paycheck.getPayPeriodStart(), paycheck.getPayPeriodEnd())){
                    salary += calculateSalaryByTimeCard(timeCard);
                }
            }
        }
        return salary;
    }

    /**
     * 根据时间卡计算工资，工作时间小于等于8小时：正常
     * 大于8小时：大于部分1.5倍工资
     * @param timeCard
     * @return
     */
    public Double calculateSalaryByTimeCard(TimeCard timeCard) {
       if(timeCard.getHours() > 8) {
           return 8 * hourlyRate + (timeCard.getHours() - 8 ) * 1.5 * hourlyRate;
       }else {
           return timeCard.getHours() * hourlyRate;
       }
    }
}
