package ViDu;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //Lay thoi gian hien tai
        long t1 = System.currentTimeMillis();
        for (int i = 1; i <= 100; i++) {
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Ban dau " + t1);
        System.out.println("Luc sau " + t2);
        System.out.println("Chay het vong lap het: " + (t2 - t1));
        //Doi don vi thoi gian bang TimeUnit
        System.out.println("3000 nam bang " + TimeUnit.DAYS.toSeconds(3000*365) + " giay");
        System.out.println("3 gio bang " + TimeUnit.HOURS.toSeconds(3));
        //Date
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Thu " + date.getDay());
        System.out.println("Ngay " + date.getDate());
        System.out.println("Thang: " + (date.getMonth() + 1));
        System.out.println("Nam: " + (date.getYear() + 1900));

        //Calendar
        Calendar  calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.YEAR));

        calendar.add(Calendar.DATE, 7);
        System.out.println(calendar.get(Calendar.DATE));

        //Date format
        Date date1 = new Date(System.currentTimeMillis());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(date1));
    }
}
