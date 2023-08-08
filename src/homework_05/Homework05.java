package homework_05;

import java.util.Random;

public class Homework05 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Task 00");
        int randomInt = random.nextInt(20);
        int randomInt1 = random.nextInt(20);
        int randomInt2 = random.nextInt(20);
        int randomInt3 = random.nextInt(20);
        int randomInt4 = random.nextInt(20);
        int randomInt5 = random.nextInt(20);
        int randomInt6 = random.nextInt(20);
        int randomInt7 = random.nextInt(20);
        int randomInt8 = random.nextInt(20);
        int randomInt9 = random.nextInt(20);

        boolean evenNumber = (randomInt %2) == 0, evenNumber1 = (randomInt1 %2) == 0, evenNumber2 = (randomInt2 %2) == 0,evenNumber3 = (randomInt3 %2) == 0,evenNumber4 = (randomInt4 %2) == 0,evenNumber5 = (randomInt5 %2) == 0,evenNumber6 = (randomInt6 %2) == 0,evenNumber7 = (randomInt7 %2) == 0,evenNumber8 = (randomInt8 %2) == 0,evenNumber9 = (randomInt9 %2) == 0;

        boolean multipleNumber = (randomInt %3) == 0, multipleNumber1 = (randomInt1 %3) == 0, multipleNumber2 = (randomInt2 %3) == 0,multipleNumber3 = (randomInt3 %3) == 0,multipleNumber4 = (randomInt4 %3) == 0,multipleNumber5 = (randomInt5 %3) == 0,multipleNumber6 = (randomInt6 %3) == 0,multipleNumber7 = (randomInt7 %3) == 0,multipleNumber8 = (randomInt8 %3) == 0,multipleNumber9 = (randomInt9 %3) == 0;

        boolean bothNumber = evenNumber & multipleNumber,bothNumber1 = evenNumber1 & multipleNumber1, bothNumber2 = evenNumber2 & multipleNumber2, bothNumber3 = evenNumber3 & multipleNumber3, bothNumber4 = evenNumber4 & multipleNumber4, bothNumber5 = evenNumber5 & multipleNumber5, bothNumber6 = evenNumber6 & multipleNumber6, bothNumber7 = evenNumber7 & multipleNumber7, bothNumber8 = evenNumber8 & multipleNumber8, bothNumber9 = evenNumber9 & multipleNumber9;

        System.out.println("Число: " + randomInt + " четное: " + evenNumber + "," + " кратность: " + multipleNumber +  "," + " четное и кратность: " +bothNumber );
        System.out.println("Число: " + randomInt1 + " четное: " + evenNumber1 + "," + " кратность: " + multipleNumber1 +  "," + " четное и кратность: " +bothNumber1 );
        System.out.println("Число: " + randomInt2 + " четное: " + evenNumber2 + "," + " кратность: " + multipleNumber2 +  "," + " четное и кратность: " +bothNumber2 );
        System.out.println("Число: " + randomInt3 + " четное: " + evenNumber3 + "," + " кратность: " + multipleNumber3 +  "," + " четное и кратность: " +bothNumber3 );
        System.out.println("Число: " + randomInt4 + " четное: " + evenNumber4 + "," + " кратность: " + multipleNumber4 +  "," + " четное и кратность: " +bothNumber4 );
        System.out.println("Число: " + randomInt5 + " четное: " + evenNumber5 + "," + " кратность: " + multipleNumber5 +  "," + " четное и кратность: " +bothNumber5 );
        System.out.println("Число: " + randomInt6 + " четное: " + evenNumber6 + "," + " кратность: " + multipleNumber6 +  "," + " четное и кратность: " +bothNumber6 );
        System.out.println("Число: " + randomInt7 + " четное: " + evenNumber7 + "," + " кратность: " + multipleNumber7 +  "," + " четное и кратность: " +bothNumber7 );
        System.out.println("Число: " + randomInt8 + " четное: " + evenNumber8 + "," + " кратность: " + multipleNumber8 +  "," + " четное и кратность: " +bothNumber8 );
        System.out.println("Число: " + randomInt9 + " четное: " + evenNumber9 + "," + " кратность: " + multipleNumber9 +  "," + " четное и кратность: " +bothNumber9 );



        System.out.println("Task01");

        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | (45 < 70) & false ^ (6 == 5));
        System.out.println((true | false) | false ^ (6 == 5));
        System.out.println((true | false) | false);
        System.out.println(true  | false);
        System.out.println(true);

//      Второе решение задачи  00
        int var1 = random.nextInt(20);
        checkNumber(var1);

        System.out.println(checkNumber(var1));
    }

    public static String checkNumber(int x ) {
        boolean b1 = (x != 0) & (x % 2 == 0);  // x = 1 -> (true) & (???)
        boolean b2 = (x != 0) & (x % 3 == 0);  // x = 0 -> (false) & (???)
        boolean b3 = (b1 && b2);

        String resultString = "Число: " + x + " четное: " + b1 + "," + " кратность: " + b2 +  "," + " четное и кратность: " + b3;

        return resultString;

    }


}
