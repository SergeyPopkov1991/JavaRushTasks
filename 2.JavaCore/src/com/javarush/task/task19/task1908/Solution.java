package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();
        String fileName1 = bufferedReader.readLine();

        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(fileName))) {
            while (inputFileReader.ready()) {
               list.add(inputFileReader.readLine());
            }
        }

        try(BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(fileName1))) {
            for (String line : list) {
                String[] splitLine =  line.trim().split(" ");
                for (String word : splitLine) {
                    try {
                        int num = Integer.parseInt(word);
                        outputFileWriter.write(word + " ");
                    } catch (Exception e) {

                    }
                }
            }
        }
        bufferedReader.close();

    }
}
