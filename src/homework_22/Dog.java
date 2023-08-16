package homework_22;

public class Dog extends Animal{

    private int jumpHeight;
    public Dog(String name, int age, int jumpHeight) {
        super(name, age);
        this.jumpHeight =jumpHeight;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void woof(){
        System.out.println("Я гавкаю");

    }



}
