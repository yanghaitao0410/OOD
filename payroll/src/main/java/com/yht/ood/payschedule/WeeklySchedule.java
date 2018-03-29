package com.yht.ood.payschedule;

import com.yht.ood.util.DateUtil;

import java.util.Date;

public class WeeklySchedule implements PaymentSchedule {

    @Override
    public boolean isPayDay(Date date) {
        return DateUtil.isFriday(date);
    }

    @Override
    public Date getPayPeriodStartDate(Date payPeriodEndDate) {
        return DateUtil.add(payPeriodEndDate, -6);
    }
}
