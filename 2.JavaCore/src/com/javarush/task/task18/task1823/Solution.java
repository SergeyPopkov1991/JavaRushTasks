package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String fileName = bfr.readLine();
                if (fileName.equals("exit")) break;
                ReadThread readThread = new ReadThread(fileName);
                readThread.start();

            }
        }

    }

    public static class ReadThread extends Thread {

        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            Map<Integer, Integer> map = new HashMap<>();

            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                while (inputStream.available() > 0) {
                    int readByte = inputStream.read();
                    if (!map.containsKey(readByte)) {
                        map.put(readByte, 1);
                    } else {
                        map.put(readByte, map.get(readByte) + 1);
                    }
                }

            } catch (IOException ignore) {

            }

            Integer max = map.values().stream().max(Comparator.naturalOrder()).get();

            map.entrySet().stream().filter(entry -> entry.getValue().equals(max)).findFirst().ifPresent(entry -> resultMap.put(fileName, entry.getKey()));


        }
    }
}
