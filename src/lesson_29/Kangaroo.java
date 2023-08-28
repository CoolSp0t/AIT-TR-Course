package lesson_29;

import java.util.Scanner;

public class Kangaroo implements Movable {


    @Override
    public void move() {
        System.out.println("Kangaroo is moving");
    }

    @Override
    public void stop() {
        System.out.println("Kangaroo  stopped");
    }


    public String toString(){
        return "Kangaroo";
    }






}
