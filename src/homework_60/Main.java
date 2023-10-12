package homework_60;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person = new Person("Bob", 10, "Main Street", 1);
        Person person4 = new Person("Bob", 10, "Main Street", 1);
        Person person1 = new Person("Ann", 20, "Main Street", 2);
        Person person5 = new Person("Ann", 20, "Main Street", 2);
        Person person2 = new Person("Jack", 15, "Main Street", 3);
        Person person6 = new Person("Jack", 15, "Main Street", 3);
        Person person3 = new Person("Kate", 30, "Main Street", 4);
        Person person7 = new Person("Kate", 30, "Main Street", 4);
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
//        returnAddress(personList);
        System.out.println(uniqueNames(personList));
        System.out.println(personsByAge(personList));
        personsByAge1(personList).forEach((k,v)-> System.out.println(k+ "->" + v.stream().map(Person::getName).collect(Collectors.toList())));

    }

    /*
    Есть класс Address с полями String street и int houseNumber и класс Person
    с полями String name, int age , Address address.
    Написать метод,принимающий лист Persons и возвращающий лист адресов тех из них, кто старше 17 лет
     */
    public static void returnAddress(List<Person> personList){
        personList.stream()
                .filter(p-> p.age >17)
                .forEach(p-> System.out.println(p.getAddress() + " " +p.getHouseNumber()));
    }

    //Написать метод, принимающий лист имен и возвращающий лист этих имен без повторений

    public static List<String> uniqueNames(List<Person> personList){
       return personList.stream().map(Person::getName).distinct().collect(Collectors.toList());
    }

    public static List<String> uniqueNames2(List<String> namesList){
        return namesList.stream().collect(Collectors.collectingAndThen(toSet(),ArrayList::new));
    }

    // Написать метод, принимающий список Person (из задачи 1) и возвращающий мапу, где возраст является ключом, а лист людей этого возраста значением

    public static Map<Integer, List<Person>> personsByAge (List<Person> personList){
        return personList.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.toList()));
    }
    public static Map<Integer, List<Person>> personsByAge1 (List<Person> personList){
        return personList.stream().collect(Collectors.groupingBy(Person::getAge));
    }
}
