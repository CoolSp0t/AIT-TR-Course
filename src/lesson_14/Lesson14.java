package lesson_14;

import java.util.Arrays;
import java.util.Random;

public class Lesson14 {
    public static void main(String[] args) {
        System.out.println("Task0");
        /*
        написать, возвращающий массив целых чисел , заданной длины.
        Массив должен быть заполнен случайными числами.
        Перегрузка.Диапазон случайных чисел, может быть задан вторым параметром вызова метода
         */
        int newSize = 10;
        int randomBound = 100;
        System.out.println(Arrays.toString(returnArray(newSize)));
        System.out.println(Arrays.toString(returnArray(newSize, randomBound)));


    }// end main
 //start methods
    public static int[] returnArray(int size){
        if(size  < 0 ) return new int[0];
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < result.length ; i++) {
            result[i] = random.nextInt(50);

        }
        return result;
    }


    public static int[] returnArray(int size, int bound){
        if(size < 0 ) return new int[0];
        int boundDefault = 100;
        if (bound <= 0) bound = boundDefault; // return new int [0] как вариант обработки не корректоного bound
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < result.length ; i++) {
            result[i] = random.nextInt(bound);
        }
        return result;
    }
}
