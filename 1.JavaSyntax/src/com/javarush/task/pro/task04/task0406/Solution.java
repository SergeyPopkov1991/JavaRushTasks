package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String x = "enough";

       while (true) {

          if (name.equals(x)){
              break;

          }
           System.out.println(name);
          break;
       }

    }
}