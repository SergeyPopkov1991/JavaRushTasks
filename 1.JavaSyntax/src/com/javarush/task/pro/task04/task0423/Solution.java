package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int i ;
        for ( i = 0 ; i <=5 ; i ++){
           int midle = (x + y + z + b+ c)/5;
            System.out.println(midle);
        }


    }
}
