package com.HardInterestingTasks.WorkWithNumber;

public class BackwardNumber {
    public static void main(String[] args) {
        int value = 123456789;
        int temp;
        int division = 100000000;
        while (value / division != 0) {
            temp = (value / division) % 10;
            division = division / 10;
            System.out.print(temp + " ");
        }
    }
}
