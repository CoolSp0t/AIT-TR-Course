package homework_09;

import java.util.Arrays;
import java.util.Random;



public class Homework09 {
    public static void main(String[] args) {
        System.out.println("Task 0");
        Random random = new Random();
        int [] array ;
        array = new int[]{random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        System.out.println(Arrays.toString(array));
        int a = 1;
        int max = array[0];
        int min = array[0];
        int sum = array[0];
        while(a < array.length){
            if (max < array[a]){
                max = array[a];

            }
            if (min > array[a]){
                min = array[a];
            }
            sum = sum + array[a] ;
            a++;

        }


        double average = (double) sum / a;
        System.out.println("MAX: "  + max + " Min: " + min + " Average " + average );

        // второй вариант начала первой задачи
        Random random1 = new Random();
        int[] arrayTest = new int[random1.nextInt(20+1)];
        int checker = 0;
        while(checker< array.length){
            arrayTest[checker] = random1.nextInt(100);
            checker++;
        }




//        System.out.println("Task 1" );
//        int [] arraySwap = {5 , 6, -25 ,0 , 31 ,-15};
//        int temp = arraySwap[2];
//        arraySwap[2] = arraySwap[4];
//        arraySwap[4] = temp;
//        System.out.println(Arrays.toString(arraySwap));
//

            // int max = array[maxIndex]
            // int min = array[minIndex]
            // array[maxIndex] = min
            // array[minIndex] = max


        // Task 2 Дан массив строк. Вывести на экран все символы из самой длинной строки массива

        System.out.println("Task2");
//        String[] strings = {"One", "Two", "Twenty"} ;
//        int len1 = strings[0].length();
//        int counter2 = 0;
//        while (counter2 < strings.length){
//            if (len1 < strings[counter2].length()){
//
//            }
//
//            counter2++;
//
//
//            System.out.println(Arrays.toString(strings).charAt(counter2));
//        }
//
//        System.out.println(Arrays.toString(strings[counter2-1].toCharArray()));
//


        String[] strings = {"One" , "Two" , "Three" , "TestTT" };
//        String[] strings = new String[10];  этого не хватает для теста так как в массиве только "null"
        String stringWithLength = strings[0];

        int i = 0;
        while (i < strings.length);{
            if (strings[i].length() > stringWithLength.length()) {
                stringWithLength=  strings[i];
            }
            i++;
        }

        System.out.println("String with max length " + stringWithLength);

        int x = 0;
        while (x < stringWithLength.length()){
            System.out.println(stringWithLength.charAt(x));
            x++;
        }






    }


}


