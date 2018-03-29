package com.yht.ood.util;

import sun.awt.geom.AreaOp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Date add(Date payPeriodEndDate, int time){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(payPeriodEndDate);
        calendar.add(Calendar.DATE, time);
        return calendar.getTime();
    }

    public static boolean isFriday(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar.get(Calendar.DAY_OF_WEEK) == 6 ? true : false;
    }

    public static boolean isLastOfMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        date = calendar.getTime();

        calendar.set(Calendar.DAY_OF_MONTH,
                calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        if(calendar.getTime().equals(date)){
            return true;
        }

        return false;
    }

    public static Date getFirstOfMonth(Date payPeriodEndDate){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(payPeriodEndDate);
        calendar.set(Calendar.DAY_OF_MONTH,
                calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

        return calendar.getTime();
    }

    public static Date parseDate(String stringDate)  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        try{
            startDate = sdf.parse(stringDate);
        }catch(ParseException e) {
            e.printStackTrace();
        }

        return startDate;
    }

    public static Long getDaysBetween(Date firstDateFriday, Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(firstDateFriday);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        Long val = calendar.getTimeInMillis() - calendar2.getTimeInMillis();
        return val / (1000 * 60 * 60 * 24);

    }

    /**
     * 判断时间卡或销售凭条是否在发薪区间之内
     * @param date
     * @param payPeriodStartDate
     * @param payPeriodEndDate
     * @return
     */
    public static boolean between(Date date, Date payPeriodStartDate, Date payPeriodEndDate) {
        return date.after(payPeriodStartDate) && date.before(payPeriodEndDate);
    }

    /**
     * 将时间的时、分、秒清零
     * @param calendar
     * @return
     */
    public static Calendar resetCalendar(Calendar calendar) {
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        return calendar;
    }

    /**
     * 获取时间区间内有多少个周五
     * @param payPeriodStartDate
     * @param payPeriodEndDate
     * @return
     */
    public static int getFriendTimes(Date payPeriodStartDate, Date payPeriodEndDate) {
        int fridayTime = 0;
        Calendar tmp = Calendar.getInstance();
        tmp.setTime(payPeriodStartDate);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(payPeriodEndDate);
         while(tmp.getTimeInMillis() < endCalendar.getTimeInMillis()) {
             if(tmp.get(Calendar.DAY_OF_WEEK) == 6) {
                 fridayTime++;
             }
             tmp.add(Calendar.DATE, 1);
         }
        return fridayTime;
    }
}
