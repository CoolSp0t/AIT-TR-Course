package lesson_19;

import java.util.Arrays;

public class RaTestMain {
    public static void main(String[] args) {

        int[] ints ={0,1,2,3,4,5,6,7,8};
        RubberArray rubberArray = new RubberArray(ints);
        ints[0] = 1000;
        System.out.println(Arrays.toString(ints));
        rubberArray.printArray();

//        rubberArray.extractArray(); // скрыли




    }
}
