package homework_22;

public class Cat  extends Animal{
    private int weight;
    public Cat(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void meow(){
        System.out.println("Я мяюкаю");
    }


}
