package lesson_57.predefined_func_interfaces;

import java.util.function.*;

public class Main {
    // Встроенные функциональные интерфейсы
    // 1. Predicate (предиката) - проверяет соблюдение некоторого условия. Возвращает true либо false соответственно
    /*
    методом предикаты является метод
    public interface Predicate<T>{
        boolean test(T t)
    }
     */
    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num >0;
        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-10));

        //UnaryOperator<T> - принимает объект типа Т, что то с ним делает и возвращает объект типа типа Т
        /*
        public interface UnaryOperator<T>{
            T apply(T obj)
        }
         */
        UnaryOperator<Integer> unaryOperator = num -> num/2;
        System.out.println(unaryOperator.apply(4));

        //Function<T,R> преобразует объект типа Т в объект типа R
        /*
           Function<T,R>{
                R apply(T obj)
           }
         */
        Function<Integer,String> function = String::valueOf;
        System.out.println(function.apply(10));
        Function<Integer,String> function1 = num -> num + "times";
        System.out.println(function1.apply(10));

        // BinaryOperator<T> - принимает два параметра типа T, выполняет с ними операции и возвращает результат
        // типа Т
        /*
        T apply(T object1, T object2)
         */

        BinaryOperator<Integer> sum = Integer::sum;
        System.out.println(sum.apply(1,2));

        /*
        Consumer<T> - что то делает с объектом типа Т и ничего не возвращает
        его метод accept(T t)
         */
        Consumer<String> consumer = System.out::println;
        consumer.accept("hello");

        // Supplier<T> - не принимает ничего, возвращает объект типа Т
        /*
        его метод T get()
        // Todo пример придумать самостоятельно
         */

        /*
        BiFunction<T,U,R> - принимает параметры тип Т,U возвращает объект типа R
        метод apply
         */
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> a+b;
        System.out.println(biFunction.apply(1, 2));
        //Todo придумать самостоятельно пример


        // дефолтные методы предикаты
        // and
        Predicate<Integer> age18 = num -> num > 18;
        Predicate<Integer> age80 = num -> num < 80;
        System.out.println(age18.and(age80).test(12));

        // or
        Predicate<String> containsJava  = str -> str.contains("Java");
        Predicate<String> containsHello = str -> str.contains("Hello");
        System.out.println(containsJava.or(containsHello).test("Hello Java"));
        System.out.println(containsJava.or(containsHello).test("Java"));
        System.out.println(containsJava.or(containsHello).test("Hello"));
        System.out.println(containsJava.or(containsHello).test("world"));

        // negate
        Predicate<Integer> age1= num -> num>18;
        System.out.println(age1.negate().test(19));
    }
}
