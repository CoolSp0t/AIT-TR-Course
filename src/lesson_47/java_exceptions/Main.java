package lesson_47.java_exceptions;

import java.util.Scanner;

public class Main {
    /*
    Exceptions(исключения)

    Ошибки наследуют класс Throwable и делятся на ошибки, возникающие в джава-машине(вне нашего контроля) и исключения
    (то, что можно обрабатывать в программе)
     */

    public static void main(String[] args) {
        int num1, num2;

//        Scanner scanner =new Scanner(System.in);
//
//
//        System.out.println("Enter first number");
//        num1 = scanner.nextInt();
//
//        System.out.println("Enter second number");
//        num2 = scanner.nextInt();

        try {
            num1 = 4;
            num2 = 0;
            int divide = num1 / num2;
//            System.out.println("num1/num2: " + divide);
//            System.out.println("End for try block");
        } catch (ArithmeticException exception) {
//            System.out.println("Do not divide by zero!");
//            System.out.println(exception.getMessage());
        }

//        System.out.println("After exception occurred");




    /*
    Типы исключений
    Исключения бывают "Встроенные" и написанные пользователем

    Встроенные исключения делятся на две категории:
    Checked(проверяемые) и Unchecked Exceptions(не проверяемые исключения)

    Важные определения при работе с исключениями:
    1. try - код, который может вызвать появление исключения помещается внутрь блока try.
        Блок try определяет - произошло ли исключение и если да, то передает управление программой соответствующему
        блоку catch или блоку finally

    2. catch - это блок, в котором содержится код для обработки возникшего исключения. Блок catch выполняется только
        в том случае если произошло исключение и существует в связке с блоком try.

    3. finally - этот блок будет выполняться всегда независимо от того, произошло ли исключение или нет.

    4. throw - используется для того, чтобы бросить исключение.

    5. throws - используется в сигнатуре метода и указывает на то, что метод может бросить исключение

    TRY-CATCH блок
    try {
     блок кода
    } catch(Exception e){
     код для обработки исключения
    }

    Одному блоку try может соответствовать несколько блоков catch, каждый из которых отвечает за обработку своего
    вида исключений.
    Можно также создать блок catch, который будет отлавливать все исключения. В этом случае должен
    ловить Exception e и стоять последним после всех остальных блоков catch, ловящих отдельные исключения и относящиеся
    к одному и тому же блоку try



     */
        int[] ints  = {1,2,2};

        try {
            String nullString = null;
            nullString.length();
            num1 = ints[1];
            num2 = ints[2];
            int divide = num1 / num2;
//            System.out.println("num1/num2: " + divide);
//            System.out.println("End for try block");
        }catch (ArithmeticException exception){
            System.out.println("Do not divide by zero!");
            System.out.println(exception.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Exception occurred");
            System.out.println(e.getMessage());
        }



//        System.out.println("After exception occurred");



        int[] numbers = {4,8,16,32,64,128,256,512};
        int[] dividers = {2,0,4,8,0,8};
        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + " / " +  dividers[i] + " = " + numbers[i]/dividers[i]);
            }catch (ArithmeticException e){
                System.out.println("Can`t divide by zero!");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("dividers array is finished and no matching element was not found");
            }
        }

        /*
        блок finally



        try{
         блок кода
        }catch{
         обработка исключения}
         finally{
          код который должен выполнится в любом случае
          }
         */
        try {
            int a = 100/1;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This is finally block");
        }

        System.out.println("we are out of the try-catch-finally");



    }


}


