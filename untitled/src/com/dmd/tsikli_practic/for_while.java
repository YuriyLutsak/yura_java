package com.dmd.tsikli_practic;

public class for_while {
    public static void main(String[] args) {
        // 1*2*3*4*5=5! this is factorial
        int val = 5;
        int res = factorialFor(val);
        System.out.println(res);

        int val_sum = 1231; // находим сумму чисел
        int res1 = sum_for(val_sum);
        System.out.println(res1);
        System.out.println(sum_for(val_sum));

        // считаем проценты от 24 долларов с 1626 года по 2020 год
        double val3 = 24;
       // double res3 = money_sum(val3);
       // money_sum(val3);

        int val4 = 11; // простое ли число, т.е. делиться без остатка только на 1 и само на себя?
        boolean res4 = isSimple(val4);
        isSimple(val4);

        printLetters();// вызываем только гласные буквы от буквы b

    }

    public static int factorialFor(int val) {
        int res = 1;
        for (int i = 1; i <= val; i++) {
            res *= i; // res = res * 1;
        }
        return res;
    }

    public static int factorialWhile(int val) {
        int res = 1;
        int i = 1;
        while (i <= val) {
            res *= i;
            i++;
        }
        return res;
    }

    public static int sum(int val) {
        int result = 0;
        int currentVal = val;
        while (currentVal != 0) {
            result += currentVal % 10;
            currentVal /= 10;
        }
        return result;
    }

    public static int sum_for(int val) {
        int res_for = 0;
        for (int currentVal = val; currentVal != 0; currentVal /= 10){
            res_for += currentVal % 10;
        }
            return res_for;
    }

    public static double money_sum(double val3){
        double res3 = val3;
        for(int year = 1626 + 1; year <= 2020; year++){
            double percent = res3 * 0.05;
            res3 += percent;
            System.out.println(year + ": " + res3);
       }
        return res3;
    }

    public static boolean isSimple(int val4){
        boolean res4 = true;
        for (int i = 2; i < val4; i++) {
            if (val4 % i == 0){
                res4 = false;
                System.out.println(res4);
                break;
            }
        }
        return res4;
    }
    public static void printLetters(){
        for (char letter = 'b' ; !isVowel(letter) ; letter++) {
            System.out.println(letter);

        }
    }
    public static boolean isVowel(char val5){
        return val5 == 'a' || val5 =='e' || val5 == 'y';
    }

}
