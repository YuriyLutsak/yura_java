package com.tasksFromMentors;

/**
 * Створити клас Calculator і в ньому створити метод
 * public void calculate (int number),
 * який в залежності від того парна чи не парна цифра передана в нього буде виводити різні повідомлення у консоль.
 * <p>
 * Умовна конструкція switch:
 * У клас Calculator додати метод calculateSwitch(int number)
 * який буде всередині використовувати конструкцію switch
 * і в залежності від того парна чи не парна цифра прийде у метод,
 * потрібно виводити різні повідомлення у консоль.
 * Приклад:  1 - "turn on", 2 - "pause", 3 - turn down".
 */

/**
 * Умовна конструкція switch:
 * У клас Calculator додати метод calculateSwitch(int number)
 * який буде всередині використовувати конструкцію switch
 * і в залежності від того парна чи не парна цифра прийде у метод,
 * потрібно виводити різні повідомлення у консоль.
 * Приклад:  1 - "turn on", 2 - "pause", 3 - turn down".
 */

/**
 * Умовна конструкція з тернарним оператором:
 * Створити у класі Calculator метод calculateTernary(int number)
 * який повинен робити те ж саме що метод calculate але при цьому використовувати тернарний умовний оператор.
 * Приклад: 1 - “Odd number: 1”, 2 - “Even number: 2”.
 */

public class Calculator {

    protected static final String UNPAIR_NUMBER = " number is unpair ";
    protected static final String PAIR_NUMBER = " number is pair ";

    public static void main(String[] args) {

//        calculate(5);
//        calculate(6);
//        calculateSwitch(10);
//        calculateSwitch(11);
//        calculateTernary(11);
//        calculateTernary(10);
    }

    protected static String calculate(int number) {
        if (number % 2 == 0)
            return PAIR_NUMBER;
        return UNPAIR_NUMBER;
    }

    protected static void calculateSwitch(int number) {

        if (number % 2 != 0) number = 1;
        else number = 2;

        switch (number) {
            case 1 -> System.out.println(UNPAIR_NUMBER);
            case 2 -> System.out.println(PAIR_NUMBER);
            default -> throw new IllegalStateException("Unexpected value: " + number);
        }

    }

    protected static void calculateTernary(int number) {
        String str = number % 2 == 0 ? PAIR_NUMBER : UNPAIR_NUMBER;
        System.out.println(str);
    }
}
