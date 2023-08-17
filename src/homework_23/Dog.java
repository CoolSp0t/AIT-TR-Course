package homework_23;

public class Dog extends Animal {

    private int jumpHeight;
    public Dog(String name, int age,AnimalOwner owner, int jumpHeight) {
        super(name, age, owner);
        this.jumpHeight =jumpHeight;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void woof(){
        System.out.println("Я гавкаю");

    }



}
