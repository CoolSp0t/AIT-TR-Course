package lesson_20;

import java.util.Arrays;

public class RubberArray {

    private int[] array;
    int cursor;
    static final int MULTIPLIER = 2;
    public RubberArray() {// конструктор
        this.array = new int[10];
        cursor =0;
    }

    public RubberArray(int[] ints) { // var1
        this.array = Arrays.copyOf(ints, ints.length);
    }

//  public RubberArray(int[] ints){ // Проблема отдаем ссылку!
//    this.array = ints;
//  }
//    public RubberArray(int[] ints){ //  var 2
//        this() // this.array = new int[0]
//    add(arr);
//    }

//    public RubberArray(int[] ints){   //var 3
//        this.array = new int[ints.length];
//        for (int i = 0; i < ints.length; i++) {
//            array[i] = ints[i]
//        }
//    }



    public void add(int value){ // добавление элемента
        if(isArrayFull()){
            extractArray();
        }
        array[cursor] = value;
        cursor++;
        System.out.println("Добавлен элемент " + value);
    }

    private boolean isArrayFull(){
        return cursor == array.length-1;
    }


    public void add(int... ints){ // принимает произвольное кол во аргументов типа int
        for (int value : ints){
            add(value);
        }

    }
    private void extractArray(){ // разширение массива на одну ячейку
        System.out.println("Раcширяем внутренний массив");
        array = Arrays.copyOf(array, array.length*MULTIPLIER);
    }



    public void printArray(){ // вывести в консоль массив
        System.out.print("[");
        for (int i = 0; i < cursor; i++) {
            System.out.print(array[i]);
            if(i < cursor-1){
                System.out.print("; ");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public int size(){ // кол во элементов в массиве
        return cursor;
    }

    public int length(){
        return array.length;
    }

    public int sumOfValues(){ // сумма значений в массиве
        int sum = 0;
        for (int value: array){
            sum += value;
        }
    return sum;
    }

    public int min(){ // возвращаем мин значение из массива
        if(array.length == 0) return Integer.MIN_VALUE;

        int min = array[0];
        for (int value : array){
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    public int max(){
        if(array.length == 0) return Integer.MAX_VALUE;

        int max = array[0];
        for (int value : array){
            if(value > max){
                max = value;
            }
        }
        return max;
    }

    public int[] toArray(){ // нужно создать КОПИЮ нашего массива и ее отправить обратно
        int[] result = new int[cursor];
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
//        return Arrays.copyOf(array, array.length);
    }

    public void deleteByIndex(int index){
        if(cursor >= 1 && index >= 0 && index < cursor){
//            int[] result= new int[array.length-1];
            for (int i = 0; i < cursor; i++) {
                if(i < index) {
                    array[i] = array[i];
                } else { // if (i>=index) {
                    array[i] = array[i+1];
                }

            }
          //  System.out.println("Result " + Arrays.toString(result));
            cursor--;
        }

    }

}


/*
+кол во элементов в массиве
+ сумма элементов
+ добавление нескольких элементов в массив
+ найти мин, макс
+получить  RubberArray в виде обычного массива
+удалить элемент по индексу
+поиск элемента по значению
-сортировать ???
- заменить по индексу значение в массиве
-среднее значение ???
-распечатать в обратной последовательности -> ???
-удалить элемент по значению
 */