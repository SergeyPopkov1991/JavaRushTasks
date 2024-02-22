package com.javarush.task.jdk13.task35.task3507;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
        HashMap<Object, Integer> hashMap = newHashMap(newArrayList("first", "second"), newArrayList(1, 2));
    }

    public static <T> List<T> newArrayList(T... elements) {

        return Arrays.asList(elements);
    }

    public static <T> Set<T> newHashSet(T... elements) {
//        HashSet<T> hashSet = new HashSet(Arrays.asList(elements));

        return Set.of(elements);
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) throw new IllegalArgumentException();

        return IntStream.range(0, keys.size()).boxed().collect(Collectors.toMap(keys::get, values::get, (a, b) -> b, HashMap::new));
    }
}

