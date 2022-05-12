package com.tasksOfYarik;

import java.util.Scanner;

public class flor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter flat number");
        int flatNum = scan.nextInt();

        if (flatNum % 3 == 0) {
            System.out.println(flatNum + " " + "right");
        }
        if (flatNum % 3 == 2){
            System.out.println(flatNum + " " +"middle");
        }
        if (flatNum % 3 == 1){
            System.out.println(flatNum +" " + "left");
        }

        int flor = flatNum / 3;
        if (flor == 0) {
            System.out.println("flor num: " + flor); // ТУПО ИГНОРИТ ЭТУ СТРОКУ КОДА!!!
        }
        else {int flo = flor + 1;
            System.out.println("flor NUM: " + flo);
        }

    }
}
