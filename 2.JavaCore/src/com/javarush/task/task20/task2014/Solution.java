package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException , ClassNotFoundException {

        Solution savedObject = new Solution(4);
        System.out.println("savedObject.pattern = " + savedObject.pattern);
        System.out.println("savedObject.currentDate = " + savedObject.currentDate);
        System.out.println("savedObject.temperature = " + savedObject.temperature);
        System.out.println("savedObject.string = " + savedObject.string);
        System.out.println("savedObject = " + savedObject);

        System.out.println("Сериализация");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\1.txt"));
        oos.writeObject(savedObject);

        System.out.println("Десериализация");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\1.txt"));
        Solution newObject = (Solution) ois.readObject();
        System.out.println("newObject.pattern = " + newObject.pattern);
        System.out.println("newObject.currentDate = " + newObject.currentDate);
        System.out.println("newObject.temperature = " + newObject.temperature);
        System.out.println("newObject.string = " + newObject.string);
        System.out.println("newObject = " + newObject);
    }


    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
