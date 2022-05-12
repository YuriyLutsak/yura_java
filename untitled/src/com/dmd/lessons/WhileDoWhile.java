package com.dmd.lessons;

public class WhileDoWhile {
    public static void main(String[] args) {
        int val = 0;
        do {
            System.out.println(val);
            val++;
        }while (val<10);

    }

    private static void whileExemple(){
        int val = 10;
        while (val > 0){
            System.out.println(val);
            val--;
        }
    }
}
