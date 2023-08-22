package homework_25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework25 {


    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(strEndsWithAnotherStr(str, "World"));
        System.out.println(Arrays.toString(createsCharArray(str)));

    }
    // Task1
    // Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
    //public boolean strEndsWithAnotherStr ( String str1, str2)

    public  static  boolean strEndsWithAnotherStr(String str , String str1){
       return str.endsWith(str1);



    }

    public static char[] createsCharArray(String str){
       return str.toCharArray();
    }


    /*Задача 3*
    Написать метод, удаляющий из строки повторяющиеся символы
    String removeDuplicateChars( String string)
    пример: "abbccccaadb" -> "abcd"
    */


    public static String removeDuplicateChars( String string){
        char[] chars = string.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            if(result.indexOf(chars[i]) == -1){
                result += chars[i];  // a , b ,c ,d
            }
        }
        return result;
    }



}
