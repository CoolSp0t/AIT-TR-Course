package lesson_38;

import java.util.LinkedList;
import java.util.List;

public class Lesson38 {
    // LinkedList methods методы отличающиеся от ArrayList
    /*
    addFirst() / offerFirst() - добавляет элемент в начало листа
    addLast() / offerLast() - добавляет последний элемент
    removeFirst() / pollFirst - удаляет первый элемент из начала листа
    removeLast() / pollLast - удаляет последний элемент
    getFirst() / peekFirst() - получить первый элемент
    getLast() / peekLast() - получить последний элемент
     */

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();

        names.add("Jack");
        names.add("John");
        names.add("Bill");
        System.out.println(names);


        names.addFirst("Ann");
        System.out.println(names);


        names.removeFirst();
        System.out.println(names);

        System.out.println(names.peekFirst());
        System.out.println(names);



    }


}
