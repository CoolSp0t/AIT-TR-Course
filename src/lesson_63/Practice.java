package lesson_63;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    /*
    Используя стримы, написать метод, принимающий лист стрингов в формате "13 Oct 2023"
    и возвращающий упорядоченный по возрастанию дат лист стрингов в формате "Fri, 13 Oct 2023"
     */
    public static void main(String[] args) {
        List<String> dates = new LinkedList<>();
        Collections.addAll(dates, "13 Oct 2023", "15 Oct 2023", "10 Oct 2023");
        System.out.println(sortedDates(dates));

        String input = "aaaaaaaa fffffffffff ab bbbbbb a bbb aaa ttttttttttt";
        System.out.println(words(input, "a"));
    }

    public static List<String> sortedDates(List<String> list) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy", new Locale("en"));
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd MMM yyyy", new Locale("en"));

        return list
                .stream()
                .map(str -> createLocalDate(str))
                .sorted()
                .map(date -> createSt(date))
                .collect(Collectors.toList());
    }

    private static LocalDate createLocalDate(String s) {
        return LocalDate.parse(s, DateTimeFormatter.ofPattern("dd MMM yyyy", new Locale("en")));
    }

    private static String createSt(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("EEE, dd MMM yyyy", new Locale("en")));
    }

    /*
    Написать метод, принимающий строку и возвращающий количество слов, начинающихся в этой строке
    с определенной буквы.  Между словами только пробел. Слова состоят из маленьких букв латинского алфавита
    В решении использовать стримы
    Пример: "aaaaaaaa fffffffffff ab bbbbbb a bbb aaa ttttttttttt", "a" -> 4
     */

    public static long words(String input, String startLetter) {
        String[] strings = input.split(" ");
        return Arrays.stream(strings).filter(s -> s.indexOf(startLetter) == 0).count();

    }


    /*
     Пусть есть класс BankAccount  с полем  String IBAN   и класс Person c  полями name и List<BankAccount>.
     Нужно написать метод, который вернет список IBANs  с номерами замененными звездочкой после 3 третьего символа
     */

    public static List<String> bankAccounts(List<Person> personList){
        return  personList.stream()
                .flatMap(ba->ba.getBankAccounts().stream())
                .map(BankAccount::getIBAN)
                .map(Practice::replaceWithStars)
                .collect(Collectors.toList());

    }
    public static String replaceWithStars(String string){
        char[] chars = string.toCharArray();
        for (int i = 3; i < chars.length; i++) {
            chars[i] = '*';
        }

        return new String(chars);
    }




}
