package lesson_21;

import java.util.Arrays;

public class Lesson21 {
    public static void main(String[] args) {
        int[] ints = {34, 21, 67, 41, 10, 5, 0, 87, 99, 38, 57, 3, 77};

        System.out.println(ArraysUtil.linearSearch(ints, 100));

        System.out.println("До сортировки");
        homework_21.ArraysUtil.printArray(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(homework_21.ArraysUtil.toString(ints));

        ArraysUtil.sortSelection(ints);

        System.out.println("После сортировки");
        homework_21.ArraysUtil.printArray(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(homework_21.ArraysUtil.toString(ints));

        int numberForSearch = 100;
        int index = ArraysUtil.binarySearch(ints , numberForSearch);
        System.out.println("Индекс числа " + numberForSearch + " равен " + index);



    }
}
