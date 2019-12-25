package com.gy;


import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public void getMothAndYear(DateTime dt) {
        int year = dt.getYear();
        int month = dt.getMonthOfYear();
        //获取世纪
        int century = dt.getCenturyOfEra();
        System.out.println(century);
        System.out.println(year);
        System.out.println(month);
    }

    public void addHour() {
        DateTime dt = new DateTime();
        DateTime dt1 = dt.plusHours(1);
        DateTime year2000 = dt.withYear(2000);
        DateTime twoHoursLater = dt.plusHours(2);
        System.out.println(year2000);
        System.out.println(twoHoursLater);
        System.out.println(dt == dt1);
        System.out.println(year2000 == twoHoursLater);

    }

    public void getTuesDay() {
        //获取这一年11月的第一个星期二
        LocalDate now = new LocalDate(DateTimeZone.getDefault());
        LocalDate electionDate = now.monthOfYear()
                .setCopy(11)        // November
                .dayOfMonth()       // Access Day Of Month Property
                .withMinimumValue() // Get its minimum value
                .plusDays(6)        // Add 6 days
                .dayOfWeek()        // Access Day Of Week Property
                .setCopy(1)
                .plusDays(1);       // Gives us Tuesday
        System.out.println("electionDate:" + electionDate);
    }


    public void formatDate() {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.toString("MM/dd/yyyy hh:mm:ss.SSSa"));
        System.out.println(dateTime.toString("dd-MM-yyyy HH:mm:ss"));
        System.out.println(dateTime.toString("EEEE dd MMMM, yyyy HH:mm:ssa"));
        System.out.println(dateTime.toString("MM/dd/yyyy HH:mm ZZZZ"));
        System.out.println(dateTime.toString("MM/dd/yyyy HH:mm Z"));
    }

    public void getMyBirthDay(){
        DateTime dateTime =  new DateTime(2000,8,28,12,0,0);
        //getCentury
        System.out.println(dateTime.getCenturyOfEra());
        //getDay
        System.out.println(dateTime.getDayOfWeek());
        //getMonth
        System.out.println(dateTime.getDayOfMonth());
        //getMinute
        System.out.println(dateTime.getMinuteOfDay());



    }


    public static void main(String[] args) {
        Date date = new Date();
        DateTime dateTime0 = new DateTime(date);
        System.out.println("date: " + date + "Date转换为dateTime: " + dateTime0);
        DateTime dateTime1 = new DateTime();
        System.out.println("当前时间:" + dateTime1);
        DateTime dateTime2 = new DateTime(2019, 10, 18, 10, 0, 0);
        System.out.println("指定时间" + dateTime2);


        App app = new App();
        app.getMothAndYear(dateTime1);

        app.addHour();

        app.getTuesDay();

        app.formatDate();


        app.getMyBirthDay();

    }
}
