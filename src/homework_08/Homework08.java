package homework_08;


import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {


//        System.out.println("Task 00");
//        int var1 = 1;
//
//        while (var1 <=10) {
//            System.out.println("Task" + var1++);
//        }
//
//
//
//        System.out.println("Task 01");
//        int number1 = 1;
//
//        do {
//            if (number1 % 5 == 0){
//                System.out.println(number1);
//            }
//            number1++;
//        }while (number1 <=100);




        System.out.println("Task 02");
        int number = 1;
        int counter = 1;


        while ( number <=100 && counter < 7) {
            if (number % 5 == 0 ){
                System.out.println(number + " ");
                counter++;
            }
            number++;
        }

//
//        System.out.println("Task 03");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите слово hello");
//        String str = scanner.nextLine();
//        while (!str.equals("hello")) {
//            System.out.println("Вы ввели не верное слово");
//            str = scanner.nextLine();
//        }
//        System.out.println("вы ввели правильное слово");
//
//



//
//        int attempts = 0;
//        do {
//            System.out.println("Введите слово хеллоу");
//            String answer = scanner.nextline();
//            attempts++;
//        }while (!answer.trim().equals("Hello"));
//        System.out.println("Благодарность, вы затратили" + attempts );


        Scanner scanner3 = new Scanner(System.in);
        int userNumber;
//        int digitForChar = userNumber;
        System.out.println("введите число: ");
        userNumber = scanner3.nextInt();
        System.out.println("number:" + userNumber);


        int sumDigit = 0;
        while (userNumber > 0){
            int digit = userNumber % 10;
            sumDigit = sumDigit + digit;
            userNumber = userNumber / 10;
        }

        System.out.println(sumDigit);


//        System.out.println("Option2 -----------");
//        String strNumber = String.valueOf(digitForChar);
//        System.out.println("String:" + strNumber);
//        int y = 0;
//        int sum1 = 0;
//
//        while(y < strNumber.length()){
//            int digit = Integer.parseInt(String.valueOf(strNumber.charAt(y++)));
//            System.out.print(digit + " + ");
//
//            sum1 += digit;
//        }
//        System.out.println(sum1);


    }


}
