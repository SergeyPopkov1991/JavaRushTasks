package com.javarush.task.task15.task1529;

import java.io.*;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() throws IllegalArgumentException {
       BufferedReader reader = new BufferedReader( new InputStreamReader(System.in) );
       try {
           String s = reader.readLine();

           if ("plane".equals(s)) {
               s = reader.readLine();
               result = new Plane(Integer.parseInt(s));

           } else if ("helicopter".equals(s)) {
               s = reader.readLine();
               result = new Helicopter();

           }
           reader.close();

       } catch (IOException e)  {
           e.printStackTrace();
       }

    }
}
