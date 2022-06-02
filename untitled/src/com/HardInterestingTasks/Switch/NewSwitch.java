package com.HardInterestingTasks.Switch;

import java.util.Scanner;

public class NewSwitch {
    public static void main(String[] args) {

    }
    public static void timeOfYearSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month");
        int month = scanner.nextInt();

        switch (month){
            case 1,2,12 -> System.out.println("winter");
            case 3,4,5 -> System.out.println("spring");
            case 6,7,8 -> System.out.println("summer");
            case 9,10,11 -> System.out.println("autumn");
            default -> System.out.println("such month is doesn't exist");
        }
    }
}
