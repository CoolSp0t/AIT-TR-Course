package lesson_43.other_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    // сохряняет порядок ввода элементов
    public static void main(String[] args) {
        Map<Integer,String> ourLinkedHashMap = new LinkedHashMap<>();
        ourLinkedHashMap.put(23,"bbb");
        ourLinkedHashMap.put(2,"aaa");
        ourLinkedHashMap.put(1,"dd");
        ourLinkedHashMap.put(118,"bbbrrr");
        ourLinkedHashMap.put(100,"aaaaaaaaaaaaa");
        System.out.println(ourLinkedHashMap);


        System.out.println("Put will return");

        System.out.println(ourLinkedHashMap.put(125,"ttt"));
    }
}
