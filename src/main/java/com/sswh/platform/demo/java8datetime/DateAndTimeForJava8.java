package com.sswh.platform.demo.java8datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * https://www.baeldung.com/java-8-date-time-intro
 */
public class DateAndTimeForJava8 {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期："+localDate);
        //加一天
        localDate = localDate.plusDays(50);
        System.out.println("加两天："+ localDate);
        localDate = localDate.minus(1, ChronoUnit.MONTHS);
        System.out.println("减一个月后，若是二月没有31号，则取最后一天："+ localDate);
        DayOfWeek sunday = LocalDate.parse("2016-06-11").getDayOfWeek();

        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
    }
}
