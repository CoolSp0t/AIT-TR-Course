package lesson_31;

public class Practice {
    /*
    Написать метод, который принимает строку и паттерн и возвращает количество вхождений паттерна в строку
    Пример: ("Hello World", "l") -> 3



     */


    public static void main(String[] args) {
        String str = "Hello World";
        char search = 'l';
        String search1 ="l";


        task1(str, search);

        patterns(str, search1);
        System.out.println(count(str, search1));
    }
    public static void task1 (String str, char search){
        int counter = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
           if(chars[i] == search){
                counter++;
            }
        }


        System.out.println(counter);
    }

    public  static void patterns(String str, String search){
        int counter = 0;
        int i = str.indexOf(search);
        if(str == null | search == null){
            return;
        }

        while( i != -1){
            counter++;
            i = str.indexOf(search, i+search.length());
        }

        System.out.println(counter);

    }


    public static int count(String str, String pattern){
        int count = 0;
        int lastIndex= str.lastIndexOf(pattern);

        for (int i = 0; i < str.length(); i++) {
            if(lastIndex != -1){
                count++;
                lastIndex = str.lastIndexOf(pattern, lastIndex- pattern.length());
            }
        }
        return count;
    }
}



