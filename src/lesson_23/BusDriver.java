package lesson_23;

import java.util.Arrays;

public class BusDriver {
    private String name;
    private String[] categories;
    private int age;
    private final int id;
    static private int counter;
    int cursor;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        cursor = 0;
        categories[0] = "B";
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

    public String[] getCategories() {
        return categories;
    }

    public void addCategories(String categories) {
        if (isArrayFull()) {
            extractCategories();
        }
        this.categories[cursor+1] = categories;
        cursor++;
    }

    private boolean isArrayFull(){
        return cursor == categories.length-1;
    }
    public void extractCategories() {
        categories = Arrays.copyOf(categories, categories.length + 1 );
    }

    public void removeCategory(String category) {
        //TODO
    }


    public String toString() {
        return "{id: " + id + "; name:" + name + "; categories:" + Arrays.toString(categories) + "}";
    }

    // метод запускающий у водителя функцию "управления автобусом"
    // в параметры метода приходит ссылка на конкрентный автобус, которым автобусом будет управлять
    public void driveBus(Bus bus) {
        System.out.println("Водитель " + name + " управляет автобусом id:" + bus.getId());
    }
}

