package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {
    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb , CanRun {
        @Override
        public void run() {

        }

        @Override
        public void climb() {

        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
        @Override
        public void climb() {
            super.climb();
        }

        @Override
        public void run() {
            super.run();
        }
    }

    public class Duck implements CanFly , CanRun {
        @Override
        public void run() {

        }

        @Override
        public void fly() {

        }
    }
}
