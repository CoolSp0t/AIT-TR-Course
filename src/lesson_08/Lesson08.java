package lesson_08;

import java.util.Random;
import java.util.Scanner;

public class Lesson08 {
    public static void main(String[] args) {

//        int i = 0;
//
//        while (i <= 10){
//
//            System.out.println("Hello " + i++ );
//
//            // System.out.println("Счетчик: " + i );
//            // i++ -> i = i + 1;
//            // тело цикла
//        }
//        System.out.println("Цикл1 завершен");
//
//        System.out.println("----------");
//        i = 100;
//
//        while (i > 90){
//
//            System.out.println("Hello " + i-- );
//            // i-- -> i = i - 1;
//            // тело цикла
//        }
//
//        System.out.println("Цикл2 завершен");
//
//        System.out.println("---------------------");
//        int y = 0;
//        Random random = new Random();
//        int randomNumber, count12 = 0 , count13 = 0;
//        while (y < 1_000_000) {
//            randomNumber = random.nextInt(13);
//            if (randomNumber == 12) count12++;
//            if (randomNumber == 13) count13++;
//            y++;
//
//
//        }
//
//        System.out.println("count12: " + count12 + " count13: " + count13);
//
//        int var1 = 0;
//        while (var1 != 0){
//            System.out.println("While: var не равен 0");
//        }
//
//        do {
//            System.out.println("Do-while: var не равен 0");
//        } while (var1 != 0);
//
//
//        System.out.println();
//        System.out.println("Do-while -----------");
//
//
        Scanner scanner = new Scanner(System.in);
//        int answerInt;
//        do {
//            System.out.println("Введите число меньше или равное 10");
//            answerInt = scanner.nextInt();
//            System.out.println("Вы ввели число: " + answerInt);
//        } while (answerInt > 10);
//
//        System.out.println("Ура! Ваше число подходит!" + answerInt);


        // цикл с предусловием While
        // цикл с постусловием Do-while

        Random ran1 = new Random();

//        int counter1 = 1;
//
//
//        while (counter1 <= 20) {
//            if (counter1 % 2 == 0) System.out.println(counter1);
//            counter1++;
//        }
        /*
        Вывести на экран все четные числа от 5 до 20 включительно и посчитайте их кол во
        */

        int counterIter = 0;
        int startInt = 0;
        int evenCount = 0;
        int sum1 = 0;


        while (startInt <= 20) {
            if (startInt % 2 == 0){
                System.out.println(startInt + " ");
                evenCount++;
                sum1 = sum1 + startInt;
            }


            startInt++;
            counterIter++;

        }
        System.out.println("Кол-во итерайций цикла: " + (counterIter -1));
        System.out.println("Кол-во четных чисел: " + evenCount);
        System.out.println("Сумма четных чисел: " + sum1 );
        System.out.println("Среднее арифметическое: " + (double)sum1 / evenCount );


//        System.out.println("Введите число:");
//        int userInt = scanner.nextInt();
//
//        int counter2 = 1;
//        int sum = 0;
//        while (counter2 <= userInt) {
//            int randomInt = ran1.nextInt(100) + 1;
//            sum = sum + randomInt;
//            counter2++;
//        }
//
//        int countIterations = counter2 - 1;
//        System.out.println("Sum " + sum);
//        System.out.println("Цикл завершен. Кол-во " + (counter2 - 1));
//        System.out.println("Среднее арифметическое: " + ((double)sum / countIterations) );



//        int maxInt = Integer.MAX_VALUE;
//        int minInt = Integer.MIN_VALUE;
//        System.out.println("Max: " + maxInt);
//        System.out.println("Min: " + minInt);
//
//        System.out.println("Max + 1 ->" + (maxInt + 1));
//        System.out.println("Min + 1 ->" + (minInt + 1));
//





    }

}
