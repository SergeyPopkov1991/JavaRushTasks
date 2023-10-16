package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();
        String string1 = reader.readLine();

        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(string));
        ){
                while (bufferedReader.ready()) {
                    list.add(bufferedReader.readLine());
                }
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(string1))) {
            for (String s : list) {
                bufferedWriter.write(s.replaceAll("\\." , "!" ));
            }
        }
        reader.close();
    }
}
