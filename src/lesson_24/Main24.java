package lesson_24;

public class Main24 {
    public static void main(String[] args) {
        Cat cat = new Cat(); // восходящее преобразование. Происходит автоматически
        Dog dog = new Dog();
        Hamster hamster = new Hamster();

        Cat cat1 = (Cat) cat; // низходящее преобразование
        cat1.eat();

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = hamster;

        for ( Animal animal: animals){
            animal.voice();
        }

        cat.voice();
        dog.voice();
        hamster.voice();


    }
}
