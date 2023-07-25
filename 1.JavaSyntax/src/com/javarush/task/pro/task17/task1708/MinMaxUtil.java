package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код

    public static int min(int n, int v) {
        return Math.min(n, v);
    }

    public static int min(int n, int m, int v) {
        return min(n, min(m, v));
    }

    public static int min(int n, int m, int b, int v) {
        return min(n, min(m, b, v));
    }

    public static int min(int n, int m, int b, int d, int v) {
        return min(n, min(m, b, d, v));
    }

    public static int max ( int a , int b) {
        return Math.max(a , b);
    }

    public static int max(int n, int m, int v) {
        return max(n, max(m, v));
    }

    public static int max(int n, int m, int b, int v) {
        return max(n, max(m, b, v));
    }

    public static int max(int n, int m, int b, int d, int v) {
        return max(n, max(m, b, d, v));
    }




}


