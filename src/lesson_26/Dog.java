package lesson_26;

public class Dog  extends Animal{

    // дочерние классы должны обязательно реализовывать абстарктные методы родительского класса


    public void sound (){
        System.out.println("a dog woofs");
    }

    public void move(){
        System.out.println("a dog can run");
    }



}
