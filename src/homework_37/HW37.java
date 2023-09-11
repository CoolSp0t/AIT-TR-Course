package homework_37;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW37 {
    /*
    Задача 1
    Написать метод, принимающий не пустой лист строк и возвращающий строку,
     которая встречается раньше в листе - самую короткую или самую длинную.
      Все строки в листе разной длины
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Coffee");
        arrayList.add("Hello");
        arrayList.add("Is");
        arrayList.add("World");

        System.out.println(isFirstSmallOrBig(arrayList));
    }

    public static String isFirstSmallOrBig(ArrayList<String> arrayList){ // мой вариант
        if(arrayList == null) return null;

        String min = arrayList.get(0);
        String max = arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).length() < min.length()){
                min = arrayList.get(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).length() > max.length()){
                max = arrayList.get(i);
            }
        }

        if(arrayList.indexOf(max) < arrayList.indexOf(min)){
            return max;
        }else {
            return min;
        }

    }

    public  String findShortestOrLongest(List<String> list){
        if(list == null) return null;

        String min = list.get(0);
        String max = list.get(0);
        int indexMinEl = 0;
        int indexMaxEl = 0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() < min.length()){
                min = list.get(i);
                indexMinEl = i;
            } else if (list.get(i).length() > max.length()) {
                max = list.get(i);
                indexMaxEl = i;
            }
        }



        if(indexMinEl < indexMaxEl){
            return min;
        }else {
            return max;
        }

    }



}



