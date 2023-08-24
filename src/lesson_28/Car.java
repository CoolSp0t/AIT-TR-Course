package lesson_28;

public class Car implements Movable, Breakable{

    @Override
    public void canMove() {
        System.out.println("a car can drive");
    }


    @Override
    public void canBreak() {
        System.out.println("a car can break");
    }
}
