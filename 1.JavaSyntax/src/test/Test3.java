package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        String[] strings = new String[6];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();

        }
        for (int i = 0; i < strings.length - 1; i++) {
            String str = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (str == null) {
                    break;
                }
                if (str.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
