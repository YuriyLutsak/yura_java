package massiv;

public class Array {
    public static void main(String[] args) {
//        int[] val = {1,2,3,4,5,};
//        System.out.println(val[2]);
//        val[3] = 18;

/*
        int[] val1 = new int[10];
        val1[4] = 9;
        val1[7] = 98;
        for (int i = 0; i <= val1.length ; i++) {
            System.out.println(i + ": " + val1[i]);
        }

 */
test();


    }
    private static void test() {
        int[][] val2 = {
                {1, 2, 3,13},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < val2.length; i++) {
            int[] int2 = val2[i];
            for (int j = 0; j < int2.length; j++) {
                System.out.print(int2[j] + " ");
            }
            System.out.println(); // не понял как, но очен интересно
        }
    }
}
