package homework_06;

import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 4-х значное число: ");
        String numberInString = scanner.nextLine();

        if (numberInString.length() != 4) {
            System.out.println("Не верный ввод");
        } else {
            int number = Integer.parseInt(numberInString);
//                System.out.println("number start: " + number);

            int digit1 = number % 10;
//                System.out.println("last digit " + digit1);
            number = number / 10;
//                System.out.println("number after cut " + number);

            int digit2 = number % 10;
//                System.out.println("digit2 " + digit2);
            number /= 10;
//                System.out.println("number after second cut " + number);

            int digit3 = number % 10;
            int digit4 = number / 10;

            if (digit1 + digit2 == digit3 + digit4) {
                System.out.println("Ура! число счастливое!");
            } else {
                System.out.println("Число НЕ является счастливым");
            }
        }

        System.out.println("Variant 2: ==========");
        if (numberInString.length() == 4) {
            char ch0 = numberInString.charAt(0);
            char ch1 = numberInString.charAt(1);
            char ch2 = numberInString.charAt(2);
            char ch3 = numberInString.charAt(3);

            // 0..1 -> десятичный код
            System.out.println(((int) '0') + " -> 0");
            System.out.println(((int) '1')  + " -> 1");
            System.out.println(((int) '2')+ " -> 2");
            System.out.println(((int) '3') + " -> 3");

            System.out.println("++++++++++++++++++++");

            System.out.println(((int) ch0 - 48) + " -> " + ch0);
            System.out.println(((int) ch1 - 48)  + " -> " + ch1);
            System.out.println(((int) ch2 - 48)+ " -> " + ch2);
            System.out.println(((int) ch3 - 48) + " -> " + ch3);

            if ((int)ch0 + ch1 == (int) ch2 + ch3) {
                System.out.println("Число счастливое!");
            } else {
                System.out.println("Число НЕ является счастливым");
            }


        } else {
            System.out.println("Все пропало. Число не 4-х значное");
        }




















    }
}
