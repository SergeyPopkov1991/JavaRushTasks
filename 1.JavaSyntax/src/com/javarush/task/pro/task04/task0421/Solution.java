package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <=100){
            if (x%2==0){
                sum += +x;

            }
            x++;
        }
        System.out.println(sum);
    }
}