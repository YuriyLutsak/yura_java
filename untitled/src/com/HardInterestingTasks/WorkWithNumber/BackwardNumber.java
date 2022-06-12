package com.HardInterestingTasks.WorkWithNumber;

public class BackwardNumber {
    //                                  456789

//        int val3 =  val % 10;          // 9
//        int val2 =  val / 10 % 10;     // 45678
//        int val1 =  val / 100 % 10;    // 4567
//
//        int val0 =  val / 1000 % 10;   // 456
//
//        int val01 = val / 10000 % 10;  // 45
//        int val02 = val / 100000 % 10; // 4
//        int val03 = val / 1000000;     // 0

    public static void main(String[] args) {
        int value = 123456789;
        int temp;
        int division = 1;
        while (value / division != 0) {
            temp = (value / division) % 10;
            division = division * 10;

            System.out.print(temp + " ");
        }



//  разделение числа
//        int value = 123456789;
//        int temp;
//        int division = 100000000;
//        while (value / division != 0) {
//            temp = (value / division) % 10;
//            division = division / 10;
//            System.out.print(temp + " ");
//        }
    }
}
