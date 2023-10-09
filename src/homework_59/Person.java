package homework_59;

public class Person extends Address{

    String name;
    int age;

    public Person(String name, int age,String address,int houseNumber) {
        super(address, houseNumber);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
