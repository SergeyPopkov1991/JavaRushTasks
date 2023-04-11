package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] M = new int[N];
        for (int i = 0 ; i < N ; i ++) {
            M[i] = scanner.nextInt();
        }
            int min = 0  ;
        if( M[N] >  min){
            min = M[N];

        }
        System.out.println(min);
    }
}


