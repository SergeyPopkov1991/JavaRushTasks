package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
       Antarctica antarctica = new Antarctica(1);
       Africa africa = new Africa(1);
       SouthAmerica southAmerica = new SouthAmerica(3);
       NorthAmerica northAmerica = new NorthAmerica(9);
       Eurasia eurasia = new Eurasia(8);
       Australia australia = new Australia(7);
    }
}
