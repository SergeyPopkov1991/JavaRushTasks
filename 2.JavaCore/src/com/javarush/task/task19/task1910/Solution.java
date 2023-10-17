package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filName1 = bufferedReader.readLine();
        String filName2 = bufferedReader.readLine();


        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filName1))) {
            while (reader.ready()){
                list.add(reader.readLine());
            }
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filName2))) {
            for (String word : list) {
                writer.write(word.replaceAll("\\p{Punct}" , ""));
            }
        }
        bufferedReader.close();
    }
}
