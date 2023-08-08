package lesson_04;

import java.sql.SQLOutput;

public class StringSamples {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str);
        String str1 = new String ("Java2"); // Используем конструктор
        System.out.println(str1);

        String str2 = new String();
        String str3 = "";
        System.out.println(str3);

        String str4 = new String (new char[] {'h', 'e', 'l', 'l', 'o'});
        System.out.println(str4);

        String str5 = "Hello, World!";

        int length = str5.length();
        System.out.println(str5 + " length: " + length);

        str5 = str5.toUpperCase();
        System.out.println(str5);
        str5 = str5.toLowerCase();
        System.out.println(str5);

        String str6 = str5.concat(str);
        System.out.println(str6);
        str6 = str5 + " " + str;
        System.out.println(str6);

        str6 = String.join( " ", str5, str, str4 );
        System.out.println("Join: " + str6);

        int d = 5678;
        String str7 = "Hello " + d;
        System.out.println(str7);

        String name = "John";
        System.out.println("My name is: " + name);

        String str8 = String.valueOf(d);
        System.out.println("str8 " + str8);

        String strNumbers = "01234567";
        System.out.println("length " +strNumbers.length());
        char firstChar = strNumbers.charAt(0);
        System.out.println("firstChar: " + firstChar);
        char lastChar = strNumbers.charAt(strNumbers.length() - 1);
        System.out.println("lastChar: " + lastChar);


        String substring = strNumbers.substring(2);
        String substring2 = strNumbers.substring(2, 6); // [2, 6)
        System.out.println("strNumber " + strNumbers);
        System.out.println("substring " + substring);
        System.out.println("substring " + substring2);
        System.out.println(str2.isEmpty());

        System.out.println(strNumbers.replace("123", "hello")); // изменяет в строке выбранные char и заменяет их
        System.out.println("strNumber " + strNumbers);

        String strTrim = " Java is great!  ";
        System.out.println(strTrim.trim()); // уберает пробелы внутри строки, но не как ее не изменяет



    }
}
