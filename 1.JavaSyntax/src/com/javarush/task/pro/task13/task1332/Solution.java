package com.javarush.task.pro.task13.task1332;

/* 
Вирусы в Инстаматрице
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static Set<String> matrixLogs = new HashSet<>();

    public static void main(String[] args) {
        fillMatrixLog();
        removeBugs();
    }
    //напишите тут ваш код
    public static void removeBugs() {
        Set<String> copy = new HashSet<>(matrixLogs);
        for (String i:copy
             ) {
            if (i.startsWith("buahaha")){
                matrixLogs.remove(i);
            }
        }
    }

    public static void fillMatrixLog() {
        for (int i = 0; i < 400; i++) {
            matrixLogs.add("interestingLog" + i + ".log");
            if ((i > 0) && (i % 5 == 0) && (i < 295)) {
                matrixLogs.add("buahaha" + i + ".bug");
            }
        }
    }
}