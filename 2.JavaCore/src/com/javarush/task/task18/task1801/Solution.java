package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        int maxByte = 0;

        try (FileInputStream fileInputStream = new FileInputStream(string)) {
            while (fileInputStream.available() > 0) {
                int currByte = fileInputStream.read();
                if (currByte > maxByte) maxByte = currByte;
            }
        }
        System.out.println(maxByte);
    }
}
