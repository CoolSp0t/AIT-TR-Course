package homework_07;

import java.util.Random;
import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {





        System.out.println("Task 00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: 1 , 2 или 3 ");
        int inputUser = scanner.nextInt();

        switch (inputUser) {
            case 1 : {
                System.out.println("Вы ввели 1 ");
                break;
        }
            case 2 :{
                System.out.println("Вы ввели 2 ");
                break;
            }
            case 3: {
                System.out.println("Вы ввели 3 ");
                break;
            }
            default:{
                System.out.println("Введено неверное число");
            }

        }





        System.out.println("Task 01");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7 ");
        int daysChecker = scanner1.nextInt();

        switch (daysChecker) {
            case 1 : {
                System.out.println("Понедельник");
                break;
            }
            case 2 : {
                System.out.println("Вторник");
                break;
            }
            case 3 : {
                System.out.println("Среда");
                break;
            }
            case 4 : {
                System.out.println("Четверг");
                break;
            }
            case 5 : {
                System.out.println("Пятница");
                break;
            }
            case 6:
            case 7: {
                System.out.println("Выходной");
                break;
            }
            default: {
                System.out.println("Неверный ввод");
            }


        }







        System.out.println("Task 02");
        Random random = new Random();
        int note = random.nextInt(13);
        int watchTime = 45;
        System.out.println("Я получил " + note);

        switch (note) {
            case 12:
            case 11:
            case 10: {
                watchTime += 60;
                System.out.println("Я очень рад, ты можешь смотреть сегодня ТВ: " + watchTime + " минут");
                break;
            }
            case 9:
            case 8:
            case 7:{
                watchTime += 45;
                System.out.println("Молодец, ты можешь сегодня смотреть ТВ: " + watchTime + " минут");
                break;
            }
            case 6:
            case 5:
            case 4:{
                watchTime += 15;
                System.out.println("Бывает, в следующий раз будешь лучше, сегодня смотришь ТВ: " + watchTime + " минут");
                break;
            }
            case 3:{
                watchTime -= 30;
                System.out.println("Я не доволен тобою, за это я отнимаю у время и ты смотришь ТВ: " + watchTime + " минут");
                break;
            }
            case 2:
            case 1:{
                watchTime = 0;

                System.out.println("Ты получил плохую оценку, твой просмотр ТВ равняется: " + watchTime  + " минут" );
                break;
            }
            default:{
                System.out.println("Ты не получил оценку сегодня смотришь:" + watchTime + "минут");
            }



        }








    }

}
