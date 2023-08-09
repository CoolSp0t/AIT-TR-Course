package homework_17;

public class Homework17 {
    public static void main(String[] args) {
        Dog dog = new Dog("Bonya" , 150 );

        int[] barrier = {50, 150, 120, 180, 160 , 280 , 350, 250, 500, 300 };
        int count = 0;
        for(int i : barrier){
            if(dog.getBarrier(i)){
                count++;
            }
        }
        System.out.println("Собака перепрыгнула " + count + " барьеров");
        dog.whoAmI();







    }
}
