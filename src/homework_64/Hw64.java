package homework_64;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hw64 {

    /*
    Пусть есть класс Person с полями String name и int age.

Написать метод, принимающий лист Persons и возвращающий суммарный возраст тех, кто старше 17 лет
Написать метод, принимающий лист Persons и возвращающий имена тех, кто старше 17 лет в виде строки.
 Должна быть возвращена строка примерно такого вида: In this list John and Peter and Ann are older than 17 (В этом списке Джон и Питер и Анн старше 17 лет)
     */

    public static int ageAllOlder17(List<Person> people){
        return  people
                .stream()
                .filter(p ->p.getAge() > 17)
                .map(Person::getAge)
                .reduce(0, Integer::sum);
    }

    public static int ageAllOlder17Int(List<Person> people){
        return  people
                .stream()
                .filter(p ->p.getAge() > 17)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static String nameOlder17(List<Person>people){
        return  people
                .stream()
                .filter(p -> p.getAge()>17)
                .map(Person::getName)
                .collect(Collectors.joining("and ","In this list "," are older than 17"));
    }
}
