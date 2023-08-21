package lesson_24.person;

public class ProAthlete extends Person{
    private int speed = 25;

    public ProAthlete() {
        this.speed = speed;
    }

    @Override
    public void running() {
        System.out.println("Я бегу со скоротью " + speed + " км" );
    }
}
