package homework_14;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
        String string = "abcdef";

        int[] ints = {0, 1, 2, 3, 4, 5, 6};
  //      System.out.println(Arrays.toString(arrayIndexSwap(ints,1 , 5)));

        System.out.println("Массив до вызова метода   " +Arrays.toString(ints));

        swap(ints, 1 , 4);

        System.out.println("Массив после вызова метода" +Arrays.toString(ints));

        int[] otherLink;
        otherLink = ints;
        otherLink[5] = 100;
        System.out.println("otherLink" + Arrays.toString(otherLink));
        System.out.println("ints" +Arrays.toString(ints));

        otherLink = null;
        ints[0] =99;
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(otherLink));



//        string.substring()

        System.out.println(substringString(string, 2));
        System.out.println(substringString(string, 1 , 6));
    }
    // end main

    //Start methods

    //Task0





    //Task 1
    //Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
    //Метод должен поменять местами значения, хранящихся в этих индексах
    //*UPD*Написать метод swap, принимающий на вход массив целых чисел, и два индекса. Метод должен поменять местами значения, хранящихся в этих индексах
    //это должен быть void метод. Пришёл массив в метод. В нем нужно просто поменять местами значения в двух "ячейках"


    // updated
    public static void swap(int[]array , int index1, int index2){
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;



    }

    //old
    public static int[] arrayIndexSwap (int[] arr, int firstIndex , int secondIndex){
        if (arr == null || firstIndex < 0 || secondIndex < 0) return arr;
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;


        return arr;
    }








    //Task 2
    //Написать метод, принимающий строку и один или два индекса (перегрузка).
    // Метод должен возвращать подстроку начиная с первого индекса (включительно) и заканчивая вторым индексом (не включительно)
    // Если индекс 1 - начиная с индекса и до конца строки.


    //*UPD*Написать метод swap, принимающий на вход массив целых чисел, и два индекса. Метод должен поменять местами значения, хранящихся в этих индексах
    //это должен быть void метод. Пришёл массив в метод. В нем нужно просто поменять местами значения в двух "ячейках"




    public static String substringString (String str , int index){
        if(str == null || index < 0 ) return str;
        int end = str.length() - index;
        str = new String(str.getBytes(), index , end);


        return str;
    }



    public static String substringString (String str , int beginIndex , int endIndex){
        int length = str.length();
        if(str == null || beginIndex < 0 || endIndex > length ) return str;
        int end = endIndex - beginIndex;
        str = new String(str.getBytes(), beginIndex , end);
        return str;
    }

}
