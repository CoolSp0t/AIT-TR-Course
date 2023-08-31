package lesson_33;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Интерфейс Comparable
        /*
        Исползуется для сравнения однотипных объектов и позволяет сортировать объекты в соответствии с определенным порядком.
        Для это цели нужно переопределить единственный метод интерфейса compareTo()
        int compareTo(Object o1)
        Метод сравнивает объект, на котором он вызывается со вторым объектом. Результат его - целое число,
        которое:
        - больше нуля если первый объект больше второго
        - меньше нуля если меньше
        - равно нулю если объекты равны


        Сравнение происходит по отдельным полям. Т.е. необходимо принять решение какое поле класса будет учавствовать
        в определении порядка сортировки объектов. Такой порядок будет называться естественным порядком сортировки
         */
        int[] ints = {45,2,15,0,5};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));


        String[] strings = {"John", "Jack", "Ann" ,"Bill"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));



        Player player1 = new Player(3,"Jack", 21);
        Player player2 = new Player(1,"Steve", 19);
        Player player3 = new Player(2,"Alex", 24);
        Player[] team = {player1,player2,player3};
        System.out.println(Arrays.toString(team));
        Arrays.sort(team);
        System.out.println(Arrays.toString(team));






    }

}
