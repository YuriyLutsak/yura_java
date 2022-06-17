package com.HardInterestingTasks.Array;

/**
 * Задание 19.18
 * Напишите метод, который получает в качестве параметра массив и
 * проверяет в масиве неубывающую последовательность
 * (каждый элемент не меньше предыдущего).
 * Пример:
 * 1 2 5 9 9 12 99 - метод возвращает TRUE
 * 10 12 22 5 84 - метод возвращает FALSE
 */
public class NumbersIndexesOfArray {
    public static void main(String[] args) {

//            array[i] = array[i-1];  в нынешний елемент присваиваем предыдущий
//            array[i] = array[i] - 1; от нынешнего значения отнимаем единицу и присваиваем в нынешнюю ячейку
//            array[i-1] = array [i]; предьидущей ячейке присваиваем значение нынешней ячейки
//            array[i] = array[i+1]; нынешней ячейке присваиваем значение следуйщей ячейки
//            array[i] =  array[i + 1] + 1;  нынешней ячейке присваиваем значение следуйщей ячейки + 1

//            array[i] == array[i-1]; сравниваем нінешнюю и предыдущую значения ячеек
//            array[i] =< array[i] - 1; бессмыслица
//            array[i-1] >= array [i];
//            array[i] != array[i+1];

        //array[2] =  array[2 + 1] + 1;
        //{1, 5, 22, 40}
        //{1, 5, 41, 40}


        int[] array = {1, 2, 3, 4, 3, 6, 7, 8, 9};
        System.out.println(isInSeries(array));
    }
    public static boolean isInSeries ( int[] array){

        for (int i = 1; i < array.length; i++) {

            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
