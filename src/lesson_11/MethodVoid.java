package lesson_11;

import java.util.Arrays;
import java.util.Scanner;

public class MethodVoid {
    public static void main(String[] args) {
//        sayHello();
//        sayHello();
//        sayHello();
//        sayHello();

        char chSymbol= 'A';
        System.out.println((int)chSymbol);



        printDecimalCodeOfChar('A');
        //   printDecimalCodeOfChar(chSymbol)



        int[] arrays = {44, 55, 13 , 66, 35, 21};
        printArray(arrays);
        System.out.print("My method: ");
        System.out.println(Arrays.toString(arrays));

         // Написать метод , принимающий число
        // вывести на экран надпись является ли число простым

        System.out.println("---------------------");
        int[] array = {13, 43, 55, 19, 22 , 65 , -13, 0, 4 , 5};

        for(int i = 0 ;i< array.length ;i++){
            int element = array[i];
            printSimpleNumber(array[i]);
        }

        for(int element : array){
            printSimpleNumber(element);
        }

        String[] strings = {"dasdas", "dasdasddasd", "dasdasda"};
        for( String str : strings){
            System.out.println(str);
        }



        for ( int currentValue : array){
        }


        // метод выводящий числа от 1 до . Число n метод принимать в параметры.
        printNumbers(10);


        // метод выводящий на экран числа от x до y . числа х и у метод должен принимать пареметры
        printNumbers(3 , 10);
    }

    // Methods area


    public static void printNumbers(int n){
       printNumbers(1, n);
//      for (int i = 1 ; i <= n ;i++){
//          System.out.print(i + " ");
//      }
//        System.out.println();
    }

    public static void printNumbers(int x , int y){
        for (int i = x ; i <= y ;i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printArray(int [] array){
        System.out.print("[");
        for (int i = 0 ; i< array.length ; i++){
            System.out.print(array[i] + ((i == array.length-1) ? "" :", "));
        }
        System.out.print("]");
        System.out.println();
    }


    public static void sayHello (){
        System.out.println("Hello");
    }


    public static void printDecimalCodeOfChar(char charName){
        System.out.println((int) charName);
    }

    public static void printSimpleNumber(int simpleNum){

            boolean isPrime = true;
            if(simpleNum == 1 || simpleNum <= 0){
                isPrime = false;
               // System.out.println("Число равно 1" + simpleNum );

            }

            for (int j = 2; j<simpleNum ; j++){ // 9 [ 2 ,3 ,4 , 5 , 6 , 7 , 8 ,]
                if (simpleNum % j == 0){
                    isPrime = false;
                    break;
                }
            }
//            if (simpleNum % 2 == 0 || simpleNum % 3 == 0 ){
//                isPrime = false;
//            }


            if(isPrime){
                System.out.println(simpleNum + " является простым");
            }else {
                System.out.println(simpleNum + " число не является простым");
            }

        }





    }




