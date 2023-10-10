package lesson_60;

import lesson_28.A;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //flatMap()
        String[] strings = {"Hello", "Java"};
        Arrays.stream(strings)
                .map(str -> str.split(""))
                .map(Arrays::stream)
                .forEach(System.out::println);

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        //distinct() - возвращает только уникальные элементы

        Stream.of("one ", "two", "three", "one", "two")
                .distinct()
                .forEach(System.out::println);


        // skip(long n) - пропускает первые n элементов

        // limit(long n) - возвращает поток в котором не более n первых элементов

        List<String> arr = Arrays.asList("one", "two", "three", "four", "five");
        arr.stream()
                .skip(1)
                .limit(3)
                .forEach(System.out::println);


        // terminal operators | Операции сведения(терминальные)
        /*
        операции, возвращающие результат

        count() - возвращает количество элементов в потоке
         */

        System.out.println(arr.stream().filter(s -> s.length() > 3).count());

        /*
        findFirst(), findAny()
         */


        Optional<String> first = arr.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = arr.stream().findAny();
        System.out.println(any.get());

        //boolean allMatch(), anyMatch(), noneMatch()
        /*
        allMatch(predicate) - true , если все элементы удовлетворяют условия предикаты
        anyMatch(predicate) - true , если хотя бы 1 элемент удовлетворяет условия предикаты
        noneMatch(predicate) - true , если ни один элементы не удовлетворяет условия предикаты

         */


        List<String> names = Arrays.asList("Jack","John","Ann","Benjamin");
        boolean allElements =  names.stream().allMatch(name -> name.length()>2);
        System.out.println(allElements);

        boolean anyElement = names.stream().anyMatch(name-> name.length() >6);
        System.out.println(anyElement);

        boolean noneElement = names.stream().anyMatch(name-> name.length() >10);
        System.out.println(noneElement);

        //min и max - возвращает минимальное или максимальное значение
        /*
        Optional<T> min (T comparator)

         */
        List<Integer> ints = Arrays.asList(1,2,34,5,60,21);
        Optional<Integer > minElt =  ints.stream().min(Integer::compare);
        System.out.println(minElt.get());

        Optional<Integer> maxElt = ints.stream().max(Integer::compare);
        System.out.println(maxElt.get());



        //reduce()
       Optional<Integer> res =   Stream.of(1,2,3,4,5).reduce((a,b)-> a *b );
        System.out.println(res.get());

        // el1*el2*el3*el4

        Optional<String> strRes= Stream.of("Hello","Java","!").reduce((str1,str2)-> str1+ " "+ str2);
        System.out.println(strRes.get());

        //reduce() - 2

        int result = res.stream().reduce(1,(a,b) -> a * b); // 1 идет как изначальное число
        System.out.println(result);

        List<Integer> emptyList = new ArrayList<>();
        Optional<Integer> minEle =  emptyList.stream().min(Integer::compare);
        if(minEle.isPresent()){
            minEle.get();
        }

        System.out.println(minEle.orElse(-1));
        Random random = new Random();
        System.out.println(minEle.orElseGet(() -> random.nextInt(10)));

        minEle.ifPresent(elt -> System.out.println(elt));
        minEle.ifPresentOrElse(elt -> System.out.println(elt),()-> System.out.println("Empty!"));


        // collect(collector)
        // Collector<T,A,R> collector
        // Некоторые методы класса Collectors

        /*
        toList() - собирает в лист
        toSet()
        toMap()
         */

        List<String> cars = new ArrayList<>();
        cars.add("mercedes");
        cars.add("volvo");
        cars.add("opel");
        cars.add("ford");
        cars.add("bmw");

        List<String> carsFiltered = cars.stream().filter(car -> car.length() >3).collect(Collectors.toList());
        System.out.println(carsFiltered);

        Set<String> carsSet = cars.stream().filter(car -> car.length() >3).collect(Collectors.toSet());

        Car car1 = new Car("mercedes", 100000);
        Car car2 = new Car("bmw", 150000);
        Car car3 = new Car("ford", 200000);

        List<Car> carList = Arrays.asList(car1,car2,car3);
        Map<String,Integer> carMap = carList.stream().collect(Collectors.toMap(car -> car.getBrand(),car -> car.getPrice()));
        carMap.forEach((key,value)-> System.out.println("key: " + key + " | " + "value: " + value+ " €"));

        ArrayList<Car> carArrayList = carList.stream().collect(Collectors.toCollection(ArrayList::new));

        // groupingBy collector - используется для группировки объектов по заданному свойству и сохранения
        // результата в мапе. Например:
        /*
        написать метод, группирующий элементы листа строк в зависимости от длины строки и группирующий результаты в сетах
         */
        System.out.println("-----GroupingBy----------");
        List<String> namesList = Arrays.asList("John", "Jack","Ann","Bill","Peter","Eugen");
        System.out.println(namesByLength(namesList));

        /*
        partitioningBy - особый случай метода groupingBy принимающий предикату и собирающий элементы стрима в мапу
        в которой в качестве ключей будут булеановские значения а  в качестве значений - коллекции элементов.
        ключ true - коллекция элементов удовлетворяющих условия предикаты,
        false - не удовлетворяющих

        Пример: написать метод, разделяющий элементы листа стрингов по длине строки > 4 и возвращающий мапу с ключами true false и листами соответствующих элементов
         */

        System.out.println("--------------------PartitioningBy------------");
        System.out.println(partitioningList(namesList));
    }

        public static Map<Integer,Set<String>> namesByLength(List<String> list){
        return list.stream().collect(Collectors.groupingBy(String::length,Collectors.toSet()));
        }


        public static Map<Boolean,List<String>> partitioningList(List<String> list){
         return list.stream().collect(Collectors.partitioningBy(str-> str.length()>4));
        }
}
