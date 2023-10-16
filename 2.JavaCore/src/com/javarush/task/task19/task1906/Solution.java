package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String string = buffer.readLine();
        String string1 = buffer.readLine();

        ArrayList<Integer> list = new ArrayList<Integer>();
       try(FileReader reader = new FileReader(string);
       FileWriter writer = new FileWriter(string1)) {
           while (reader.ready()) {
               list.add(reader.read());
           }
           for (int i = 1; i < list.size(); i = i + 2) {
               writer.write((byte) (int) list.get(i));
           }

       }
    buffer.close();
    }
}
