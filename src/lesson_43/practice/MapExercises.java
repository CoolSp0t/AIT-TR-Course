package lesson_43.practice;

import java.util.HashMap;
import java.util.Map;

public class MapExercises {

    /*
    Дана Map<String,String> map. Написать метод который вернет мапу, такую что если в исходной мапе есть ключи
    "а" и "b" , то нужно создать новый ключ "ab"  в качестве значения для него должна быть сумма значений ключей  a и b
    Если нет , ничего в мапе не менять

    Примеры:
    mapAB {"a": "Hi" , "b" : "There" } ->   {"a": "Hi" , "b" : "There" , "ab" : "HiThere" }
    mapAB {"a": "Hi" } -> {"a": "Hi" }
    mapAB {"b" : "There" } -> {"b" : "There"}
     */


    public  Map<String,String> mapAB(Map<String,String> map){
        if(map.containsKey("a") & map.containsKey("b")){
            map.put("ab", map.get("a").concat(map.get("b")));
        }
        return map;
    }



    /*
    2. Дан массив строк (не пустой).Написать метод возвращающий мапу Map<String,Boolean>
    где каждая строка является ключом, а значением является true если строка в массиве встречается больше одного раза и false
    если ток один раз

    Примеры:
    [a,b,a,b,c] a : true , b : true , c : false
    [a,b,c] a : false b : true  c: false
    [c,c,c] c : true
     */






}
