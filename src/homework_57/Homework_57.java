package homework_57;

import java.util.function.*;

public class Homework_57 {
    public static void main(String[] args) {
        //  1. Конкатинировать числа a и b
        BiFunction<Integer,Integer,String> function = (num, num2) -> Integer.toString(num)+Integer.toString(num2);
        System.out.println(function.apply(1, 2));

        // 2. Если длина строки равна трем вернуть true иначе false
        Predicate<String> predicate = str -> str.length() == 3;
        System.out.println(predicate.test("abc"));

        // 3. Если длина строки четная вернуть true иначе false
        Predicate<String> predicate1 = str -> (str.length() % 2) == 0;
        System.out.println(predicate1.test("abcd"));

        // 4. Вернуть строку в верхний регистр
        UnaryOperator<String> unaryOperator = str -> str.toUpperCase();
        System.out.println(unaryOperator.apply("abcd"));

        // 5. Если длина строки равна 4 вернуть 4 звездочки **** вернуть строку без изменений
        UnaryOperator<String> unaryOperator1 = str -> str.length() == 4 ? "****":str;
        System.out.println(unaryOperator1.apply("abcd"));

        // 6. Распечатать строку в виде !строка!
        Consumer<String> consumer = str -> System.out.println("!" +str + "!");
        consumer.accept("abcd");

        // 7. Печатает "Hello World"
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());



    }
}
