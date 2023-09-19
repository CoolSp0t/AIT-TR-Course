package lesson_46;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    // Queue интерфейс Очередь
    /*
    Очередь - это структура данных, работающая по принципу первый пришел - первый ушел
    FIFO(First in First out)
     */

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // добавить элемент
        queue.add("John");
        queue.add("Jack");
        queue.add("Ann");
        queue.add("Mary");

        System.out.println(queue);

        //удалить элемент
        System.out.println(queue.remove());
        System.out.println(queue.remove("Ann"));
        System.out.println(queue);


        // poll() - удаляет и возвращает элемент из "головы" очереди. Если очередь пустая, он возвращает null
        System.out.println("Poll(): " + queue.poll());
        System.out.println("Poll(): " + queue.poll());
        System.out.println("Poll(): " + queue.poll());
//        System.out.println("Poll(): " + queue.remove());

        // offer() - добавляет элемент в очередь
        queue.offer("Jack");
        queue.offer("Ann");
        queue.offer("Mary");
        queue.offer("Jim");

        // element() - возвращает голову очереди(первый элемент)

        System.out.println("Head of the queue is " + queue.element());


        // peek() - возвращает элемент из начала очереди не удаляя его. Если очередь пустая, вернет null
        // poll() - возвращает элемент из начала удаляя его. Если очередь пустая, вернет null
        // remove() - возвращает элемент из начала удаляя его. Если очередь пустая генерирует ошибку


        // Interface Deque (Дека) - это двунаправленная очередь

        /*
        addFirst(elt) -  добавляет элемент в начало
        addLast(elt) - в конец

        getFirst(), peekFirst() - возвращает первый элемент без удаления
        getLast(), peekLast - возвращает последний элт без удаления

        pollFirst, removeFirst - возвращает с удалением из начала
        pollLast, removeLast - из конца

        pop - возвращает с удалением из начала (если нечего нет то будет ошибка)
        push() - добавляет элемент в начало
        */

        ArrayDeque<String> fruits = new ArrayDeque<>();
        fruits.add("Lemon");
        fruits.addFirst("Orange");
        System.out.println(fruits);
        fruits.push("Kiwi");
        System.out.println(fruits);
        fruits.addLast("Apple");

        String first = fruits.getFirst();
        System.out.println(first);
        System.out.println("----------------------");
        while (fruits.peek() != null){
            System.out.println(fruits.pop());
        }



        // PriorityQueue - очередь, в которой можно изменить приоритет элементов
        PriorityQueue<String> names = new PriorityQueue<>(new  PriorityComparator());
        names.add("aaa");
        names.add("a");
        names.add("aaaaa");
        names.add("aaaa");
        while (names.size() != 0){
            System.out.println(names.poll());
        }

    }
}
