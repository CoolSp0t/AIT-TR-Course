package homework_36;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework36 {
    public static void main(String[] args) {
        ArrayList<Integer> ints1 = new ArrayList<>();
        ArrayList<Integer> ints2 = new ArrayList<>();

        ints1.add(1);
        ints1.add(2);
        ints1.add(3);
        ints1.add(4);

        ints2.add(5);
        ints2.add(2);
        ints2.add(3);
        ints2.add(8);


        isEquals(ints1,ints2);


        System.out.println("---------------Task2--------------------");
        int a = 3;

        isBigger(ints1,a );
    }

    public static void isEquals(ArrayList<Integer> ints1 , ArrayList<Integer> ints2){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < ints1.size(); i++) {
            if(ints1.get(i) == ints2.get(i)){
                result.add("Yes");
            }else {
                result.add("No");
            }
        }
        System.out.println(result);

    }


    public static void isBigger(ArrayList<Integer> ints, int a){
        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()){
            if(iterator.next()>=a){
                iterator.remove();
            }
        }
        System.out.println(ints);
    }

}
