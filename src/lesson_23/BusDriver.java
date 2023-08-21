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


    public void addCategories1(String category) {
        // option 1
//        String[] temp = new String[this.categories.length +1];
//        for (int i = 0; i < categories.length; i++) {
//            temp[i] = categories[i];
//        }
//        temp[temp.length-1] = category;
//        this.categories = temp;

        //option 2
        categories = Arrays.copyOf(categories, categories.length + 1);
        categories[categories.length - 1] = category;

    }


// var 1
//    public void addCategories(String categories) {
//        if (isArrayFull()) {
//            extractCategories();
//        }
//        this.categories[cursor+1] = categories;
//        cursor++;
//    }
//
//    private boolean isArrayFull(){
//        return cursor == categories.length-1;
//    }
//    public void extractCategories() {
//        categories = Arrays.copyOf(categories, categories.length + 1 );
//    }


    public void testArrayCopy(int index){ // вариант два для удаления по индексу
        String[] strings = new String[categories.length-1];
        if(index < 0 || index > categories.length -1) return;
        System.arraycopy(categories,0, strings,0, index);
        System.arraycopy(categories,index+1, strings, index,strings.length-index );
        System.out.println(Arrays.toString(strings));
    }

    public boolean removeCategory(String category) { // str.equals(str1)
        //1. Такая строка в массиве есть?
        //2. Нам нужен ее индекс
        //3. Непосредственно удаление из массива
        int index = searchCategoryValue(category);
        if (index == -1) return false;
        String[] temp = new String[categories.length - 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < index) {
                temp[i] = categories[i];
            } else {
                temp[i] = categories[i + 1];
            }

        }
        categories = temp;
        return true;
    }

    private int searchCategoryValue(String category) {
        if (category == null || category.length() == 0 || categories.length == 0) return -1;
        for (int i = 0; i < categories.length; i++) {
            if (categories[i].equals(category)) {
                return i;
            }
        }
        return -1;

    }

    public void removeAllCategories(){
        categories = new String[0];
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

