package homework_12;

import java.util.Arrays;
import java.util.Random;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("Task 0");
        int number = 11;
        System.out.println("Is " + number + " simple: " + isNumberSimple(number));

        System.out.println("");
        System.out.println("Task 1");
        Random random = new Random();
        int[] array = {random.nextInt(50) + 1, random.nextInt(50) + 1, random.nextInt(50) + 1, random.nextInt(50) + 1, random.nextInt(50) + 1};
        System.out.println(Arrays.toString(array));
        System.out.println("This array contains " + simpleNumbersInArray(array) + (simpleNumbersInArray(array) > 1 ? " simple numbers" : " simple number"));

        System.out.println(" ");
        System.out.println("Task2");
        String[] strings = {"One", "Seven", " Eleven", "TwentyOne", "SevenEleven"};
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(smallLarge(strings)));


        String[] strings1 = {"str", "str1", "str12", "string", "Long string"};
        System.out.println(Arrays.toString(createArrayOfSmallestAndLongest(strings1)));


        int[] ints = {4, 3, 55, 7, 11, 65, 98};
        int[] primeInts = createArrayOfPrimeNumber(ints);
        System.out.println(Arrays.toString(primeInts));
    }
// End Main

    //Start methods

    // Task 0
    //Написать метод принимающий целое число и проверяющий является ли число простым.
    // Если является, метод должен вернуть true, не является - false

    public static boolean isNumberSimple(int x) {
        boolean flag = true;
        if (x <= 1) return false;
        for (int j = 2; j < x; j++) {
            if (x % j == 0) {
                return flag = false;
            }

        }

        return flag;

    }


//Написать метод, принимающий массив целых чисел.
// Метод должен вернуть количество простых чисел в массиве.
// Для проверки на "простоту" числа рекомендуется использовать метод из Task 0

    public static int simpleNumbersInArray(int[] arr) {
        int simpleNumbers = 0;
        if (arr != null || arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (isNumberSimple(arr[i])) { // если arr[i] является простым числом то
                    simpleNumbers++;
                }
            }
        }

        return simpleNumbers;
    }
//Task 2
//Написать метод, принимающий на вход массив строк.
// Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.

    public static String[] smallLarge(String[] str) {
        if (str == null) return new String[]{};
        String bigStr = str[0];
        String smallStr = str[0];

        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > bigStr.length()) {
                bigStr = str[i];
            }
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < smallStr.length()) {
                smallStr = str[i];
            }
        }

        return new String[]{bigStr, smallStr};
    }


    public static String[] createArrayOfSmallestAndLongest(String[] strings) {
        if (strings == null) return new String[]{};
        String smallestStr = null;
        String longestStr = null;
        for (String str : strings) { // пытается найти в массиве не null строку. T.e имеющую значение.
            if (str != null) {
                smallestStr = str;
                longestStr = str;
                break;
            }
        }
        if (smallestStr == null)
            return new String[]{}; //  если в массиве не нашлось ни одной не нулевой строки возвращаемся

        for (String str : strings) {
            if ((str != null) && (str.length() < smallestStr.length())) { // сравниваем длины текущей строки и в переменной smallestStr
                smallestStr = str; // если текущая короче, перезаписываем ее значение в smallestStr
            }
            if (str != null && str.length() > longestStr.length()) {
                longestStr = str; // если текущая длиннееб перезаписываем ее значение в longestStr
            }

        }
        return new String[]{smallestStr, longestStr}; // создаем массив из smallestStr и longestStr после чего возвращаем его
    }


    public static int[] createArrayOfPrimeNumber(int[] numbers) {
        if (numbers == null) return new int[0];
        int[] result = new int[numbers.length];

        int count = 0;
        for (int value : numbers) {
            if (isNumberSimple(value)) {
                result[count] = value;
                count++;
            }
        }

        //{4, 3, 55 ,7, 11, 65 ,98}
        //{0, 0, 0, 0, 0 , 0 , 0}
        //{0, 0, 0, 0, 0 , 0 , 0}
        int[] resultShort = new int[count];
        for (int i = 0; i < resultShort.length; i++) {
            resultShort[i] = result[i];
        }
        int[] ints = Arrays.copyOf(result, 3); //готовый метод для копирования части массива

        return resultShort;
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 && number % 3 == 0) return false;
        for (int i = 5; i <Math.sqrt(number) ; i += 6 ) {
            if (number % i == 0 || number % (i+2) == 0){
                return false;
            }
        }

    return true;
    }

}

