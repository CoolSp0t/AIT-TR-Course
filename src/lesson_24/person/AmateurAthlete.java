package lesson_24.person;

public class AmateurAthlete extends Person {

    private int speed = 15;
    public AmateurAthlete() {
        this.speed = speed;
    }

    @Override
    public void running() {
        System.out.println("Я бегу со скоротью " + speed + " км" );
    }
}
