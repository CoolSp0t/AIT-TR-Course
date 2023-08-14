package lesson_20;

public class StaticInitDemo {
   private static Car[] cars;
   static String[] strings;

    static {
        cars= new Car[3];
        Car car = new Car("BMW", 200);
        Car car1 = new Car("Seat" , 300);
        Car car2 = new Car("Skoda" , 150);
        cars[0] = car1;
        cars[1] = car;
        cars[2] = car2;
    }

    {
    strings = new String[4];
    strings[0] = "Hello";
    strings[1] = "World";
    strings[2] = strings[0] + ", " + strings[1];
    }


    public StaticInitDemo(){
//        initString(); тоже вариант инициализации полей начальный
    }

    private void initString(){
        strings = new String[4];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = strings[0] + ", " + strings[1];
    }


    public void showAllCars(){
        System.out.println("Всего машин " + cars.length);
        System.out.print("[");
        for (Car carCurrent: cars ){
            System.out.print(carCurrent.getName() + ", ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        StaticInitDemo staticDemo = new StaticInitDemo();
        staticDemo.showAllCars();
    }


}
