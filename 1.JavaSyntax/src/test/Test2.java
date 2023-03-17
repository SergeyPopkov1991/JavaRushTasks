package test;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
       /* String string = "Привет , как дела ?";

        for (int i = string.length() - 1; i >= 0 ; i--) {
           char symbol = string.charAt(i);
            System.out.print(symbol);

        }*/
        Random random = new Random();


        int[] array = new int[10];

        for (int i = 0; i < array.length ; i ++) {
            array[i] = random.nextInt(0,10);
        }

        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i =0 ; i < array.length ; i++ ){
            if (array[i] % 2 ==0) {
                sum = sum + array[i];



            }

        }
        System.out.println(sum);
    }
}
