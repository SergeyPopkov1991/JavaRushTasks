package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        try(BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while (in.ready()) {
                String readString = in.readLine();
                String[] split = readString.split(" ");

                int wordCount = 0;
                for (String string : split) {
                    if (words.contains(string)){
                        wordCount++;
                    }
                }
                if (wordCount == 2 ) {
                    System.out.println(readString);
                }
            }
        }
        reader.close();
    }
}
