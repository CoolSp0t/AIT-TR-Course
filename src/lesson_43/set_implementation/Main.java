package lesson_43.set_implementation;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        OurSet<Integer> ourSet = new OurHashSet<>();
        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(3);
        ourSet.add(2);


        for (int elt : ourSet){
            System.out.println(elt);
        }





        /*
        Key         Value
        John        INSTANCE
        Jack        INSTANCE
        Bill        INSTANCE
        Ann        INSTANCE
         */
    }
}
