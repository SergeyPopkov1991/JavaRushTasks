package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String template = "0123456789" + alphabet + alphabet.toUpperCase();

        char [] passwords = new char[8];
        String password = "";

        while (!password.matches(".*\\d.*") ||
                !password.matches(".*[a-z].*") ||
                !password.matches(".*[A-Z].*")) {

            for (int i = 0; i < passwords.length; i++) {
                passwords[i] = template.charAt(new Random().nextInt(template.length()));
            }
            password = new String(passwords);
        }


        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

            outputStream.write(password.getBytes());
            return outputStream;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
