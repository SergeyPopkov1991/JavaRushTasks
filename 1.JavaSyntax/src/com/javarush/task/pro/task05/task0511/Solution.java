package com.javarush.task.pro.task05.task0511;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < multiArray.length ; i++) {
            int a = scanner.nextInt();
            multiArray[i] = new int[a];

        }

        System.out.println(Arrays.deepToString(multiArray));
    }
}
