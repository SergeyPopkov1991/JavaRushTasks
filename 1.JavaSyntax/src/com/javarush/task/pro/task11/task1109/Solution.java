package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
       Outer.Nested k = new Outer.Nested();
        Outer.Inner d = new Outer().new Inner();

    }
}
