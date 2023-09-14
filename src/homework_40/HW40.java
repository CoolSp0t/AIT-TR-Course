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
        names.add("Bob");
        names.add("Ann");



        System.out.println(getDuplicates(names));

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

    public  List<String> removeDuplicates(List<String> input){
        Set<String> res = new HashSet<>(input);

        return new ArrayList<>(res);
    }


    public static List<String> getDuplicates(List<String> input){
        Set<String> unique = new HashSet<>();
        List<String> arrayList = new ArrayList<>();
        for (String inputs : input){
            if(!(unique.add(inputs))){
                arrayList.add(inputs);
            }
        }

        Set<String> res = new HashSet<>(arrayList);


        return new ArrayList<>(res);

    }


    public  List<String> getDuplicates2(List<String> input){
        Set<String> set = new HashSet<>();
        List<String> duplicates =new ArrayList<>();

        for (String s : input){
            if(!set.add(s) && !duplicates.contains(s) ){
                duplicates.add(s);
            }
        }

        return duplicates;
    }




}
