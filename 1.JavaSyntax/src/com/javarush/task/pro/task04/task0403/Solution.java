package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        int n = 0 ;
        boolean enter = false;
        while (n<=x){
            sum = sum + x;
            System.out.println(sum);



        }

    }
}