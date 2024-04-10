package com.javarush.task.task26.task2607;

/* 
Вежливость - это искусственно созданное хорошее настроение
*/

public class Solution {
    public static void main(String[] args) {
        Task task1 = new Task();
        Task task2 = new Task();

    }


    private static int value;

    public static  int get() {
        return value;
    }

    public static  void set(int value) {
        Solution.value = value;
    }


    public static class Task extends Thread {

        public Task() {
            start();
        }

        @Override
        public void run() {
            System.out.println(Solution.get());
            for (int i = 0; i < 1000 ; i++) {
                Solution.set(Solution.get() + 1);
            }
            System.out.println(Solution.get());
        }
    }
}