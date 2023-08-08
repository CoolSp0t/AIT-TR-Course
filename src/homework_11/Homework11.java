package homework_11;

import java.util.Arrays;

public class Homework11 {

    public static void main(String[] args) {
        //Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
        System.out.println("Task0");
        int[] array = {1, 4, 3 , 6 , 7};

        arrayReverse(array);



        System.out.println("");
        System.out.println("Task1");
        numberPower(5);
    }


    public static void arrayReverse(int[ ] array){
        System.out.print("[");
        for(int i = array.length-1 ; i >= 0 ; i-- ){
            System.out.print(array[i]);
            if( i != 0){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println(" ");
    }
    // Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
    public static void arrayReverse(int[ ] array, int index){
        int i ;
        for (  i = 0; i < index ; i++){
            System.out.println(array[i]);
        }
        for (i = array.length-1; i >= index ; i--){
            System.out.println(array[i]);
        }
        }





    //Еще одна перегрузка: метод принимает массив и булевый флаг.
    // Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке

    public static void arrayReverse(int[ ] array, boolean test){
            int i ;
            if(test){
                for(i = array.length-1; i >=0; i--) {
                    System.out.print(array[i]);
                }
            }else{
                    System.out.println(Arrays.toString(array));
            }


    }
/*
   for (i = array.length-1; i >= 0 ; i--){

                System.out.println(array[i]);
            }
            for (i = 0 ; i < array.length ; i++){

                System.out.println(array[i]);
            }


 */


    // Метод должен вывести на экран 2 в степени этоЧисло
    public static void numberPower(int num){
        if( num>=0){
            int result = 1;
            for( int i = 0 ; i < num ; i++){
                result *= 2;

            }
            System.out.println("2 в степени" +  num + "Число: " + result);
        }else {
            System.out.println("Неверный аргумент вызова");
        }



    }
}


