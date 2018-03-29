package com.yht.ood.payclassification;

import java.util.Date;

public class TimeCard {
    /**
     * 时间卡日期
     */
    private Date date;

    /**
     * 对应日期的工作时长
     */
    private Double hours;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    /**
     * 判断时间卡日期是否在该次发薪区间内
     * @return
     */
    public boolean betweenPayPeriod(Date payDate) {
        Long val = payDate.getTime() - date.getTime();

        return (val / (1000 * 60 * 60 * 24)) < 7;
    }
}
