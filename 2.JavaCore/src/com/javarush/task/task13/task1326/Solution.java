package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        FileInputStream stream = new FileInputStream(str);

        for (int i = 0; i < str.length(); i++) {
            if (i%2 == 0){
                System.out.println(i);
            }

        }


    }
}
