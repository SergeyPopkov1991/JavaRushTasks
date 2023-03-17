package test;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int secondMin = scanner.nextInt();

        if (secondMin < min) {
            int temp = min;
            min = secondMin;
            secondMin = temp;
        }


        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (min == secondMin && number > secondMin) {
                secondMin = number;
            } else if (number < min) {
                secondMin = min;
                min = number;
            } else if (number > min && number < secondMin) {
                secondMin = number;

            }
        }
        System.out.println(secondMin);
    }
}
