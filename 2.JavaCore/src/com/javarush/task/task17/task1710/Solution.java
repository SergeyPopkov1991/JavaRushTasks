package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }


    public static void main(String[] args) throws ParseException {
        Person person = null;
        SimpleDateFormat input = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat output = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if (args[0].equals("-c")) {
            if (args[2].equals("м")) {
               person = Person.createMale(args[1] , input.parse(args[3]));

            } else if (args[2].equals("ж")) {
                person = Person.createFemale(args[1] , input.parse(args[3]));
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        } else if (args[0].equals("-r")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                String format = output.format(person.getBirthDate());
                System.out.println(person.getName() + " " + sex + " " + format);
            }

        } else if (args[0].equals("-u")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                person.setName(args[2]);
                if (args[3].equals("м")){
                    person.setSex(Sex.MALE);
                } else if (args[3].equals("ж")) {
                    person.setSex(Sex.FEMALE);
                }
                person.setBirthDate(input.parse(args[4]));
            }

        } else if (args[0].equals("-d")) {
            int id = Integer.parseInt(args[1]);
            if (id >= 0 && id < allPeople.size()) {
                person = allPeople.get(id);
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
            }

        }


    }
}
