package com.javarush.task.pro.task10.task1022;

/* 
Робозомби
*/

import java.util.Arrays;

public class Pepl {

    public static Battery[] batteryWarehouse = new Battery[100500];

    public static void main(String[] args) {
        Robot[] robots = new Robot[]{new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot(), new Robot()};
        System.out.println(Arrays.toString(robots));

        distributeBatteries(robots);

        System.out.println(Arrays.toString(robots));
    }

    public static void distributeBatteries(Robot[] robots) {
        for (Robot robot : robots) {
            robot.replaceBattery(batteryWarehouse[0]);
        }
    }
}
