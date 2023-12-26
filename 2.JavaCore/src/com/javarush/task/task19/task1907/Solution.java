package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader(bfr.readLine()))) {
//            int count = 0;
//            while (reader.ready()) {
//                String string = reader.readLine();
//                String replace = string.replaceAll("\\p{P}", " ");
//                String[] strings = replace.split(" ");
//                for (String str : strings) {
//                    if (str.equals("world")) count++;
//
//                }
//            }
//            System.out.println(count);
//
//        }
        System.out.println(Arrays.stream(Files.readString(Paths.get(new Scanner(System.in).nextLine())).replaceAll("\\p{P}", " ").split(" "))
                .filter(str -> str.equals("world")).count());

    }
}
