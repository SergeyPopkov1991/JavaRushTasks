package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && a == c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }else if (a ==b && a != c){
            System.out.println(a);
            System.out.println(b);

        }else if(a != b && a ==c && b !=c) {
            System.out.println(a);
            System.out.println(c);
        }
        else if (b ==c ){
            System.out.println(b);
            System.out.println(c);

        }

    }
}
