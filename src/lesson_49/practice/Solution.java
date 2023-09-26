package lesson_49.practice;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Solution {

//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(2,5,18,70);
//        System.out.println(multiply2(list, 40));
//    }
    /*
    Написать метод, принимающий упорядоченный лист целых чисел и целое число N и проверяющий есть ли в этом листе
    такие 2 числа что их произведение равно N. Метод в этом случае возвращает true иначе false
    {2,5,18,70}, 36 -> true
    {2,5,18,70}, 40 -> false


    Решить задачу двумя способами:
    1. без вложенных циклов и без использования коллекций
    2. с использованием ArrayDeque
     */


    public boolean multiply(List<Integer> list , int n){
        if(list.get(0) > n){
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j) * list.get(i) == n){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean multiplyWithArrayDeque(List<Integer> list, int n){
        if(list.get(0) > n){
            return false;
        }
//        Deque<Integer> result = new ArrayDeque<>();
//        for (int num: list){
//            if(n % num == 0){
//                result.add(num);
//            }
//        }
        Deque<Integer> result = new ArrayDeque<>(list);
        while (result.size()>1){
            if(result.getFirst() * result.getLast() < n){
                result.removeFirst();
            } else if (result.getFirst() * result.getLast() > n) {
                result.removeLast();
            }else return true;

        }


        return false;
    }

    public boolean multiplyWithOutOtherCollections(List<Integer> list, int n){
        if(list.get(0) > n){
            return false;
        }
        int i = 0;
        int j = list.size()-1;
        while (j-i >0){
            int mult = list.get(i) * list.get(j);
            if(mult< n){
                i++;
            } else if (mult> n) {
                j--;
            }else {
                return true;
            }
        }
        return false;
    }

    public boolean multiply2(List<Integer> list, int n){ // как и multiplyBetter
        if(list.get(0) > n){
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if(n % list.get(i) == 0){
                int k = n / list.get(i);
                if(list.equals(k)){
                    return true;
                }
            }
        }
        return false;
    }

    public  boolean multiplyBetter(List<Integer> list, int n){
        if(list.get(0) > n){
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if(n % list.get(i) == 0 && list.contains(n / list.get(i)));
            return  true;
        }
        return false;
    }

}
