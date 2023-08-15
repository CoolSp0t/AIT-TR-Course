package homework_21;

public class ArraysUtil {


    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }

        }
        return -1;
    }

    private static int minIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    private static int minIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }


    private static void sortSelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int localMin = minIndex(array, i);
            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;


        }
    }

    private static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        int counter = 0;

        while (startIndex <= endIndex) {
            counter++;
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == searchValue) {
                System.out.println("Найден за: " + counter + " шагов");
                return middleIndex;
            }
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
               startIndex = middleIndex + 1;
            }
        }
        System.out.println("Не найдено! Шагов сделано: " + counter);
        return -1;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("]");

    }
}
