package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();


        String[] split = url.substring(url.lastIndexOf("?") + 1).split("&");
        for (String str : split) {
            if (str.contains("=")) {
                System.out.print(str.substring(0, str.indexOf("=")) + " ");
            } else {
                System.out.print(str + " ");
            }
        }
        System.out.println();

        for (String str : split) {
            if (str.contains("obj")) {
                int index = str.indexOf("=");
                String substring = str.substring(index + 1);
                try {
                    double parseDouble = Double.parseDouble(substring);
                    alert(parseDouble);

                } catch (Exception e) {
                    alert(substring);
                }

            }

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
