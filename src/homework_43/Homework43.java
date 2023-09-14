package homework_43;

import java.util.HashMap;
import java.util.Map;

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
}


