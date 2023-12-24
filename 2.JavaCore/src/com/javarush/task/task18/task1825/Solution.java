package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> map = new TreeMap<>();

        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String fileName = bfr.readLine();
                if (fileName.equals("end")) break;
                String number = fileName.substring(fileName.lastIndexOf("t") + 1);
                int index = Integer.parseInt(number);
                if (!map.containsKey(index)) map.put(index, fileName);


            }

        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String fileName = entry.getValue();
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(shortName , true))) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read());
                }
            }

        }
    }
}
