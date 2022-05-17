package com.tasksOfYarik;

public class sevenLastnumber {
    public static void main(String[] args) {

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
