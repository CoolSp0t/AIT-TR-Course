package homework_06;

import java.util.Random;
import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {



        System.out.println("Task 00");

       Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите число: 1, 2 или 3 и введите его");
        int userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("Вы ввели число: 1 ");
        }else if (userInput == 2 ) {
            System.out.println("Вы ввели число: 2 ");
        }else if (userInput == 3) {
            System.out.println("Вы ввели число: 3 ");
        }else {
            System.out.println("Вы ввели что-то не понятное");
        }


        System.out.println("Task 01");
        Random random = new Random();
        int number = random.nextInt(100);
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        int number3 = random.nextInt(100);

        System.out.println("Первое число : " + number + " Второе число : " + number1 + " Третье число : " + number2 + "  Четвертое  число : " + number3);

        boolean b = (number != 0) & (number >= number1) & (number >= number2) & (number >= number3);
        boolean b1 = (number1 != 0) & (number1 >= number) & (number1 >= number2) & (number1 >= number3);
        boolean b2 = (number2 != 0) & (number2 >= number) & (number2 >= number1) & (number2 >= number3);
        boolean b3 = (number3 != 0) & (number3 >= number) & (number3 >= number1) & (number3 >= number2);

        if (b) {
            System.out.println("Самое большое число: " + number);
        } else if (b1) {
            System.out.println("Самое большое число: " + number1);
        } else if (b2) {
            System.out.println("Самое большое число: " + number2);
        } else if (b3) {
            System.out.println("Самое большое число: " + number3);
        } else {
            System.out.println("Получено некорректное число");
        }

        // второй вариант
        /*
        int max = a;
        if (b > max) {
        max = b;
        }
        max = (c > max) ? c : max ;
        if (d > max) max = d
         */




/*
        программа предлагает пользователю ввести четырехзначное число
        Причем: мы можем получать от пользователя ТОЛЬКО строки. Данные в формате String
        Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
        Проверить, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых двух цифр числа с суммой третьей и четвертой цифры
        Пример :
        число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое
        число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым
 */






            }

        }












