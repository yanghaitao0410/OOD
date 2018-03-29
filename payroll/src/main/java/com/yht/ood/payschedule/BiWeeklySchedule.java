package com.yht.ood.payschedule;

import com.yht.ood.util.DateUtil;

import java.util.Date;

public class BiWeeklySchedule implements PaymentSchedule {

    private Date firstDateFriday = DateUtil.parseDate("2017-6-2");

    @Override
    public boolean isPayDay(Date date) {
        Long interval = DateUtil.getDaysBetween(firstDateFriday, date);
        return interval % 14 == 0;
    }

    @Override
    public Date getPayPeriodStartDate(Date payPeriodEndDate) {
        return DateUtil.add(payPeriodEndDate, -13);
    }
}
