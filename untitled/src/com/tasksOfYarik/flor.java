package com.tasksOfYarik;

import java.util.Scanner;

public class flor {
    public static void main(String[] args) {
        //placeOfFlat();
        // placeOfFlatMy();
        sum();

    }

    public static void placeOfFlat() {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter flat number");
        int flatNum = scan.nextInt();

        String left = "left";
        String middle = "middl";
        String right = "right";

        int positionOfFlatOnFlor = flatNum % 3;
        int flor = flatNum / 3 + 1;

        if (positionOfFlatOnFlor == 0) {
            System.out.println(flor - 1 + " flor" + " " + right);
        } else if (positionOfFlatOnFlor == 1) {
            System.out.println(flor + " flor" + " " + left);
        } else {
            System.out.println(flor + " flor" + " " + middle);
        }
    }


    public static void placeOfFlatMy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter flat number");
        int flatNumMy = scanner.nextInt();

        if (flatNumMy % 3 == 0) {
            System.out.println(flatNumMy + " " + "right");
        }
        if (flatNumMy % 3 == 2) {
            System.out.println(flatNumMy + " " + "middle");
        }
        if (flatNumMy % 3 == 1) {
            System.out.println(flatNumMy + " " + "left");
        }

        int florMy = flatNumMy / 3 + 1;
        if (florMy == 0) {
            System.out.println("flor num: " + florMy); // ТУПО ИГНОРИТ ЭТУ СТРОКУ КОДА!!!
        } else {
            int flo = florMy + 1;
            System.out.println("flor NUM: " + flo);
        }
    }

    public static void placeOfFlatMyReplace() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter flat number");
        int flatNumMy = scanner.nextInt();

        if (flatNumMy % 3 == 0) {
            System.out.println(flatNumMy + " " + "right");
        } else if (flatNumMy % 3 == 1) {
            System.out.println(flatNumMy + " " + "left");
        } else {
            System.out.println(flatNumMy + " " + "middle");
        }

        int florMy = flatNumMy / 3 + 1;
        int flo1 = florMy + 1;
        int flo = florMy - 1;

        if (florMy == 0) {
            System.out.println("FLOR NUM: " + flo);
        } else if (florMy == 2) {
            System.out.println("flor num: " + flo); // ТУПО ИГНОРИТ ЭТУ СТРОКУ КОДА!!!
        } else if (florMy == 1) {
            System.out.println("flor NUM: " + florMy);
        }
    }

    public static void sum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter value: ");
        int value = scan.nextInt();

        for (int i = 10; i <= 99; i++) {
            int res = i % 10 + i / 10;
            if (res == value) {
                System.out.println(i);
            }
        }
    }

    public static void seven() {
        for (int i = 107; i <= 997; i = i + 10) {
            System.out.println(i + " ");
        }
    }

    public static void sevenWhile() {
        int start = 107;
        int finish = 997;
        int i = start;

        while (start <= finish) {

            start = start + 10;
            System.out.print(start + " ");
        }
    }
}
