package lesson_45.map_merge;

import java.util.HashMap;
import java.util.Map;

public class DominantElement {
    /*
    Пусть есть массив целых положительных чисел. Нужно написать метод, находящий элемент(если он есть),
    который встречается в массиве больше > length/2 (доминантный). В противном случае вернуть -1.
     [7,7,6,6,7] - 7
     [4,5,5,4,4,5] -1
     [3,3] - 3
     */

    public static void main(String[] args) {
        DominantElement dominantElement = new DominantElement();
        int[] array = {7,7,6,6,7};
        System.out.println(dominantElement.findDominantElement(array));
        System.out.println(dominantElement.findDominantElementMerge(array));
    }
     public int findDominantElement(int[] ints){
         Map<Integer,Integer> occurencesByNumber= new HashMap<>();
         for (int i = 0; i < ints.length; i++) {
             if(occurencesByNumber.containsKey(ints[i])){
                 occurencesByNumber.put(ints[i], occurencesByNumber.get(ints[i])+1 );
             }else{
                 occurencesByNumber.put(ints[i],1);
             }
         }
        for (int key : occurencesByNumber.keySet()){
            if(occurencesByNumber.get(key)> ints.length/2){
                return key;
            }
        }
        return -1;
     }

    public int findDominantElementMerge(int[] ints){
         Map<Integer,Integer> occurencesByNumber =new HashMap<>();
       for (int i :ints){
         int res =  occurencesByNumber.merge(i,1,(oldValue,newValue)->oldValue+ 1);
            if(res > ints.length/2){
                return i;
            }

       }
       return -1;

    }

}
