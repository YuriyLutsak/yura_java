package com.HardInterestingTasks.For.Counter;

import java.util.Scanner;

public class SchoolMarks {
    public static void main(String[] args) {

//        Задание 12.10
//        Контрольная работа считается «провальной»,
//        если более половины учеников получили неудовлетворительные оценки.
//        Напишите класс, который принимает с клавиатуры число учеников в группе,
//        а затем -оценку каждого ученика. Класс должен определить, была ли контрольная «провальной».
//        ПС в класе может быть и 4-5 человек.

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter amount of students: ");
            int amountOfStudents = scanner.nextInt();


            System.out.println("enter first mark: "); //нулевая оценка в цикле будет
            int previousMark = scanner.nextInt();

            int currentMark = 0; // int делаем здесь, чтоб выделтть память и только обращаться к назвагию в дальнейшем, а не выделять память
            int sumMark = 0;
            int markQuantity = 0;
            double resExam = 0;


            for (int i = 1; i < amountOfStudents; i++) { // стартуем с единицы т.к. нулевая оценка уже есть выше
                System.out.println("enter mark: ");
                currentMark = scanner.nextInt();

                System.out.println("prev: " + previousMark + " current: " + currentMark);

                previousMark = currentMark;

                sumMark = sumMark + currentMark; // 5 + 3 + 4 + 5
                markQuantity++;

            }
        System.out.println(markQuantity + " :counter");
        resExam = sumMark / amountOfStudents;
        if (sumMark / amountOfStudents <= 3.5){
            System.out.println(" exam false " + sumMark + " / " + resExam );
        }
        else {
            System.out.println(" EXAM pass " + sumMark + " / " + resExam);
        }



        schoolMarksShort();

        }
        public static void schoolMarksShort(){
      //      Задание 12.10
//        Контрольная работа считается «провальной»,
//        если более половины учеников получили неудовлетворительные оценки.
//        Напишите класс, который принимает с клавиатуры число учеников в группе,
//        а затем -оценку каждого ученика. Класс должен определить, была ли контрольная «провальной».
//        ПС в класе может быть и 4-5 человек.

            Scanner scan = new Scanner(System.in);
            System.out.println("amount of students is: ");
            int amountStudents = scan.nextInt();

            int studentMark;
            double sumMarks = 0;
            double resExam = 0;
            int counter = 0;


            for (int i = 0; i < amountStudents; i++) {
                System.out.println("student mark is: ");
                studentMark = scan.nextInt();

                sumMarks = sumMarks + studentMark;
                counter++;

            }
            System.out.println(counter + " :counter");
            resExam = sumMarks / amountStudents;
            if (sumMarks / amountStudents <= 3.5){
                System.out.println(" exam false " + sumMarks + " / " + resExam );
            }
            else {
                System.out.println(" EXAM pass " + sumMarks + " / " + resExam);
            }


        }


    public static void previousCurrent() {
        // Задание 12.4
        // Напишите класс, который принимает с клавиатуры 17 целых чисел и выводит на экран информацию о том,
        // сколько из них были больше, чем предыдущее число.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of numbers: in this case its = 17");
        int amount = scan.nextInt();

        System.out.println("Enter first (previous) number");
        int previous = scan.nextInt();

        int current = 0;
        int counter = 0;

        for (int i = 1; i < amount; i++) {
            System.out.println("Enter number: ");
            current = scan.nextInt();//
            System.out.println(previous + " - previous " + current + " - current");

            if (current > previous) {  //true
                counter++; //оно яблоко выьрал - 9 бубочек передвинул  // counter =counter +1  идет кака датчик движения
            }
            previous = current;

        }

        System.out.println(counter + " are bigger then previous");
    }

    }

