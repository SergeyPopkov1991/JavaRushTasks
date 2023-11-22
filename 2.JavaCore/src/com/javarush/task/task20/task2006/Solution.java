package com.javarush.task.task20.task2006;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Как сериализовать?
*/

public class Solution {
    public static class Human implements Serializable {
        public String name;
        public List<String> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, String... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
        public void save(PrintWriter writer) throws Exception {
            writer.println(name);
            writer.println(assets);
            writer.flush();
        }

        public void load(BufferedReader reader) throws Exception {
            name = reader.readLine();
            assets = Collections.singletonList(reader.readLine());


        }
    }

    public static void main(String[] args) {

    }
}
