package com.YuraPracticeTasks;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
counter(); // dont work
    }


    public static void counter(){
//        Задача 1.4 от себя.
//        Меня в университете учили считать так 1 2 3 а дальше много.
//        я был умным и считал до 10.
//        И так - досчитай до 10 от введенного числа. если число больше 10, выводишь надпись "много".
//        если меньше 1 выводишь надпись "мало 1 2 3 4 5 6 7 8 9 10 много".
//        Например вводишь число 4, на выводе получаешь -> 4 5 6 7 8 9 10 много.
//        И напоминаю - используем свитч. Приятного горения пердака)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        switch (num){
            case 1:
                if (num > 10){
                    System.out.println(" to much ");
                } else if (num < 1) {
                    System.out.println(" little ");
                }
                break;
           case 2:
                for (int i = 0; i <= 10; i++) {
                    if (i == num){
                        i++;
                        System.out.println(i);
                    }
                }break;
            default:
                System.out.println(" something wrong");
        }
    }


public static void month(){
//    Задача 1.2.//
//            В текущей задаче необходимо, чтобы пользователь задавал наименование месяца,
//            а программа выдавала номер месяца. Выводимый на экран текст должен быть примерно таким:
//            "Номер месяца наименование месяца - номер месяца".
//            Если наименование месяца введено не верно, должно быть выведено на экран соответствующее сообщение.

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter month: ");
    String month = scanner.nextLine();
    // January, February, March, April, May, June, July, August, September, October, November, December.
    switch (month){
        case "January" -> System.out.println("1, January ");
        case "February" -> System.out.println("2 February");
        case "March" -> System.out.println("3 March");
        case "April" -> System.out.println("4 April");
        case "May" -> System.out.println("5 May");
        case "June" -> System.out.println("6, June");
        case "July" -> System.out.println("7, July");
        case "August" -> System.out.println("8, August");
        case "September" -> System.out.println("9, September");
        case "October" -> System.out.println("10, October");
        case "November" -> System.out.println("11, November");
        case "December" -> System.out.println("12, December");
        default -> System.out.println(" mistake data");
    }


}
}
