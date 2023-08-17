package homework_23;

public class AnimalOwner {

    private String name;
    private int age;
    private final int id;
    static private  int counter;

    public AnimalOwner(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = counter++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void train(Animal animal){
        System.out.println("Владелец питомца id " + id + " тренирует питомца id" + animal.getId());
    }
    public String  toString(){
        return "Владелец питомца id: " + id + "; имя: " + name;
    }






}
