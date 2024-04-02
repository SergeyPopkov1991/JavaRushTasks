package com.javarush.task.task25.task2510;

/* 
Поживем - увидим
*/

public class Solution extends Thread {

    public Solution() {
        this.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                String message = null;
                if (e instanceof Error) message = "Нельзя дальше работать";
                else if (e instanceof Exception) message = "Надо обработать";
                else if (e instanceof Throwable) message = "Поживем - увидим";
                System.out.println(message);

            }
        });
    }

    public static void main(String[] args) {
    }
}
