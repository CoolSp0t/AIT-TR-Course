package homework_43;

import lesson_19.Auto;

import java.util.*;

public class Homework43 {

    /*
    2. Дан массив строк (не пустой).Написать метод возвращающий мапу Map<String,Boolean>
    где каждая строка является ключом, а значением является true если строка в массиве встречается больше одного раза и false
    если ток один раз

    Примеры:
    [a,b,a,b,c] a : true , b : true , c : false
    [a,b,c] a : false b : false  c: false
    [c,c,c] c : true
     */


    public  Map<String,Boolean> duplicateStringInArrayString(String[] strings){
        Map<String,Boolean> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], map.containsKey(strings[i]));
        }
        return map;
    }

    public Map<String,Boolean> findTrueFalse1(String[] strings){
        Map<String,Boolean> map = new HashMap<>();
        for (String string : strings){
            map.put(string,map.containsKey(string));
        }
        return map;

    }

    public Map<String,Boolean> findTrueFalse2(String[] strings){
        Map<String,Boolean> map = new HashMap<>();
        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string,true);
            } else map.put(string, false);
        }
            return map;

    }

    /*
    Пусть есть лист имен, где некоторые имена повторяются. Написать метод, принимающий лист и имя и возвращающий сколько раз встречается это имя в листе
    В решении использовать мапу.
    Пример["John","John","Bill","Ann","Ann"]

     */
    public static void main(String[] args) {

    }

    public  int nameToNumberOccurence(List<String> names, String name){

        Map<String,Integer> map = new HashMap<>();
        for(String string : names){
            if(map.containsKey(string)){
                map.put(string, map.get(string)+1);
            }else map.put(string,1);
        }
//        if(map.containsKey(name)){
//            return map.get(name);
//        }
//        return 0;
//        return map.containsKey(name) ? map.get(name) : 0;
        return map.getOrDefault(name,0);
    }

    /*
    Пусть есть лист имен и их анаграмм. Написать метод, принимающий этот лист  и имя, по которому он возвращает список
    всех его анаграмм, включая само имя
    [john, ann, bill, nan, nna, llbi, ohnj],ann -> [ann,nan,nna]
    List<String> findAnagrams( String str, List<String>strings).
    Решение с помощью мапы.
     */

    public List<String> findAnagrams(String str, List<String> strings){
        Map<String,List<String>> anagrams = new HashMap<>();
        for (String s : strings){
            String sortedKey = sortAnagram(s);
            if(anagrams.containsKey(sortedKey)){
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey,value);
            }else {
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey,value);
            }
        }
        return anagrams.getOrDefault(sortAnagram(str),List.of());
    }


    private String sortAnagram(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }




    /*
    Есть класс автомобиль, в котором есть три поля : Марка,Модель,Цена.Написать метод принимает лист автомобилей,
    а возвращает TreeMap, ключами которого являются марки автомобилей, а значениями являются TreeSet
    автомобилей, в котором автомобили расположены в лексикографическом порядке(по алфавиту ) относительно модели, причем
    дешевые вперед если модели одинаковые .
    public Map<String,Set<Auto> autoByMake(List<Auto> autos)
    BMW
    make BMW
    model BMWModel1
    price 100000
    make BMW
    model BMWModel2
    price 150000

    BMW = [{make = BMW, model = BMWModel1, price =100000}, {make = BMW, model = BMWModel2, price =150000}]


     */




}


