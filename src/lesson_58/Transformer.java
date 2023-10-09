package lesson_58;

import java.util.function.Function;
import java.util.function.Predicate;

public class Transformer {
    /*
    1.Написать метод, принимающий строку, состоящую из слов разделенных пробелом и два функциональных интерфейсов
    - function и predicate
    Метод должен предоставлять возможность реализации следующих действий.
    1. При длине слова = 3 изменить все это слова на заглавные и вернуть измененную строку
    Пример: "aaa BBBB deF vbghR bbb" -> "AAA BBBB DEF vbghR BBB"
    2. При длине слова = 4 изменить все буквы этого слова на строчные(маленькие) и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa bbbb deF vbghR bbb
    3. При длине слова = 5 изменить все буквы слова на звездочки и вернуть строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa BBBB deF ***** bbb
        Слова состоят только из букв латинского алфавита
      Протестировать.




      2. Дана строка, состоящая из слов, разделенных пробелом. Написать метод, позволяющий изменять слова в строке
      таким образом:
     1. При длине слова = 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> "AAA BBBB DEF vbghR BBB"
     2. При длине слова = 4 изменить все буквы этого слова на строчные(маленькие) и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa bbbb deF vbghR bbb
     3. При длине слова = 5 изменить все буквы слова на звездочки  и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa BBBB deF ***** bbb
      Слова состоят только из букв латинского алфавита
      Использовать свойства наследования классов
      Протестировать.

          3. Дана строка, состоящая из слов, разделенных пробелом. Написать метод, позволяющий изменять слова в строке
      таким образом:
     1. При длине слова = 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> "AAA BBBB DEF vbghR BBB"
     2. При длине слова = 4 изменить все буквы этого слова на строчные(маленькие) и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa bbbb deF vbghR bbb
     3. При длине слова = 5 изменить все буквы слова на звездочки  и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa BBBB deF ***** bbb
      Слова состоят только из букв латинского алфавита
      на интерфейсах
      Протестировать.
     */

    public static String transformString(String str,StringFunction<String, String> function, StringPredicate<String> predicate){
        String[] strings = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : strings){
            if(predicate.test(s)){
                sb.append(function.apply(s)).append(" ");
            } else {
                sb.append(s).append(" ");
            }
        }

        return sb.toString();
    }

    public  String transformString1(String str, Function<String, String> function, Predicate<String> predicate){
        String[] strings = str.split(" ");
        for (int i = 0; i <strings.length ; i++) {
            if(predicate.test(strings[i])){
                strings[i] = function.apply(strings[i]);
            }

        }

        return String.join(" ",strings);

    }
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length()==3;
        Function<String,String> function = s-> s.toUpperCase();
//        System.out.println(transformString1("aaa BBBB deF vbghR bbb", function, predicate));
        System.out.println(transformString("aaa BBBB deF vbghR bbb", s -> s.toUpperCase(), s -> s.length() == 3));
        System.out.println(transformString("aaa BBBB deF vbghR bbb", s -> s.toLowerCase(), s -> s.length() == 4));
        System.out.println(transformString("aaa BBBB deF vbghR bbb", s -> "*****", s -> s.length() == 5));
    }
}

