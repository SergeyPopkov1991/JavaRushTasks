package com.javarush.task.pro.task12.task1227;

/* 
   Ох уж эта жуткая корзина
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static List<Robot> cableContents = new ArrayList<>(Arrays.asList(new Robot("T1000"), new Robot("Amigo"),
            new Robot("B1"), new Robot("Diego"), new Robot("Zed")));

    public static void main(String[] args) {
        rescueRobots();
        emptyGarbageBin();
        printList(rescuedRobots);
    }

    //напишите тут ваш код
    private static List<Robot> rescuedRobots = new ArrayList<>();

    public static void rescueRobots() {
        String amigo = "Amigo";
        String diego = "Diego";
        for (Robot robots : cableContents
        ) {
            if (robots.getName().equals(amigo) || robots.getName().equals(diego)) {
                rescuedRobots.add(robots);
            }


        }
        cableContents.removeIf(o -> o.getName().equals(amigo) || o.getName().equals(diego));

    }

    private static void emptyGarbageBin() {
        cableContents.clear();
        System.out.println("Garbage cleared");
    }

    public static void printList(List<Robot> list) {
        for (Robot o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
