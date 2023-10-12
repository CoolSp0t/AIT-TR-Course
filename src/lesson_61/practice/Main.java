package lesson_61.practice;

import homework_60.Person;
import lesson_28.B;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    // another flatMap example
    /*
    flatMapToInt()
    IntStream
     */
    public static void main(String[] args) {
//        Stream.of(1,2,0,1,3)
//                .flatMapToInt(i -> IntStream.range(0,i))
//                .forEach(System.out::print);
//
//        Stream.of(1,2,0,1,3)
//                .map(i -> IntStream.range(0,i))
//                .forEach(System.out::print);

        BankAccount bankAccount = new BankAccount("dasdasdas",new Person1("Peter"));
        BankAccount bankAccount1 = new BankAccount("dasdasdas",new Person1("John"));
        BankAccount bankAccount2 = new BankAccount("dasdasdas",new Person1("Jack"));
        BankAccount bankAccount3 = new BankAccount("dasdasdas",new Person1("Paul"));
        List<BankAccount> bankAccountList = Arrays.asList(bankAccount,bankAccount1,bankAccount2,bankAccount3);
        BankAccount(bankAccountList).forEach((k,v)-> System.out.println(k.getName()+ v.stream().map(BankAccount::getIBAN).collect(Collectors.toList())));
        System.out.println(BankAccountWithStars(bankAccountList));

    }

    // Есть классы Person1, BankAccount нужно написать метод, принимающий лист BankAccounts и возвращающий мапу где Person1 ключом а лист счетом значение

    public static Map<Person1, List<BankAccount>> BankAccount(List<BankAccount> list) {
        return  list.stream().collect(Collectors.groupingBy(BankAccount::getOwner));
    }

    // 2. Есть класс BankAccount. Нужно написать метод, принимающий лист BankAccounts и
    // возвращающий лист IBANNs со звездочкой после третьего символа
    // DE4****************,DE5*******************,

    public static List<String> BankAccountWithStars(List<BankAccount> list){
        return list.stream().map(a-> replaceWithStars(a.getIBAN())).collect(Collectors.toList());
    }
    private static String replaceWithStars(String string){
        char[] chars = string.toCharArray();
        for (int i = 3; i < chars.length; i++) {
            chars[i] = '*';
        }

        return new String(chars);
    }
}
