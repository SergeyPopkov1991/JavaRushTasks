package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(75);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {


            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        }
        var list = new ArrayList<>();
        list.add("Hello");
        list.add(5);
        String str = (String) list.get(1);

        System.out.println(Arrays.toString(array));
    }

}
