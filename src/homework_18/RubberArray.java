package homework_18;

import java.util.Arrays;

public class RubberArray {


    int[] array;
    public RubberArray(){ // Конструктор
        this.array = new int[0];
    }

    public RubberArray(int[] ints){ // Конструктор по массиву
        this.array = Arrays.copyOf(ints, ints.length);
    }
    public void add(int value){ // добавление значения
        extractArray();
        array[array.length-1] =  value;
    }

    public void add(int... ints){ // добавление нескольких значений
        for (int value : ints){
            add(value);
        }
    }

    public void extractArray(){
        array = Arrays.copyOf(array, array.length+1);
    } // добавление ячейки

    public int size(){
        return array.length;
    } // кол-во элементов в массиве

  public void printArray(){ // вывод массива
      System.out.print("[");
      for (int i = 0; i < array.length ; i++) {
          System.out.print(array[i]);
          if(i < array.length-1){
              System.out.print(", ");
          }
      }
      System.out.println("]");
      System.out.println();
    }

    public int returnIndexOfValue(int value){ // поиск индекса по значению

        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int returnValueByIndex(int index){// поиск значения по индексу
        int result = array[0];
        if(index < 0 || index >= array.length){
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i <= index; i++) { // это не обязательно можно просто сразу вернуть число по индексу
            if(i == index);
            result = array[i];
        }
        return result; //array[index]
    }


    public void deleteByIndex(int index){ // удаления по индексу
        if(array.length >= 1 && index >= 0 && index < array.length);{
            int[] result = new int[array.length-1];
            for (int i = 0; i < result.length; i++) {
                if(i < index){
                    result[i] = array[i];
                }else{
                result[i] = array[i+1];
                }
            }
        array = result;
        }
    }

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
        if(index < 0 || index >= array.length)
        array[index] = value;

    }

    public void swapOldValueToNewValue(int oldValue , int newValue){ // замена по значению на новове значение
        int index =  returnIndexOfValue(oldValue);
        swapByIndex(index, newValue);
    }

    private boolean isIndexIncorrect(int index){
        return !(index >= 0 && index < array.length);
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