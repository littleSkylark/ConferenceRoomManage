package com.lark.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by skylark on 2017/2/12.
 */
public class DateFormat {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT_DATE = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT_TIME = new SimpleDateFormat("HH:mm:ss");

    public static String toStrDate(Date date) {
        return SIMPLE_DATE_FORMAT_DATE.format(date);
    }

    public static String toTime(Date date) {
        return SIMPLE_DATE_FORMAT_TIME.format(date);
    }

    public static Date toDate(String strDate) {
        Date date = null;
        try {
            date = SIMPLE_DATE_FORMAT_DATE.parse(strDate);
        } catch (ParseException e) {
            date = new Date();
        }
        return date;
    }
}
