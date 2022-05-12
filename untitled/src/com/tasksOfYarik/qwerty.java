package com.tasksOfYarik;

import java.util.Scanner;

public class qwerty {
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
            System.out.println("flor num: " + flor);
            }
        else {int flo = flor + 1;
            System.out.println("flor NUM: " + flo);
        }





        /*
        int flor2 = flatNum / 3 - 1;


        int res2 = flor2--;
        System.out.println("flor num: " + res2);
        int flor3 = flatNum / 3 - 2;
        int res3 = flor3--;
        System.out.println("flor num: " + res3);

/*
        int [] flor = new int[100];
        for (int i = 1; i < flor.length ; i++) {
            if (i % 3 == 0)
                System.out.println("flor num: " + i);
        }
/*
        int[] flatRight = new int[52];
        for (int i = 1; i < flatRight.length; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
        int[] flatMiddle = new int[51];
        for (int j = 2; j < flatMiddle.length; j++) {
            if (j % 3 == 2) {
                System.out.print(j + " ");
            }
        }
        System.out.println("\n");
        int[] flatLeft = new int[50];
        for (int q = 1; q < flatLeft.length; q++) {
            if (q % 3 == 1) {
                System.out.print(q + " " );
            }
        }
        System.out.println("\n");

 */
    }

}




//* Задание 9.5* (тут вродь как без составного ифа, но задачка со звездочеойю. На пошевелить мозгами)
//        * На каждом этаже многоэтажного дома расположены три квартиры;
//        счет квартир идет слева направо.
//        * Например, на первом этаже квартира No 1 расположена слева, квартира No 2 -в центре, квартира No 3 - справа,
//        * и так далее. Напишите класс, который принимает с клавиатуры номер квартиры и выводит на экран следующую информацию:
//        * на каком этаже она расположена, и какое место (слева, справа или в центре) она занимает на этом этаже.


/*

int flor = flatNum / 3 ;
int flor1 = flor - 1
31 32 33
28 29 30
25 26 27
22 23 24
19 20 21
16 17 18
13 14 15
10 11 12
7  8  9
4  5  6
1  2  3

30 / 3
- 1 =
 */
