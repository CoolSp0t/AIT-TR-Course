package homework_20;

import java.util.Arrays;

public class RubberArray {


    int[] array;
    int cursor;
    static final int MULTIPLIER = 2;
    public RubberArray(){ // Конструктор
        this.array = new int[10];
        cursor = 0;
    }

    public RubberArray(int[] ints){ // Конструктор по массиву
        this.array = Arrays.copyOf(ints, ints.length);
    }
    public void add(int value){ // добавление значения
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
    public void add(int... ints){ // добавление нескольких значений
        for (int value : ints){
            add(value);
        }
    }

    public void extractArray(){
        array = Arrays.copyOf(array, array.length*MULTIPLIER);
    } // добавление ячейки

    public int size(){
        return cursor;
    } // кол-во элементов в массиве

    public int length(){
        return array.length;
    }
    public int sumOfValues() { //сумма значений в массиве
        int sum = 0;
        for (int i = 0; i < cursor ; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int min(){
        if(cursor == 0) return Integer.MIN_VALUE;
        int min = array[0];
        for (int i = 0; i < cursor ; i++) {
            if(array[i]< min){
                min = array[i];
            }
        }
        return min;
    }
    public int max(){
        if(cursor == 0) return Integer.MAX_VALUE;
        int max = array[0];
        for (int i = 0; i <cursor ; i++) {
            if(array[i]> max){
                max = array[i];
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
  public void printArray(){ // вывод массива
      System.out.print("[");
      for (int i = 0; i < cursor ; i++) {
          System.out.print(array[i]);
          if(i < cursor-1){
              System.out.print(", ");
          }
      }
      System.out.println("]");
      System.out.println();
    }

    public int returnIndexOfValue(int value){ // поиск индекса по значению

        for (int i = 0; i < cursor; i++) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int returnValueByIndex(int index){// поиск значения по индексу
        int result = array[0];
        if(index < 0 || index >= cursor){
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i <= index; i++) { // это не обязательно можно просто сразу вернуть число по индексу
            if(i == index);
            result = array[i];
        }
        return result; //array[index]
    }


    public void deleteByIndex(int index){ // удаления по индексу
        if(cursor >= 1 && index >= 0 && index < cursor);{
//            int[] result = new int[array.length-1];
            for (int i = 0; i < cursor; i++) {
                if(i < index){
                    array[i] = array[i];
                }else{
                array[i] = array[i+1];
                }
            }
        cursor--;
        }
    }
//    public void deleteByIndex(int index) { var 2
//        if (cursor >= 1 && index >= 0 && index < cursor) {
//
////            int[] result = new int[array.length - 1];
//
//            for (int i = index; i < cursor; i++) {
//                array[i] = array[i + 1];
//            }
////            System.out.println("Result " + Arrays.toString(result));
//            cursor--;
//        }
//    }

//    public void deleteByValue(int value){ // удаления по значению //var 1
//        int index = returnIndexOfValue(value);
//        deleteByIndex(index);
//    }
//
    public boolean deleteByValue(int value){ // удаления по значению // var2
        int index = returnIndexOfValue(value);
        if(index < 0 ) return false;
        deleteByIndex(index);
        return  true;
    }

    public int deleteAllByValue(int value){
      int count = 0;
      // пытаемся найти значение в массиве. если находим удаляем значение.
      //если не находим , возвращается false. Выходим из цикла while
      while(deleteByValue(value)){
          count++;
      }
        return count;
    }



    public void swapByIndex(int index, int value){ // замена по индексу на новое значение
        if(index < 0 || index >= cursor)
        array[index] = value;

    }

    public void swapOldValueToNewValue(int oldValue , int newValue){ // замена по значению на новове значение
        int index =  returnIndexOfValue(oldValue);
        swapByIndex(index, newValue);
    }

    private boolean isIndexIncorrect(int index){
        return !(index >= 0 && index <cursor);
    }



}






//Добавление элемента
//Вывести все значения в массиве в консоль
//Поиск элемента по значению
//Возвращение значения по индексу
//Текущее количество элементов в массиве
//Удаление элемента по индексу
//Добавление нескольких элементов (в качестве аргументов передает последовательность значений)
//Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими же значениями
//Удаление элемента по значению
//Замена значения по индексу (есть индекс и новое значение)
//Замена значения по значению (есть старое и новое значение)