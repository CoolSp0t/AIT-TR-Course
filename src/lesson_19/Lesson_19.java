package lesson_19;

public class Lesson_19 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.whoAmI();


        cat.setName("Barsik");
        cat.setAge(-2);
        cat.setWeight(10);

        System.out.println("Name " + cat.getName());
        System.out.println("Age " + cat.getAge());
        System.out.println("Weight " + cat.getWeight());

    }
}
