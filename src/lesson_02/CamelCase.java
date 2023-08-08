package lesson_02;

public class CamelCase {
    public static void main(String[] args) {
//        комментарий к коду - Ctrl + /
//        дублирование строки - Ctrl + D
//        дублирование строки - Ctrl + D
//        откат - Ctrl + Z
//        ренейм чего либо - Shift + F6
//        удаление строки - Ctrl + Y
        int myFirstVariable; // декларация (объявление) переменной
        myFirstVariable = 25; // инициализация переменной (присвоение значения)

        int mySecondVariable = 2;

        System.out.println("my first variable: " + myFirstVariable);
        System.out.println(mySecondVariable);

        // обьявляем переменную типа byte
        byte byteVariable = 25;

        // обьявляем переменную типа short
        short shortVariable;
        shortVariable = 32000;

        // обьявляем переменную типа long
        long longVariable = 22_100_000_000L;
        System.out.println(longVariable);

        double doubleVar;
        doubleVar = 1.5665;
//        doubleVar = 1.5;


    }

}
