package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        Map<Character , Integer> map = new TreeMap<>();
//        try (FileReader reader = new FileReader(args[0])) {
//            while (reader.ready()) {
//                char read =(char) reader.read();
//                if (!map.containsKey(read)) {
//                    map.put(read , 1);
//
//                } else {
//                    map.put(read , map.get(read) + 1);
//                }
//            }
//        }
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        Files.readString(Paths.get(args[0])).chars().boxed()
                .collect(Collectors.toMap(aChar -> (char) (aChar.intValue()), aChar -> 1, Integer::sum, TreeMap::new))
                .forEach((key, value) -> System.out.println(key + " " + value));

    }
}
