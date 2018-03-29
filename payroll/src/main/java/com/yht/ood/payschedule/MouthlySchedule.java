package com.yht.ood.payschedule;

import com.yht.ood.util.DateUtil;

import java.util.Date;

public class MouthlySchedule implements PaymentSchedule {
    @Override
    public boolean isPayDay(Date date) {
        return DateUtil.isLastOfMonth(date);
    }

    @Override
    public Date getPayPeriodStartDate(Date payperiodEndDate) {

        return DateUtil.getFirstOfMonth(payperiodEndDate);
    }
}
