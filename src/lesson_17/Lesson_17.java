package lesson_17;

public class Lesson_17 {
    public static void main(String[] args) {
        Cat cat = new Cat("Max" , 5.0);

//        cat.whoAmI();
//        cat.eat();
//        cat.whoAmI();
//        cat.run();
//        cat.whoAmI();


        cat.startTraining(10);

        cat.whoAmI();




        /*
        Написать класс собака
       Собака должна иметь имя, высоту прыжка
       Должна уметь прыгать и должна уметь тренироваться. За каждую тренировку высота прыжка увеличивается на 10 сантиметров
       Максимальная высота, которую может натренировать собака не может быть больше, чем 2раза высоту первоначального прыжка
         */
        System.out.println("-----------------------------");


        Dog dog = new Dog("Jack" , 100);

        for (int i = 0; i < 7; i++) {
            dog.training();
        }
        System.out.println("---------------------------------");
        Dog dog1 = new Dog("Rax" , 150);

//        int barrier = 120;
//        dog.getBarrier(barrier);
//
//        barrier = 180;
//        dog.getBarrier(barrier);

        int[] barriers = {120, 180, 160 , 280 , 350, 50};
        for (int barrier: barriers){
            dog1.getBarrier(barrier);
        }











    }








}
