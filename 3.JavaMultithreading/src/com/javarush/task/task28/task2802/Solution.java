package com.javarush.task.task28.task2802;

import java.text.Format;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/

public class Solution {

    public static void main(String[] args) {
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory {
        static AtomicInteger fabricNumber = new AtomicInteger(1);
        AtomicInteger threadNumber = new AtomicInteger(1);
        ThreadGroup group ;
        String nameFormat;


        public AmigoThreadFactory() {
            group = Thread.currentThread().getThreadGroup();
            nameFormat = String.format("%s-pool-%s-thread-" ,  group.getName() , fabricNumber.getAndIncrement());
        }


        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable , nameFormat + threadNumber.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(Thread.NORM_PRIORITY);


            return thread;
        }
    }
}
