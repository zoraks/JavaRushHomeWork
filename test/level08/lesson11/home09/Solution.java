package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное
число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) {
        System.out.println("MAY 1 2013 = " + isDateOdd("MAY 1 2013"));
        System.out.println("JANUARY 1 2000 = " + isDateOdd("JANUARY 1 2000"));
        System.out.println("JANUARY 2 2020 = " + isDateOdd("JANUARY 2 2020"));

    }

    public static boolean isDateOdd(String date) {
        Date d0 = new Date(date);
        d0.setMonth(0);
        d0.setDate(1);
        d0.setHours(0);
        d0.setMinutes(0);
        d0.setSeconds(0);

        Date d1 = new Date(date);

        long msTimeDistance = d1.getTime() - d0.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance/msDay);
        boolean x = false;
        if (dayCount % 2 == 0) x = true;
        return x;
    }
}
