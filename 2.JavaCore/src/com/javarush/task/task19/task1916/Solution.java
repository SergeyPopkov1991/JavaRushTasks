package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();


    public static void main(String[] args) throws IOException {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader1 = new BufferedReader(new FileReader(console.readLine()));
             BufferedReader reader2 = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader1.ready()) {
                list1.add(reader1.readLine());

            }

            while (reader2.ready()) {
                list2.add(reader2.readLine());
            }


        }

        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.get(0).equals(list2.get(0))) {
                lines.add(new LineItem(Type.SAME , list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            } else if (list1.get(0).equals(list2.get(1))) {
                lines.add(new LineItem(Type.ADDED , list2.get(0)));
                list2.remove(0);
            } else if (list1.get(1).equals(list2.get(0))) {
                lines.add(new LineItem(Type.REMOVED , list1.get(0)));
                list1.remove(0);
            }
        }
        if (list1.isEmpty()) {
            list2.forEach(string -> lines.add(new LineItem(Type.ADDED , string)));
        }

        if (list2.isEmpty()) {
            list1.forEach(string -> lines.add(new LineItem(Type.ADDED , string)));
        }


        lines.forEach(System.out::println);


    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;



        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}
