package homework_25;

public class Homework25 {


    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(strEndsWithAnotherStr(str, "World"));
        createsCharArray(str);

    }
    // Task1
    // Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
    //public boolean strEndsWithAnotherStr ( String str1, str2)

    public  static  boolean strEndsWithAnotherStr(String str , String str1){
       if(str.endsWith(str1)){
           return true;
        }
        return false;
    }

    public static void createsCharArray(String str){
        char[] result = str.toCharArray();
        for ( char c: result){
            System.out.println(c + " ");
        }

    }




}
