package homework_59;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person = new Person("Bob", 10, "Main Street", 1);
        Person person1 = new Person("Ann", 20, "Main Street", 2);
        Person person2 = new Person("Jack", 15, "Main Street", 3);
        Person person3 = new Person("Kate", 30, "Main Street", 4);
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        returnAddress(personList);

    }
    public static void returnAddress(List<Person> personList){
        personList.stream()
                .filter(p-> p.age >17)
                .forEach(p-> System.out.println(p.getAddress() + " " +p.getHouseNumber()));
    }
}
