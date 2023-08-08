package lesson_10;

public class LoopFor {
    public static void main(String[] args) {
        /*
        for ([начальные значения] ; [условие] ; [изменение счетчика ] ){
           тело цикла
        }

           */

        int j = 0;
        while (j < 10){
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        System.out.println("End while loop");

        for (int i = 0 ; i < 10 ; i++ ){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("End for loop");

        for ( int i = 0 ; i <= 100 ; i = i +5){
            System.out.println(i);
        }

        // минимальное достаточное инициализация цикла for
      /*
        for ( ; ; ){ // бесконечный цикл , в котором отсутсвует блок инициализации, блок условия и блок инкремента

            System.out.println("hello");
        }

        */


        //  Вывести все числа от 10 до 0
        int i;
        // код изменяющая i
        i = 14;

        for ( int a = 0; i >= 0 ; i -= 1, a++){
            System.out.println(i + ":" +a );
        }
        System.out.println();
        System.out.println(i);

        int[] array = {5, 10 , 43 ,545 ,- 10 , - 23, -0 , 15 };

        /*
        for (int k = 0 ; k < array.length ; k++){
            System.out.println(array[k] + " ");
        }
        System.out.println();
        */

        /*
        // вывести на экран все числа от 5 до 20;

        for ( int k = 5 ; k <= 20 ; k++){
            System.out.println(k + "");
        }
        */

        //  int[] array = {5, 10 , 43 ,545 ,- 10 , - 23, -0 , 15 };

        System.out.println("-------------");
        int forSearch = 545; // вывести индекс элемента по заданному значению
        int index = -1;
        for ( int k = 0 ; k < array.length ; k++ ){
            if (array[k] == forSearch){
                index = k;
                System.out.println("Совпадение" );
                break;
            } else {
                System.out.println("Число " + array[k] + " не равно " + forSearch);
            }

        }

        System.out.println(index);

        for (int k = 0; k < 10; k++){
            System.out.print(k + ": ");
            for (int l = 0; l < 5 ; l++){
                System.out.print(" test ");
                if (k == 3)break;
                System.out.print(l + " " );
            }
            System.out.println();
        }

    }
}
