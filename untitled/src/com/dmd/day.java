package com.dmd;

import java.util.Scanner;

public class day {
    public static void main(String[] args) {

       day();

    }
public  static void day() {

    Scanner scanner1 = new Scanner(System.in);
    System.out.println(" Enter hour: ");
    int hour = scanner1.nextInt();

    switch (hour) {
        case 6, 7, 8, 9, 10 -> System.out.println(hour + " " + "morning");
        case 11, 12, 13, 14, 15, 16, 17, 18 -> System.out.println(hour + " " + "day");
        case 19, 20, 22 -> System.out.println(hour + " " + "evening");
        case 23, 0, 1, 2, 3, 4, 5 -> System.out.println(hour + " " + "night");
        default -> System.out.println("there is no such hour in a day");
    }

}
}
