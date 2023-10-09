package lesson_59.streamAPI;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] ints = {10, 20, 30, 40, 50, 60, 70};
        int counter = 0;
        for (int i : ints) {
            if (i < 21) {
                continue;

            }
            i = i * 2;
            counter++;
            if (counter > 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Example with stream");
        IntStream.of(10, 20, 30, 40, 50, 60, 70)
                .filter(i -> i >= 21)
                .map(i -> i * 2)
                .limit(3)
                .forEach(System.out::println);

        /*
        StreamAPI - это поток данных
        Операторы в стримах можно разделить на
        промежуточные - после обработки данных они возвращают стрим. Промежуточных операторов может быть несколько

        терминальные - после обработки элементов завершают работу стрима. Т.е. терминальный оператор может быть только один

        Обработка данных не начнется пока не будет вызван терминальный оператор

        Варианты создания стримов


         */
        Stream<String> empty = Stream.empty(); // создание пустого стрима

        Collection<String> collection = Arrays.asList("One", "Two", "Three"); // стрим коллекции
        collection.stream();

        String[] array = {"One", "Two", "Three"}; // стрим массива
        Arrays.stream(array);

        String s = "abcde";
        s.chars(); // стрим строки

        Stream.of("one", "two"); // c помощью статического метода of

        // Стримы примитивов
        IntStream intStream = IntStream.of(1, 2, 3);
        IntStream.range(1, 3); // создание стрима целых чисел в диапазоне от 1 до 3, 3 не включая
        IntStream.rangeClosed(1, 3); // создание стрима целых чисел в диапазоне от 1 до 3, 3 включая

        // стрим примитивов с помощью класса Random
        Random random = new Random();
        random.doubles();


        // метод forEach - перебор элементов , терминальный оператор
        Stream<String> fruits = Stream.of("Apple", "Orange", "Lemon", "Kiwi");
        fruits.forEach(str -> System.out.println(str));

        // промежуточные операторы
        // filter() - принимает условие (предикату) и возвращает поток , удовлетворяющих этому условию
        // fruits = Stream.of("Apple","Orange","Lemon","Kiwi");
        System.out.println("after filter");
//        fruits.filter(str -> str.length() == 5).forEach(System.out::println);

        Stream<Car> cars = Stream.of(new Car("Mercedes", 100000)
                , new Car("Volvo", 80000)
                , new Car("Betnley", 500000));
        cars.filter(car -> car.getPrice() < 200000).forEach(car -> System.out.println(car.name));

        // map() - маппинг, отображение - преобразует элементы потока(из одного типа в другой например)
        // map(Function mapper)
        System.out.println("mapping brand");
        cars = Stream.of(new Car("Mercedes", 100000)
                , new Car("Volvo", 80000)
                , new Car("Betnley", 500000));
        cars.filter(car -> car.getPrice() < 200000)
                .map(Car::getName)
                .forEach(System.out::println);

        cars = Stream.of(new Car("Mercedes", 100000)
                , new Car("Volvo", 80000)
                , new Car("Betnley", 500000));
        cars.map(car -> "brand: " + car.getName() + " price: " + car.getPrice()).forEach(System.out::println);

//        //flatMap
//        String[] names = {"Jack", "Ann"};
//        Stream<String> streamNames = Arrays.stream(names);
//        streamNames.map(str-> str.split(" ")).

        //sort() - сортировка
        System.out.println("sorting");
        List<String> carlist = new ArrayList<>();
        carlist.add("mercedes");
        carlist.add("volvo");
        carlist.add("bentley");
        carlist.add("opel");
        carlist.stream()
                .filter(car -> car.length() > 4)
                .sorted()
                .forEach(System.out::println);
    }
}
