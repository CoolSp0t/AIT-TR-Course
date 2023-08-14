package lesson_20;

public class Lesson20 {
    int noStatic = 10;
    static int staticInt = 20;

    public static void main(String[] args) {
        Car car = new Car("BMW", 200);
        Car car1 = new Car("Skoda", 110);
        Car car2 = new Car("Seat", 120);
//        Car.numberOfCars = 13; // !!! Статические поля тоже нужно закрывать (private) от прямого взаимодействия с ними  . Инкапсулировать
        System.out.println("Всего создано машин: " + car.getNumberOfCars());
        Car.showStaticInfo();
//        car1.showStaticInfo(); обращение к статик методу возможно от имени экземпляра класса
//        но так делать НЕ НУЖНО!

        System.out.println("---------------");


//        static int a = 1; // не допустимое место для создания стачичной переменной

        staticInt++;
        test();
//        testNotStatic(); // нет доступа

        // вызов статичкеского метода класса
        System.out.println("Сумма чисел: " + MathUtils.sumOfInts(5, 6, 7 , 8) );
        Math.sqrt(4);







    }

    static void test() { // в статических методах есть доступ ТОЛЬКО к статическим классам.
        staticInt++;
        //noStatic++; нет доступа к переменной
    }

    public void testNotStatic(){ //в не статических методах есть доступ ко всем членам Статик и не статик
        staticInt++;
        noStatic++;
        test();
    }
}
