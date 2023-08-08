package homework_13;


import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("Task0");
        String[] strings = {"hello", "Father", "Mother", "Arrays", "Current"};
        String equalsString = "      Father";
        System.out.println(equalsStringInArray(strings, equalsString));
        String[] strings1 = {"One", "Two", "Hello", "hello", "test"};
        String findMe = "Two";
        System.out.println(isStringInArray(strings1, findMe));
        System.out.println(searchIndexByValueInArray(strings1, findMe));


        System.out.println("");
        System.out.println("Task1");
        String string = "Hello";
        System.out.println(substringInString(string));
        String strForCut = "Hello";
        System.out.println(cutString(strForCut));


        System.out.println(" ");
        System.out.println("Task2");
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOfArray(ints));
        double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        System.out.println(sumOfArray(doubles));

        /*
        {
            int[] ints1 = {0, 1, 2, 3, 4, 5};
            System.out.println("Before for-each" + Arrays.toString(ints1));
            for (int value : ints1) {
                if (value == 2) {
                    value = 100;
                }
            }
            System.out.println("After for-each" + Arrays.toString(ints1));

            for (int i = 0; i < ints1.length; i++) {
                if (ints1[i] == 2) {
                    ints1[i] = 100;
                }

            }
            System.out.println("After for" + Arrays.toString(ints1));
        }
        */

        System.out.println("");
        System.out.println("Task3");
        int[] ints2 = copyOfArray(ints);
        System.out.println(Arrays.toString(ints2));

        int[] ints3 = copyOfArray(ints, -1);
        System.out.println(Arrays.toString(ints3));


    }
// end main
    // methods

//Task 0
//Написать метод по поиску строки в массиве строк.
// На вход метод принимает массив строк, и строку для поиска.


    public static boolean equalsStringInArray(String[] arr, String str) {
        if (arr == null) return false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str.trim())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isStringInArray(String[] strings, String str) {
        if (strings == null || str == null || str.length() == 0) {
            return false;
        }
        for (String currentString : strings) {
            if (currentString != null && currentString.equals(str)) {
                return true;
            }
        }

        return false;
    }

    public static int searchIndexByValueInArray(String[] strings, String str) {
        if (strings == null || str == null) {
            return -1;
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && strings[i].equals(str)) {
                return i;
            }
        }

        return -1;
    }

    //Написать метод, принимающий строку и возвращающий новую строку,
    // состоящую из 2го и 3го символа входящей строки, переведенных в верхний регистр.
    // Распечатать полученный результат в методе main


    public static String substringInString(String str) {
        str = str.substring(1, 3).toUpperCase();
        return str;
    }


    public static String cutString (String str){
        if ( str == null) return "";
        String result = "";
        if(str.length() > 1) {
            result += str.charAt(1); // String str = "string" + (String)
        }
        if (str.length() > 2){
            result += str.charAt(2);
        }
        return result.toUpperCase();
    }


//Реализуйте метод sumOfArray (сумма элементов массива),
// который получает на вход массив и определяет сумму его элементов.

    // (double[] doubles, int[] ints) разные  (int[] ints, double[] doubles)
    public static double sumOfArray(double[] doubles){
        if (doubles == null) return  0;
        double sum = 0;
        for (double value : doubles){
            sum +=value;
        }
    return sum;
    }


    // int 4 -> double 4.0 -> int 4
    public static int sumOfArray(int[] arr) {
//        double[] doubles = Arrays.stream(arr).asDoubleStream().toArray();
//        int sum1 = (int) sumOfArray(doubles);
//        return sum1;
//

        int sum = 0;
        if (arr == null) return 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }



    //Task 03
    //Написать метод copyOfArray, возвращающий массив:
    //Метод принимает массив целых чисел и возвращает копию этого массива.
    //Перегрузка: метод принимает массив строк и возвращает копию массива
    //Перегрузка: Метод принимает массив целых чисел и число (newSize) - длину нового массива.
    // Новый массив заполняется значениями из входящего массива. Сколько поместится.
    // Если чисел не хватило -> остаток массива заполняется 0.


    public static int[] copyOfArray (int[] array){
        if(array == null) return null;
         return copyOfArray(array, array.length);
//        int[] copyArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            copyArray[i] = array[i];
//        }
//        return copyArray;
    }


    public static int[] copyOfArray(int[] array, int newSize){
        if(array == null || newSize <= 0) return null;
        int[] result = new int[newSize];
        for (int i = 0; i < result.length && i < array.length ; i++) {
            result[i] = array[i];
        }
        return result;
    }

}



