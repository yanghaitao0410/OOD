package com.yht.ood.payschedule;

import java.util.Date;

public interface PaymentSchedule {

    /**
     * 是否是支付日
     * @return Boolean
     */
    public boolean isPayDay(Date date);

    /**
     * 获取支付周期的开始日期
     * @return
     */
    public Date getPayPeriodStartDate(Date date);
}
