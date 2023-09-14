package lesson_41.our_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {


    /*
    Интерфейс Map
    4 Класса :
    HashTable
    HashMap
    LinkedHashMap
    TreeMap

    мапа представяет собой набор пар ключ-значение
    В качестве ключей могут быть зарный типы данных.
    Ключи в мапе уникальны . Значения могут повторяться
     */
    public static void main(String[] args) {
        Map<Integer, String> ourMap = new HashMap<>();
        ourMap.put(1200,"Notebook");
        ourMap.put(10,"Mouse");
        ourMap.put(500,"TV");
        ourMap.put(130,"Printer");
        System.out.println(ourMap);


        // добавить элемент
        ourMap.put(10,"Clock");
        System.out.println(ourMap);

        // удалить элемент  remove()
        ourMap.remove(10);
        System.out.println(ourMap);


        // получить элемент get()
        System.out.println(ourMap.get(130));

        // получить размер size()
        System.out.println(ourMap.size());


        //содержить ли ключ мапа boolean containsKey()
        System.out.println(ourMap.containsKey(1200));
        System.out.println(ourMap.containsKey(1260));

        System.out.println(ourMap.containsValue("Notebook"));
        System.out.println(ourMap.containsValue("TV1"));


        System.out.println(ourMap.keySet());
        Set<Integer> mapKeySet = ourMap.keySet();


    }




}
