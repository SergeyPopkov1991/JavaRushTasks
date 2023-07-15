package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException  {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        try (InputStream inputStream = Files.newInputStream(Paths.get(fileName1));
        OutputStream outputStream = Files.newOutputStream(Paths.get(fileName2))) {
            byte[] bytesIn = inputStream.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];
            for (int i = 0; i < bytesIn.length; i+=2) {
                if (i < bytesIn.length -1) {

                    bytesOut[i] = bytesIn[i+1];
                    bytesOut[i+1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }

            }

            outputStream.write(bytesOut);

        }

    }
}

