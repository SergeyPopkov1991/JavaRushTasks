package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("янкель", 5.0);
        grades.put("ионин", 5.0);
        grades.put("цыган", 5.0);
        grades.put("купа купыч", 5.0);
        grades.put("боб джонс", 5.0);

    }
}
