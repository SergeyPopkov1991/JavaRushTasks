package com.javarush.task.pro.task16.task1614;

import java.time.Instant;

/* 
Конец времен
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //напишите тут ваш код

        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        //напишите тут ваш код

        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        //напишите тут ваш код

        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond() , 999999999);
    }
}
