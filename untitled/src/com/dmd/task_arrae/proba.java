package com.dmd.task_arrae;

public class proba {
    public static void main(String[] args) {
//        int[] value = new int[10];
        int[] value = new int[]{123, -60, 2, 3, 5, 5, 255, 13};

//        System.out.println("min val: " +  minValue(value));
//        System.out.println("max val: " +  maxValue(value));
        showValues(value);

    }

    public static int minIndexFind(int[] value){
        int minIndex = 0;

        int minValueOfIndex = value[minIndex];
        for (int i = 0; i < value.length; i++) {
            if (minValueOfIndex > value[i]){
                minValueOfIndex = value[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int maxIndexFind(int[] value) {
        int maxIndex = 0;
        int maxValueOfIndex = value[maxIndex]; // maxIn
        for (int i = 0; i < value.length; i++) {
            if (maxValueOfIndex < value[i]) {
                maxValueOfIndex = value[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int indexSum(int[] value){
        int maxi = maxIndexFind(value);
        int mini = minIndexFind(value);

        int res = 0;
        for (int i = mini ++ +1; i < maxi; i++) {
            res += value[i];
        }

        return res;
    }


    public static int minValue(int[] value) {
        int minVal = value[0]; //или любое числов в массиве КРОМЕ НУЛЯ ибо оно к НУЛЮ и прировняет
        for (int i = 0; i < value.length; i++) {
            if (minVal > value[i]) {
                minVal = value[i];
            }
        }
        return minVal;
    }

    public static int maxValue(int[] value) {
        int maxVal = value[0];
        for (int i = 0; i < value.length; i++) {
            if (maxVal < value[i]) {
                maxVal = value[i];
            }
        }
        return maxVal;
    }

    public static String showValues(int[] value) {
        String show = "enter data: "; // null можно без скобок, чтоб ничего не показывало
        // System.out.println(show);
        System.out.println(indexSum(value) + "\n" + show + "min val: " + minValue(value) + "\n" + show + "max val: " + maxValue(value) + "\n max index: "+ maxIndexFind(value) + "\n min index: " + minIndexFind(value));
        // System.out.println("max val: " + maxValue(value));
        return show;
    }


}















