package homework_36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Homework36 {
    public static void main(String[] args) {
        ArrayList<Integer> ints1 = new ArrayList<>();
        ArrayList<Integer> ints2 = new ArrayList<>();
        List<Integer> ints3 = Arrays.asList(1,2,3,4); // добавление больших колво чисел но нельзя изменять его после добавления только для сравнения
        List<Integer> ints4 = List.of(5,2,3,8); // еще один вариант

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
            if(ints1.get(i).equals(ints2.get(i))){
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

    public static List<Integer> withoutMoreThan(List<Integer> input , int n){
        List<Integer> withoutMoreThan = new ArrayList<>();

        for (Integer i : input){
            if(i <= n ){
                withoutMoreThan.add(i);
            }
        }
        return  withoutMoreThan;
    }

}
