package lesson_06;

import java.util.Random;
import java.util.Scanner;

public class Lesson06 {
    public static void main(String[] args) {
        int x = 8;

//        if (x <= 10) System.out.println("Привет всем! ");

//        System.out.println("x before if:" + x);
//        if (x == 10) {
//            x = x - 1;
//            System.out.println("х in if: " + x);
//
//        }
//
//        System.out.println("x after if: " + x );
   //
   //  Необходимо написать программу,
    // где бы пользователю предлагалось
    // ввести число 1.
    // Если ввёл число 1, программа должна вывести сообщение : "Вы ввели число 1 "
        // Если введено число 3, программа должна вывести выдать " Вы же ввели 3 , а не 1 "
        // В остальных случаях -  вывести  : " Вы ввели что то непонятное "

        Scanner scanner = new Scanner(System.in);

//        int temp = 3;
//        System.out.println("Введите что нибудь:  ");
//        String stringInput = scanner.nextLine();
//        System.out.println("string -> " + stringInput + 1000); // "1234"
//
//        int parseInt = Integer.parseInt(stringInput);
//        System.out.println("int -> " + (parseInt + 1000 ));
//
//        System.out.println("Введите число 1: ");
//        int userInputInt = scanner.nextInt();
//        if (userInputInt == 1 ){
//            System.out.println("Вы ввели число 1");
//        } else if (userInputInt == 3 && temp != 3) {
//            System.out.println("Вы же ввели 3 , а не 1");
//        } else if (userInputInt == 5 ) {
//            System.out.println("Вы же ввели 5 , а не 1");
//        } else {
//            System.out.println(" Вы ввели что то непонятное ");
//        }
//
//        System.out.println("Вышли из оператора if ");


        {
            /*
            Ребенок получил оценку в школе. от 1 до 5.
            У ребенка есть карманные деньги
            за хорошие оценки получает деньги, за плохие отбирают
            5 -> + 20
            4 -> 10
            3 -> 0;
            2 -> 20
            1 -> все


             */
            Random random = new Random();
            int money = 100;
            int note = random.nextInt(5);
            System.out.println("Оценка: " + note);

            if (note == 5) {
                money += 20;
            } else if (note == 4 ) {
                money += 10;
            } else if (note == 3) {

            } else if (note == 2) {
                money -= 20; // money = money - 20
            }else if (note == 1){
                money = 0;
            } else {
                System.out.println("Получена некорректная оценка!");
            }

            System.out.println("У ребенка осталось: " + money + " монет ");



        }


        int var1 = 10;
        int var2 = var1 == 10 ? 20 : var1 - 5;
        System.out.println((var1 == 0) ? "равно 0 " : "не равно 0");
       // System.out.println("var2 " + var2);

        if (var1 > 10) {
            var2 = 20;
        } else {
            var2 = 0;
        }




    }
}
