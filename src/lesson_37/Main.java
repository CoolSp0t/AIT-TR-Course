package lesson_37;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");

        for (String number : numbers){
            System.out.println(number);
        }
        // forEach method
        // void forEach()

        numbers.forEach(number -> System.out.println(number)); // пишется через ламбда выражение

        Iterator<String> iterator = numbers.iterator();
         while (iterator.hasNext()){
             String nextStr= iterator.next();
             System.out.println(nextStr);
            if(nextStr.equals("Two")){
                iterator.remove();
            }


         }


    }







}


