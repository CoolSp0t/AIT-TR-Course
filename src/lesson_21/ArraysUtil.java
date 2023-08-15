package lesson_21;

public class ArraysUtil {
    //Метод линейного поиска
    public static int linearSearch(int[] array, int searchValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }

    // Метод ищет минимально значение по всему массиву и
    // возвращается индекс min значения
    private static int minIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Метод ищет минимально значение от стартого индекса до конца массива
    //  и возвращается индекс min значения
    private static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

// добавления гибкости в методе то есть  будет искаться от одного индекса до другого
// а не весь массив
//    private static int minIndex(int[] arr, int startIndex, int endIndex) {
//        int min = arr[startIndex];
//        int minIndex = startIndex;
//        for (int i = startIndex; i < endIndex; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//                minIndex = i;
//            }
//        }
//        return minIndex;
//    }

    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }


    }

    //Бинарный поиск значения в массиве
    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0;
        // проверка что часть массива разделить пополам
        while (startIndex <= endIndex) { // 1. 0<=12 2. 7<=12
            counter++; // 1. 1; 2. 2;
            //вычисление индекса середины части массива, в которой производим поиск
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            // 1. 6 = 0+ (12 -0 ) /2 ( знач == 41)
            // 2. 9 = 7 + (12 -7) / 2 ( знач == 77)

            // сравниваем значения в середине с искомым
            // 1. 41 == 77 -> проходим мимо if
            // 2. 77 == 77
            if (array[middleIndex] == searchValue) {
                // counter = 2
                System.out.println("Найден за " + counter + " шагов");
                return middleIndex;
            }

            //Если значения не равны -
            // определяем какую половину какую массива мы отбросим
            // 1.41 > 77

            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                // 1.startIndex = 7 (6 + 1 = 7 )
                startIndex = middleIndex + 1;
            }

        }
        // если в цикл While закончен ( не осталось частей массива,
        System.out.println("Ничего не найдено! Шагов сделано:" +counter );
        return -1;


    }


}
