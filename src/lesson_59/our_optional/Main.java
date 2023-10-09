package lesson_59.our_optional;

import java.util.Optional;

public class Main {
    /*
    Класс Optional - предоставляет дополнительные возможности обработки null

    Создание объекта класса

     */
    public static void main(String[] args) {
        // пустой"контейнер"
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        // создание не пустого объекта
        String name = "John";
        Optional<String> optName = Optional.of(name);
        System.out.println(optName.isPresent());

        String nullString = null;
//        Optional<String> optNull = Optional.of(nullString);
//        System.out.println(optNull.isPresent());

        Optional<String> optNull2 = Optional.ofNullable(nullString);
        System.out.println(optNull2.isPresent());

        // метод isPresent() используется для проверки наличия внутри объекта Optional значения.
        // Если есть - то возвращается true и false если нет

        // Метод ifPresent()
        if(name != null ){
            System.out.println(name.length());
        }

        Optional<String> optional = Optional.of("Java");
        optional.ifPresent(str -> System.out.println(str.length()));

        // методы для получения значения из Optional
        // orElse()

        String nullName = null;
        nullName = "John";
        String kate = Optional.ofNullable(nullName).orElse("Kate");
        System.out.println(kate);

        // orElseGet()
        nullName = null;
        String anotherName = Optional.ofNullable(nullName).orElseGet(()->"Kate");
        System.out.println(anotherName);

        // orElseThrow - кидает exception если null
//        String nameEx = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
//        String nameEx = Optional.ofNullable(nullName).orElseThrow();

        // get()
        Optional<String> newWord = Optional.of("hello");
        String hello = newWord.get();
        System.out.println(hello);

        Optional<String> newWordNull = Optional.ofNullable(null);
//        newWordNull.get();

    }
}
