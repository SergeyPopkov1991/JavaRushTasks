package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bfr = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new TreeMap<>();
            while (bfr.ready()) {
                String line = bfr.readLine();
                String[] split = line.split(" ");
                String key = split[0];
                Double value = Double.parseDouble(split[1]);
                if (map.containsKey(key)) {
                    double newValue = map.get(key) + value;
                    map.put(key, newValue);
                } else {
                    map.put(key, value);

                }
//                map.merge(key,value,Double::sum);
            }
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
