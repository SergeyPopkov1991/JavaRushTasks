package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest [] javarushQuests =JavarushQuest.values();
        for (JavarushQuest j:javarushQuests
             ) {
            System.out.println(j.ordinal());
        }
        ;
    }
}
