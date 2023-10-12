package lesson_61;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoreCollectorsFromStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ann", "Kate", "Bill");
        System.out.println(convertToString(names));
        System.out.println(convertToStringComma(names));
        System.out.println(convertToStringWithPrefix(names));

        // Параллельные потоки
        /*
        два метода превращения потока из последовательного в параллельный
        1. метод parallel из Stream
        2. метод parallelStream() из интерфейса Collection
         */
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> result = numbers.parallel().reduce(Integer::sum);
        System.out.println(result.get());
        names = Arrays.asList("Ann", "Kate", "Bill", "John", "Jack");
        System.out.println("regular stream");
        names.stream().filter(name -> name.length() > 3).forEach(System.out::println);
        System.out.println("\nparallel stream");
        names.parallelStream().filter(name -> name.length() > 3).forEach(System.out::println);
    }

    // сосчитать количество элементов в листе
    public static long countElements(List<String> list) {
        return list.stream().collect(Collectors.counting());
    }

    public static int maxElt(List<Integer> list) {
        return list.stream().max(Comparator.naturalOrder()).get();

    }
    //joining() - собирает элементы в строку

    //объединить имена из листа в следующую строку:

    public static String convertToString(List<String> names) {
        return names.stream().collect(Collectors.joining());
    }

    //объединить имена из листа в следующую строку:
    // name1,name2,name3
    public static String convertToStringComma(List<String> names) {
        return names.stream().collect(Collectors.joining(", "));
    }

    //объединить имена из листа в следующую строку:
    // Students: name1,name2,name3 study Java
    public static String convertToStringWithPrefix(List<String> names) {
        return names.stream().collect(Collectors.joining(", ", "Students: ", " study Java"));
    }


}
