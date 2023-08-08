package homework_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("Task 0");
        Random random = new Random();
        int[] array = new int[random.nextInt(20+1)];
        int evenNumber = 0;
        int sum = 0;


        for (  int counter = 0; counter < array.length ; counter++){
           array[counter] = random.nextInt(100);
           if ( array[counter] != 0 && array[counter] % 2 == 0 ){
               evenNumber++;
               sum = sum + array[counter];
           }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("evenNumber: " + evenNumber + " Sum of even numbers: " + sum);



         /*
         За каждый месяц банк начисляет к сумме вклада 7% от суммы.
         Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
         А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
         Для вычисления суммы с учетом процентов используйте цикл for.
         Пусть сумма вклада будет представлять тип float.
          */
        System.out.println();
        System.out.println("Task 1");
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        float deposit = scanner.nextFloat();
        System.out.println("Введите кол во месяцев");
        int months = scanner1.nextInt();
        System.out.println("Вы вкладываете сумму в размере: " + deposit + " на " + months + " месяцев");
        // if(months>=1 && deposit>0) можно было сделать проверку на положительные числа
        for(k = 1  ; k <= months; k++  ){
            deposit =  ((float)(deposit *1.07));

        }
        System.out.println("После " + months + " месяцев, вы получите: " + deposit);


        System.out.println("");
        System.out.println("Task 2");

        /*
        Заполните массив 50 случайными числами от 1 до 100.
        Программа должна найти, и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.
        Простое число - число, которое делится на цело только на 1 и само себя.
        Пример простых чисел: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
         */

        Random random1 = new Random();
        int[] array1 = new int[50];
        int simpleNumbers = 0;
        for (int counter = 0 ; counter < array1.length ; counter++){
            array1[counter] = random1.nextInt(100)+1;

        }

        for (int i = 0 ; i < array1.length ; i++){
            boolean isPrime = true;
            if(array1[i] == 1){
//                isPrime = false;
                System.out.println("Число равно 1" + array1[i]);
                continue;
            }

            for (int j = 2; j< array1[i]; j++){ // 9 [ 2 ,3 ,4 , 5 , 6 , 7 , 8 ,]
                if (array1[i] % j == 0){
                    isPrime = false;
                }
            }
            if (array1[i] % 2 == 0 || array1[i] % 3 == 0 ){
                isPrime = false;
            }


            if(isPrime){
                System.out.print(array1[i] + " ");
                simpleNumbers++;
            }

        }


        // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
        System.out.println("\n колво простых чисел в массиве: " +simpleNumbers );






        for (int i = 1 ; i <=6 ; i++){
            for (int j = 1 ; j<= i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }



    }
}
