package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String output = reader.readLine();

        try (FileInputStream inputStream = new FileInputStream(input);
        FileOutputStream outputStream = new FileOutputStream(output)) {

            List<Integer> inputbytes = new ArrayList<>();
            while (inputStream.available() > 0) {
                inputbytes.add(inputStream.read());
            }
            Collections.reverse(inputbytes);
            for (Integer inputbyte : inputbytes) {
                outputStream.write(inputbyte);
            }

        }
    }
}
