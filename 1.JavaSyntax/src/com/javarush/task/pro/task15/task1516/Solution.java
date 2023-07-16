package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       while (true) {
           String name = scanner.nextLine();
           if (name.isEmpty()) {
               break;
           }
            if (Files.isRegularFile(Path.of(name))) {
                System.out.println(name + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(name))) {
                System.out.println(name + THIS_IS_DIR);

            } else {
                break;
            }
       }

    }
}

