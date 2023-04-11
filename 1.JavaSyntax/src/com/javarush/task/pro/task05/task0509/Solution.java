package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

import java.util.Arrays;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE = new int [10][10];

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {


            for (int j = 0; j < 10; j++) {
                MULTIPLICATION_TABLE [i][j] = (i +1 ) * (j+ 1);
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }


    }
}
