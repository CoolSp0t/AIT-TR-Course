package homework_40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW40 {
    public static void main(String[] args) {
        List<String > names = new ArrayList<>();
        names.add("Ann");
        names.add("Bob");
        names.add("Jack");
        names.add("Ann");
        names.add("Bob");
    }


    public static List<String> uniqueNames(List<String> names){
        Set<String> uniqueNamesSet = new HashSet<>();
        List<String> uniqueNamesList = new ArrayList<>();

        for (String name : names){
            if(uniqueNamesSet.add(name)){
                uniqueNamesList.add(name);
            }
        }
        return uniqueNamesList;
    }

}
