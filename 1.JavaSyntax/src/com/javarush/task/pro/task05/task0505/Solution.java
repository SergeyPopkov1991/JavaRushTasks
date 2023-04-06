package com.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] M = new int[N];
        for (int i = 0 ; i < N ; i ++) {
            M[i] = scanner.nextInt();
        }
            if (N % 2 == 0){
                for (int i = M.length -1 ; i >= 0 ; i-- ){
                    System.out.println(M[i]);
                }
            } else {
                for (int i = 0 ; i < M.length; i++)
                System.out.println(M[i]);
            }
        }



    }

