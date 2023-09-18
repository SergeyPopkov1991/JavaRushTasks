package com.javarush.task.pro.task18.task1805;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

        public int compare(String i1, String i2) {
            return i1.length() - i2.length();
        }
    };

