package lesson_64;

public class Practice {
    /*
    Написать метод, находящий сумму всех значений заданного подмассива двумерного массива целых чисел
    */
    public static void main(String[] args) {
        int[][] arr1 = {
                //0 1 2
                {11,22,33}  //arr [0]
                ,{44,55} // arr [1]
                ,{77,88,99,12,1,3,5}}; // arr [2]
        System.out.println(findSumOfNsubArray(arr1, 2));
        int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}};
        int[][] table1 = { {1,4,5},{-1,-1,-1,2,1},{-1,10}};
        findZeroOfNsubArray(table);
        System.out.println();
        System.out.println(findNoNegativeOfSubArray(table1));
    }
    public static int findSumOfNsubArray(int[][] ints,int n){
        int sum = 0;
        for (int i = n-1; i <= n-1 ; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                sum += ints[i][j];
            }
        }
        return sum;
    }

    /*2. Написать метод, принимающий двумерный массив целых чисел и  выводящий на экран номер строки (подмассива),
        сумма всех элементов которого рана нулю
        int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}} -> 0,1

     */

    public static void findZeroOfNsubArray(int[][] ints){
        int sum = 0;
        for (int i = 0; i < ints.length ; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                sum += ints[i][j];
            }
            if(sum == 0){
                System.out.print(i+"\t" );
            }
        }


    }

    /*
    Написать метод, принимающий двумерный массив и возвращающий количество строк( подмассивов), в которых
     нет отрицательных элементов
     int[][] table = { {1,4,5},{-1,-1,-1,2,1},{-1,10}} -> 1
     */


    public static int findNoNegativeOfSubArray(int[][] ints){
        int counter =0 ;
        boolean check = false;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if((ints[i][j] < 0) ){
                  check = true;
                  break;
                }

            }
            if(!check){
                counter++;
            }
        }
        return counter;
    }
}
