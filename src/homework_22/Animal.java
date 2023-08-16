package homework_22;

public class Animal {

    private String name;
    private int age;
    private final int numberOfAnimals;

    private static int counter;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.numberOfAnimals = counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }
    public void jump(){
        System.out.println("Я прыгаю");
    }

    public void running(){
        System.out.println("Я бегаю");
    }

    public void eat(){
        System.out.println("Я кушаю");
    }

    public String toString(){
        return  "Животное:"  + numberOfAnimals +  "; имя: " + name + "; мой возвраст: " + age;
    }


}
