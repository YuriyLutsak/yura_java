package com.YuraPracticeTasks;
/**Задание 17.34
 * Напишите метод, который принимает в качестве параметра положительное целое число и
 * возвращает число с противоположным порядком цифр.
 * Например, для параметра 123 метод возвратит 321, для параметра 120 метод вернет 21.
*/

 import java.util.Scanner;

public class BackWard {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" value:");
        int value  = scan.nextInt();

        backWardNumbers(value);


    }
    public static void backWardNumbers(int value){
        int temp = 0;
        int division = 1;
        while (value / division != 0){
            temp = (value / division) % 10;
            division = division * 10;
            System.out.print(temp + " ");
        }
     int glueTogether = temp * 100 + temp * 10 +temp;
        System.out.println(glueTogether);

    }

}
