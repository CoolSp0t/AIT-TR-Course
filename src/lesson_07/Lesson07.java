package lesson_07;

import java.util.Scanner;

public class Lesson07 {
    public static void main(String[] args) {

//        int x = 5;
//
//        switch (x){
//            case 1: {
//                System.out.println(" х равен 1");
//                break;
//            }
//            case 2: {
//                System.out.println(" х равен 2");
//                break;
//            }
//            case 3:{
//                System.out.println( "х равен 3");
//                break;
//            }
//            default: {
//                System.out.println("Введено какое то другое число");
//            }
//        }

//        if( x == 5) System.out.println("if: х равен 5");


//        int myMoney = 100;
//
//        int incoming = 20;
//
//        switch (incoming) {
//            case 0: {
//                myMoney += 5;
//                break;
//            }
//            case 10: {
//                myMoney += 25;
//                break;
//            }
//            case 20: {
//                myMoney += 75;
//                break;
//            }
//            default: {
//                myMoney += incoming;
//            }
//
//        }
//        System.out.println("end money:" + myMoney);



//        System.out.println("У меня есть загадка:");
//        System.out.println("Что такое: желтый, большой , с рогами и полный зайцев?");
//        System.out.println("Как думаешь?");
//
//        Scanner scanner = new Scanner(System.in);
//        String answer = scanner.nextLine();
//
//        char firstCharSubstring = answer.trim().toLowerCase().substring(1,3).charAt(0);
//        System.out.println(firstCharSubstring);
//        answer = answer.trim().toLowerCase();
//
//        switch ( answer) {
//            case "троллеуйбус!":
//            case "троллейбус": {
////            case "Троллейбус":
//                System.out.println("Правильно! Ты, наверное, нагуглил?");
//                break;
//            }
//            case "сдаюсь!":
////            case "Сдаюсь":
//            {
//                System.out.println("Очень жаль. Правилный ответ Троллейбус");
//                break;
//            }
//        }



        /*
        Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
         а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
         если
         */

        String result = "";

        int myChoise = 4;

        switch (myChoise) {
            case 1: {
                result = "Вы ввели один";
                break;
            }
            case 2:{
                result = "Вы ввели два";
                break;
            }
            case 3:{
                result = "Вы ввели три";
                break;
            }
            case 4:
            case 5: {
                result = "Вы ввели 4 или 5";
                break;
            }
            default:{
                result = "Строка по умолчанию";
            }
        }

        System.out.println("Result string: " + result);



//       From Java 14 + code
//        int myChoice = 1;
//        int resInt;
//
//        result = switch (myChoice) {
//            case 1 -> "Вы ввели один";
//            case 2 -> "Вы ввели два";
//            case 3 -> "Вы ввели три";
//            case 4, 5 -> "Вы ввели 4 или 5";
//            default -> "Строка по умолчанию";
//        };


    }
}
