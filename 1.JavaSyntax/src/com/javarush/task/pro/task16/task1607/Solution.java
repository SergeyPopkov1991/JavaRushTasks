package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate localDate = LocalDate.now();

        return localDate;
    }

    static LocalDate ofExample() {
        //напишите тут ваш код


        return LocalDate.of(2020 ,9 ,12);
    }

    static LocalDate ofYearDayExample() {


        return LocalDate.ofYearDay(2020 , 256);
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код

         return LocalDate.ofEpochDay(18517);
    }
}
