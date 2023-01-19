package com.tasksFromMentors;

import java.util.HashMap;
import java.util.Map;

/**
 * Клас Phone
 * Створити клас Phone, який містить змінні number, model, weight
 * Створити три екземпляри цього класу
 * Вивести у консоль значення їх змінних
 * Додати у клас Phone методи: receiveCall, який приймає один параметр - імʼя того хто звонить.
 * Виводить у консоль сповіщення “{name} is calling”.
 * getNumber - повертає номер телефону.
 * Викликати ці методи для кожного з обʼєктів.
 * <p>
 * <p>
 * <p>
 * Додати конструктор у клас Phone, який приймає на вхід три параметри для ініціалізації змінних класу - number, model, weight.
 * Додати конструктор у клас Phone, який приймає на вхід два параметри для ініціалізації змінних класу - number, model
 * Додати конструктор без параметрів.
 * Викликати з конструктора з трьома параметрами конструктор з двома.
 * Додати перегружений метод receiveCall, який приймає два параметри - імʼя людини яка телефонує і
 * номер телефону людини яка телефонує. Викликати цей метод.
 */

public class Phone {
    private int number;
    private int model;
    private double weight;


    public Phone() {
    }

    public Phone(int number, int model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, double weight, int model) {
        //this.number = number;
        //this.model = model;
        this(number, model);
        this.weight = weight;
    }

    public Phone(Phone phone, double weight, int model) {
    }

    public int getNumber() {
        return number;
    }

    protected void receiveCall(String callerName) {
        setPhoneBook();
        // my solution:
//        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
//            if (callerName.equals(entry.getKey())) System.out.println(entry.getValue() + " is calling ");
//        }
        // Yura"s explain:
//        фор не нужен!!!!
//        if (phoneBook.containsKey(callerName)) System.out.println(phoneBook.get(callerName));
//        else System.out.println(callerName);

        // idea correction:
        System.out.println(phoneBook.getOrDefault(callerName, callerName));
    }

    protected void receiveCall(String callerName, int callerNumber) {
        System.out.println(callerName + " === " + callerNumber);
    }


    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model=" + model +
                ", weight=" + weight +
                '}';
    }

    private static Map<String, String> phoneBook = new HashMap<>();
    protected static void setPhoneBook() {

        phoneBook.put("+32(097) 258 - 23 - 98", "Vasya first");
        phoneBook.put("+38(097) 258 - 23 - 97", "Vasya second");
        phoneBook.put("+39(097) 258 - 23 - 99", "Vasya third");
        phoneBook.put("+31(097) 258 - 23 - 93", "Vasya four");
        phoneBook.put("+35(097) 258 - 23 - 91", "Vasya fifth");
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone(1, 0.222, 11111);
        Phone phone2 = new Phone(2, 0.333, 22222);
        Phone phone3 = new Phone(3, 0.444, 33333);

//        phone1.receiveCall("Petya", 5551110);
//        phone2.receiveCall("Vasya");
        phone3.receiveCall("+32(097) 258 - 23 - 98");
        phone2.receiveCall("+35(097)  - 23 - 91");

        // infoPhone(phone1, phone2, phone3);
    }

    private static void infoPhone(Phone... phones) {
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }

}
