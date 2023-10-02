package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String s = reader.readLine();
       String ss = reader.readLine();
       String sss = reader.readLine();

       try(FileOutputStream inputStream = new FileOutputStream(s) ;
           FileInputStream outputStream = new FileInputStream(ss) ;
           FileInputStream outputStream1 = new FileInputStream(sss)) {
           while (outputStream.available() > 0) {
               inputStream.write(outputStream.read());
           }
           while (outputStream1.available() > 0) {
               inputStream.write(outputStream1.read());
           }


       }
    }
}
