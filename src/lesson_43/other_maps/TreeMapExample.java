package lesson_43.other_maps;

import java.util.*;

public class TreeMapExample {

    /*
    TreeMap
    - хранит элементы в т.н. красно-черно дереве, упорядоченными по возрастанию
     */

    public static void main(String[] args) {
        Map<Integer,String> ourTreeMap = new TreeMap<>();
        ourTreeMap.put(23,"bbb");
        ourTreeMap.put(2,"aaa");
        ourTreeMap.put(1,"dd");
        ourTreeMap.put(118,"bbbrrr");
        ourTreeMap.put(100,"aaaaaaaaaaaaa");

        System.out.println(ourTreeMap);

        // перебор мапы с помощью итератора:
        // получить набор ключ-значение с помощью методо entrySet()
        Set<Map.Entry<Integer,String>> set = ourTreeMap.entrySet();

        // получить объект итератора для нашего сета пар
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();

        // перебор в цикле с помощью методов hasNext() и next()
        while(iterator.hasNext()){
            Map.Entry<Integer,String> me = iterator.next();
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }



        // в treeMap можно изменить порядок сортировки передав в ее конструктор соответствующий компоратор

        Map<String,String> mapReverse = new TreeMap<>(Collections.reverseOrder());
        mapReverse.put("k1","Jack");
        mapReverse.put("k2","John");
        mapReverse.put("k3","Ann");
        mapReverse.put("k4","Bill");
        mapReverse.put("k5","Jill");

        System.out.println(mapReverse);


    }



}
