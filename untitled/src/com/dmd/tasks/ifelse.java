package com.dmd.tasks;

public class ifelse {
    public static void main(String[] args) {
        int month = 1;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) { //сокращаем код
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autem");
        } else {
            System.out.println("error");
        }

        // new task определения высокосного года с условием: year % 400 == 0 || year % 4 == 0 && year % 100 != 0

        int year = 1992;
        isLeapYear(year);
    }
        public static void isLeapYear(int year){
           // int year = 1992;
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " visokosniy");
            } else {
                System.out.println(year + " ne visokosniy");
            }
        }

        public static boolean isLeapYear1 (int year){
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
                return true;
            } else {
                return false;
            }
        }
        // поскольку возврвщаем булиан, пишем такую функцию:
        public static boolean isLeapYearBoolean (int year){
            return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        }
}


