package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(5);
        list.remove(0);
        list.remove(Integer.valueOf(5));
        list.get(0);
        list.add(1 , 3);
        list.set(2 , 48);
    }
}
