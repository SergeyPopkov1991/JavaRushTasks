package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String fileName1 = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream inputStream = new FileInputStream(fileName) ;
        FileInputStream inputStream1 = new FileInputStream(fileName1)) {
            while (inputStream1.available() > 0 ){
                byteArrayOutputStream.write(inputStream1.read());
            }
            while (inputStream.available() > 0) {

                byteArrayOutputStream.write(inputStream.read());
            }

        }
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            byteArrayOutputStream.writeTo(outputStream);
        }
    }
}
