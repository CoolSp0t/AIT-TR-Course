package lesson_12;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

       // numberPower(3);



//         int resultFromMethod = 10;
//         resultFromMethod = 10 +5;
//         resultFromMethod = (25 > 5) ? 11: 5;
//         System.out.println(resultFromMethod);

        int resultFromMethod = powIntMethod(3);
//        resultFromMethod = numberPower(3); тип метода Void. Ничего не возвращается . Нельзя присвоить "ничего" в переменную
        System.out.println(resultFromMethod);

       int squareFromMethod = numberSquare( 3);


        System.out.println(squareFromMethod);

        System.out.println(numberSquare(2.5));

        double squareDouble = numberSquare(2.5);
        System.out.println(squareDouble);
        // double a = 4; // -> 4.0

        System.out.println("===========================");
      // написать метод , принимающий массив целых чисел находящий минимальное значение в массиве
        int[] array = {1, 4 ,5, -1 ,8};
        System.out.println(Arrays.toString(array));
       // array = null;
        int minInArrayIndex = foundMinInArray(array);
        System.out.println("index minValue in Array: " + minInArrayIndex);
        System.out.println("Min in array " + (minInArrayIndex != 1 ? array[minInArrayIndex] : ""));

        // написать метод , определящий есть ли в массиве число Х
        // найти элемент в массиве и вернуть его индекс. ==>
        System.out.println(Arrays.toString(array));
      if(array!= null && searchNumberInArray(array,100) != -1 ) {
          array[searchNumberInArray(array, 100)] = 256;
      }
        System.out.println(Arrays.toString(array));
    }

    // Methods Main

    public static int searchNumberInArray(int[] arr, int numberForSearch){
        if ( arr == null) return -1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == numberForSearch){
                return i;
            }
        }
        return -1; // если в массиве не находим число возвращаем -1 (типо не входит в массив)
    }


    public static boolean isNumberInArray(int[] arr, int x){
        boolean result = false;
        if(arr == null) return false; // проверка на null. В случае null возвращаем false . Работа метода останавливается
        for ( int value : arr){ // ищем совпадение. если нашли - возврат true. Работа метода останаваливается
            if (value == x ){
                return true;
            }
        }
        return false; // нет совпадений - возвращает false
    }


    public static int foundMinInArray (int[] array){
        if (array != null) {
            int minIndex = 0;
            int min = array[0]; // инициализация переменной значением, хранящимся в 0 ячейке массива.

            // нахождение min значения в массиве
//            for(int value :array){
//                if(value <  min ){
//                    min = value;
//                }
//            }
            for (int i = 0; i <array.length ; i++) {
                if (array[i]< min){
                    min = array[i];
                    minIndex = i;
                }
            }
            return minIndex; // возврат результата работы метода
        }else{
            // приешл null
            // что вернуть????
        }return -1;

    }

    public static void numberPower(int num){
        if( num>=0){
            int result = 1;
            for( int i = 0 ; i < num ; i++){
                result *= 2;

            }
            System.out.println("2 в степени" +  num + "Число: " + result);
        }else {
            System.out.println("Неверный аргумент вызова");
        }



    }
    public static double numberSquare(double x){
        return x * x; // вычесление и возврат без промежуточной переменной
    }
    public static int powIntMethod(int num){
        int result = 1; // обьявления переменной, в которой будет хратиться результат вычеслений в методе.
                        // Тип этой переменной совпадает с указанным типом возвращаемого значения метода
        if( num >= 0){
            for(int i = 0;i < num ;i++ ){
                result *=2;
            }
        }else {
            result = (int) Math.pow(2 , num);
        }
        return result; // Возвращаем результат наших вычеслений . Тип срого должен соответствовать типу указанному типу возвращаемого значения метода
    }

    //напишите метод ,принимающий на число и возвращаего квардрат этого числа

    public static int numberSquare(int x){
        int result = x;// объявление переменной, в которую будет "сложен" результат вычислений в методе
        result *= x; // сами вычисления, необходимые для реализации поставленной задачи
        return result;// возвращаем результат работы метода

        // return x * x; --> вычесление и возврат без промежуточной переменной
    }

    // Methods end
}
