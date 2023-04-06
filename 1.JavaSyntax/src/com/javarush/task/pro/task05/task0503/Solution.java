package com.javarush.task.pro.task05.task0503;

/* 
Работаем с элементами массива
*/

public class Solution {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {

            if (array[0]%2==0) {
                array[0] = - array[0];
            }

            if (array[1]%2==0) {
                array[1] = - array[1];
            }

            if (array[2]%2==0) {
                array[2] = - array[2];
            }

            if (array[3]%2==0) {
                array[3] = - array[3];
            }
            if (array[4]%2==0) {
                array[4] = - array[4];
            }
            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
            System.out.println(array[3]);
            System.out.println(array[4]);
        }

    }

