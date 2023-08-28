package lesson_30;

public class Main {
    /*
    написать свою реализацию метода substring, который работает также как метод substring класса String,
    принимающий два аргумента - индекс начала и индекс конца. Метод substring класса String не использывать

     */
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        String str1 = "rosa";
        String str2 = "asor";
        String str3 = "HELLO WORLD";

        System.out.println(subString(str, 2, 5));
        System.out.println(isAnagram(str1, str2));

    }
    public  static String subString(String str , int startIndex, int endIndex){
        if( str == null || startIndex < 0 || endIndex > str.length()) return str;
       StringBuilder sb = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            sb.append(str.charAt(i));
        }
       return sb.toString();
    }

    /*
    Написать метод, проверяющий являются ли две строки анаграммами
    abc - cba  rosa - asor - анаграмма
    abc - dba  - не анаграмма
    boolean isAnagram( String str1, String str2)
     */

    public static boolean  isAnagram(String str1 , String str2){
        String result = "";
        for (int i = str1.length()-1; i >=0 ; i--) {
            result += str1.charAt(i);
        }
        return str2.equals(result);

    }

    public static boolean  isAnagram1(String str1 , String str2){
       StringBuilder stringBuilder = new StringBuilder(str1);
       StringBuilder stringBuilder2 = new StringBuilder(str2);

       return stringBuilder.toString().equals(stringBuilder2.reverse().toString());



    }


}


