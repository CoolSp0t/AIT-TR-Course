package homework_23;

public class Cat  extends Animal {
    private int weight;

    public Cat(String name, int age, AnimalOwner owner, int weight) {
        super(name, age, owner);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public void meow(){
        System.out.println("Я мяюкаю");
    }


}
