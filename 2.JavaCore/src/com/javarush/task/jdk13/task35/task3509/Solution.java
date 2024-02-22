package com.javarush.task.jdk13.task35.task3509;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/* 
Wildcards для коллекций
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static Double sum(List<? extends Number> list) {
//        double result = 0.0;
//        for (Number numb : list) {
//            result += numb.doubleValue();
//        }
//        return result;
        return list.stream().mapToDouble(number -> number.doubleValue()).sum();
    }

    public static Double multiply(List<? extends Number> list) {
//        double result = 1.0;
//        for (Number number : list) {
//            result *= number.doubleValue();
//        }
        return list.stream().mapToDouble(number -> number.doubleValue()).reduce(1.0 , (a,b) -> a * b);
    }

    public static String concat(List<?> list) {
//        StringBuilder builder = new StringBuilder();
//        for (Object obj : list) {
//            builder.append(obj);
//        }
        return list.stream().map(object -> object.toString()).collect(Collectors.joining());
    }

    public static <T> List<T> combine(List<? extends Collection<T>> list) {
//        List<T> result = new ArrayList<>();
//        for (Collection<T> ts : list) {
//
//            result.addAll(ts);
//        }
        return list.stream().flatMap(collection -> collection.stream()).toList();
    }
}
