package com.dmd.lessons;

public class For {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            //для БЫСТРОГО написания цыкла for пишем "fori"
//        }
       //forExampe();
       forContinue();

    }
    // наделал функций с циклом for для примера
    public static void forExampe(){
        for (int val = 10; val > 0; val--){
            System.out.println(val);
        }
    }

    public static void forBreak(){
        for (int i = 10; i < 0; i--) {
            System.out.println(i);
            if (i == 5){
                break;
            }
        }
    }

    public static void forContinue(){
        for (int i = 10; i < 0; i--) {
            if (i == 5){
                continue;
            }
            System.out.println(i + " ");
        }
    }

}
