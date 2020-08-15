package com.ylz.hf.write.tool;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description: 描述内容
 * @Author: sunqiang
 * @CreateDate: 2019/12/3  12:04
 * @UpdateUser: sunqiang
 * @UpdateDate: 2019/12/3  12:04
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class DateUtils {

    /**
     * @param strDate
     * @return java.util.Date
     * @description 将长时间格式字符串转换为时间 yyyyMMdd
     * @author sunqiang
     * @date 2019/12/3
     */
    public static Date strToDateLong(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     * @param date
     * @return java.lang.String
     * @description date转str
     * @author sunqiang
     * @date 2019/12/3
     */
    public static String dateToStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String str = sdf.format(date);
        return str;
    }

    public static Date dateToReg(Date date) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss:SSS");
        return df.parse(df.format(date));
    }

    /**
     * @param strDate
     * @param regDate
     * @return java.util.Date
     * @description str转date，按照规则转
     * @author sunqiang
     * @date 2019/12/11
     */
    public static Date strToDate(String strDate, String regDate) throws ParseException {
        DateFormat formatter = new SimpleDateFormat(regDate);
        Date strtodate = formatter.parse(strDate);
        return strtodate;
    }

    /**
     * @param date
     * @param regDate
     * @return java.lang.String
     * @description date转string，按照规则转
     * @author sunqiang
     * @date 2019/12/11
     */
    public static String dateToString(Date date, String regDate) {
        SimpleDateFormat sdf = new SimpleDateFormat(regDate);
        return sdf.format(date);
    }

    /**
     * @param date
     * @param min
     * @return java.lang.String
     * @description 当前时间后指定分钟的时间字符串
     * @author sunqiang
     * @date 2019/12/11
     */
    public static String dateAfterMin(Date date, Integer min) {
        long currentTime = date.getTime();
        currentTime += min * 60 * 1000;
        date = new Date(currentTime);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result = dateFormat.format(date);
        return result;
    }

    public static boolean compareDate(Date oldDate, Date newDate) {
        if (oldDate.getTime() > newDate.getTime()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        String result = dateAfterMin(new Date(), 20);
//        System.out.println(result);
        Date date = strToDateLong("20121212");
        int age = getAge(date);
//        System.out.println(age);
    }


    //由出生日期获得年龄
    public static int getAge(Date birthDay) throws Exception {
        Calendar cal = Calendar.getInstance();

        if (cal.before(birthDay)) {
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);

        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;

        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            } else {
                age--;
            }
        }
        return age;
    }


}
