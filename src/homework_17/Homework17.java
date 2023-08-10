package homework_17;

import java.util.Random;

public class Homework17 {
    public static void main(String[] args) {
        Random random = new Random();
        Dog dog = new Dog("Bonya" , random.nextInt(101) );

        int[] barrier = {50, 150, 120, 180, 160 , 280 , 350, 250, 500, 300 };
//        int count = 0;
//        for(int i : barrier){
//            if(dog.getBarrier(i)){
//                count++;
//            }
//        }
//        System.out.println("Собака перепрыгнула " + count + " барьеров");
        dog.whoAmI();


        Dog testDog =new Dog("Test" , 53);

        int[] ints = {106, 112 , 100 , 120};

        for( int currentBarrier : ints){
            testDog.getBarrier(currentBarrier);
        }

        System.out.println("--------------------------------------------------------");


        Dog[] dogs = new Dog[3];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog("Dog" + (i+1),random.nextInt(151));
            dogs[i].whoAmI();
        }


    }
    public static int startTrainingForOneDog(Dog dog , int[] barriers){
        int count = 0;
        for(int i : barriers){
            if(dog.getBarrier(i)){
                count++;
            }
        }
        return count;
    }
}
