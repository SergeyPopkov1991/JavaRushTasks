package com.javarush.task.task19.task1915;

import java.io.*;
import java.nio.file.Files;

/* 
Дублируем текст
*/

public class Solution  {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();

        FileOutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.close();

        System.setOut(defaultPrintStream);
        System.out.println(byteArrayOutputStream.toString());
    }



    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

