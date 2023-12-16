package com.javarush.task.task17.task1711;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        Person person = null;
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        switch (args[0]) {
            case ("-c") -> {
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i += 3) {

                        if (args[i + 1].equals("м")) {
                            person = Person.createMale(args[i], input.parse(args[i + 2]));

                        } else if (args[i + 1].equals("ж")) {
                            person = Person.createFemale(args[i], input.parse(args[i + 2]));
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
            }
            case ("-u") -> {
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i += 4) {

                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            person.setName(args[i + 1]);
                            if (args[i + 2].equals("м")) {
                                person.setSex(Sex.MALE);
                            } else if (args[i + 2].equals("ж")) {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDate(input.parse(args[i + 3]));
                        }
                    }
                }
            }
            case ("-d") -> {
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {

                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                }
            }
            case ("-i") -> {
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                            String format = output.format(person.getBirthDate());
                            System.out.println(person.getName() + " " + sex + " " + format);
                        }
                    }
                }
            }
        }

    }
}
