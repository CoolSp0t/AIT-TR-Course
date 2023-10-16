package lesson_64;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        /*
        Multidimensional Arrays - многомерные массивы
        Two-dimensional arrays - двумерные массивы
         */


        int[][] table = new int[10][20];
        int[]ints = {1,2,3,4};
        System.out.println(ints[0]);
        int[][] arr = {
                //0 1 2
                {11,22,33}  //arr [0]
                ,{44,55,66} // arr [1]
                ,{77,88,99}}; // arr [2]
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);


        int[] arrZero = arr[0];
        System.out.println("zero elt of arr " + Arrays.toString(arr[0]));
        System.out.println("zero elt of arr " + Arrays.toString(arr[1]));
        System.out.println("zero elt of arr " + Arrays.toString(arr[2]));
//        System.out.println("zero elt of arr " + Arrays.toString(arrZero));

        System.out.println("print in cycle");
        // внешний цикл от 0 до количества строк/ массивов двумерного массива
        for (int i = 0; i < 3; i++) {
            // внутренний цикл от 0 до количества столбцов/элементов массива
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }

        int[][] num = new int[3][];
        num[0]  =new int[4];
        num[1] = new int[5];
        num[2] = new int[6];

        int[][] arr1 = {
                //0 1 2
                {11,22,33}  //arr [0]
                ,{44,55} // arr [1]
                ,{77,88,99,12,1,3,5}}; // arr [2]

        System.out.println("print in cycle");
        // внешний цикл от 0 до количества строк/ массивов двумерного массива
        for (int i = 0; i < 3; i++) {
            // внутренний цикл от 0 до количества столбцов/элементов массива
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
