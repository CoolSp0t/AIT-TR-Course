package homework_45;

import java.util.*;

public class Homework45 {
    /*
    Написать метод, принимающий не пустой лист целых чисел ,
    в котором все числа кроме одного имеют пару и возвращающий это не парное число.
    При решении использовать мапу.
     */
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(3,3,3);
        List<Integer> list1 =Arrays.asList(1,8,8,8,8,8,1,2,2);
        System.out.println(list);
        Homework45 homework45 = new Homework45();
        System.out.println(homework45.returnNonPairNumber(list));
        System.out.println(homework45.returnNonPairNumberMerge(list));
        System.out.println(homework45.returnNonPairNumber(list1));
        System.out.println(homework45.returnNonPairNumberMerge(list1));
    }
    public int returnNonPairNumber(List<Integer> list){
        Map<Integer,Integer> numbers =new HashMap<>();
        for (int i = 0; i < list.size() ; i++) {
            if(numbers.containsKey(list.get(i))){
                numbers.put(list.get(i),numbers.get(list.get(i))+1);
            }else numbers.put(list.get(i), 1 );
        }
        for(Integer key : numbers.keySet()){
            if(numbers.get(key) % 2 != 0){
                return key;
            }

        }
        return -1;
    }


    public int returnNonPairNumberMerge(List<Integer> list){
        Map<Integer,Integer> number =new HashMap<>();
        int res =0;
        for (int i : list){
            number.merge(i, 1,(oldValue,newValue)-> oldValue+1);
        }
        for(int key : number.keySet()){
            if(number.get(key) % 2 != 0){
                res = key;
            }

        }
        return res;
    }


}
