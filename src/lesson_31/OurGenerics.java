package lesson_31;

public class OurGenerics {
    /*
    Обобщения, Дженерики (Generics)
    Дженерики позволяют не указывать конкретный тип, который будет использываться.
    Поэтому мы можем указать что класс является обобщенным с помощью т.е универсального параметра в угловых скобках
    после имени класса. Вместо этого параметра впоследствии можно подставить любой тип


     */

    public static void main(String[] args) {
        Person person1 = new Person("John" , 25);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person person2 = new Person("John2" , "twenty five");
        System.out.println(person2.getName());
        System.out.println(person2.getAge());

        Person<Integer> john = new Person<>("John", 35);
        System.out.println(john.getName());
        System.out.println(john.getAge());


        Person<String> bill = new Person<>("Bill", "forty years");
        System.out.println(bill.getName());
        System.out.println(bill.getAge());

//        Person<Integer> peter = new Person<>("Peter", "twenty");

        // обобщенные методы

        Printer printer = new Printer();
        Integer[] ints = {1,2,3,4,5};
        String[] strings = {"a", "b","c"};
        printer.<Integer>printArray(ints);
        System.out.println();
        printer.<String>printArray(strings);

        // обобщенные интерфейсы


        // несколько универсальных параметров
        Person2<Integer,String> ann = new Person2<>("Ann", 23);
        System.out.println(ann.getName());
        System.out.println(ann.getAge());

        // обобщенные конструкторы
        // - в этом случае перед конструктором также указывают в угловых скобках




    }


}



