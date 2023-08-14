package homework_20;

public class Homework20 {
    public static void main(String[] args) {
        RubberArray rubberArray = new RubberArray();
        rubberArray.add(10, 15 ,22);
        rubberArray.printArray();
        System.out.println("Сумма чисел в массиве: " +rubberArray.sumOfValues());
        System.out.println("Самое мальенькое число в массиве: " + rubberArray.min());
        System.out.println("Самое большое число в массиве: " + rubberArray.max());


        System.out.println("---------------------------------------------");

        Dog dog = new Dog("0", 150);
        Dog dog1 = new Dog("1", 120);
        Dog dog2 = new Dog("2", 100);

        int[] ints = {100, 150 , 200, 180};

        for( int currentBarrier : ints){
            dog.getBarrier(currentBarrier);
        }
        for( int currentBarrier : ints){
            dog1.getBarrier(currentBarrier);
        }
        for( int currentBarrier : ints){
            dog2.getBarrier(currentBarrier);
        }
        Dog.showNumberOfJump();

    }

}
