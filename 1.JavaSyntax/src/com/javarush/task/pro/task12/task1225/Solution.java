package com.javarush.task.pro.task12.task1225;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Аккаунт ИнстаМатрицы
*/

public class Solution {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
       convertAccounts();
       registerAccount("Амиго");
       registerAccount("Диего");

        accountsList.forEach(System.out::println);
    }

    public static void convertAccounts() {
      String [] accounts = Accounts.getAccounts();
      accountsList.addAll(Arrays.asList(accounts));

    }

    public static void registerAccount(String username) {
       if (!accountsList.contains(username)) {
           accountsList.add(username);
       }
    }
}