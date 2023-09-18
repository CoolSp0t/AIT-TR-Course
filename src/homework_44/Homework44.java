package homework_44;

import java.util.*;

public class Homework44 {


    public static void main(String[] args) {
        Auto auto1 =new Auto("Volvo","c60" ,10);
        Auto auto2 =new Auto("Mercedes","amers", 40000);
        Auto auto3 =new Auto("Volvo","a60",5000);
        Auto auto4 =new Auto("Volvo","a60", 1000);
        Auto auto5 =new Auto("Mercedes","bmers",39000);
        Auto auto6 =new Auto("Mercedes", "bmers", 1000000);
        Auto auto7 =new Auto("BMW" , "X5", 100000);


        List<Auto> autos = new ArrayList<>();
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);
        autos.add(auto6);
        autos.add(auto7);


    }

    public    Map<String, Set<Auto>> autoByMake(List<Auto> autos){
        Map<String,Set<Auto>> result = new TreeMap<>();
        for(Auto auto: autos){
        String key = auto.getMake();
        if(result.containsKey(key)){
            Set<Auto> setAuto = result.get(key);
            setAuto.add(auto);
            result.put(key, setAuto);
        }else {
            Set<Auto> setAuto = new TreeSet<>();
            setAuto.add(auto);
            result.put(key,setAuto);
        }
        }
        return result;
    }
}
