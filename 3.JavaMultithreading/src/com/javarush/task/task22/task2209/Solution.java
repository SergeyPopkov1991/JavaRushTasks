package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] strings = null;
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                String readLine = reader.readLine();
                strings = readLine.split(" ");
            }
        }


        StringBuilder result = getLine(strings);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (Objects.isNull(words)  || words.length ==0) return new StringBuilder();

        List<StringBuilder> builderList = new ArrayList<>();
        for (String word : words) {

            StringBuilder first = new StringBuilder(word);

            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);
            int count = 0;
            while (!list.isEmpty()) {
                String firstStart = first.substring(0, 1);
                String firstEnd = first.substring(first.length() - 1);
                String second = list.get(0);
                String secondStart = second.substring(0, 1);
                String secondEnd = second.substring(second.length() - 1);
                if (firstStart.equalsIgnoreCase(secondEnd)) {
                    first.insert(0, second + " ");
                    list.remove(0);
                } else if (firstEnd.equalsIgnoreCase(secondStart)) {
                    first.append(" ").append(second);
                    list.remove(0);
                } else {
                    list.remove(0);
                    list.add(second);
                    count++;
                    if (count > Math.pow(words.length, 2)) {
                        break;
                    }
                }
            }
            builderList.add(first);

        }
        return builderList.stream().max(Comparator.comparingInt(a -> a.length())).get();
    }
}
