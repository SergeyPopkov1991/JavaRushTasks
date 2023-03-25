package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondmin =  Integer.MAX_VALUE;

        while (scanner.hasNextInt()){
           int tmp = scanner.nextInt();
           if (tmp < min){
               secondmin = min;
               min = tmp;

           }else if (tmp > min && tmp < secondmin){
               secondmin = tmp;
           }

        }
        System.out.println(secondmin);

    }
}