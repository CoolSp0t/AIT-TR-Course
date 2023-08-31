package lesson_33.cars;

import java.util.Arrays;

public class CarsDemo {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 2015, 30000);
        Car car1 = new Car("Toyota", 1990, 5000);
        Car car2 = new Car("Audi", 2023, 150000);
        Car car3 = new Car("Lada", 1980, 1);

        Car[] cars = {car, car1, car2, car3};
        Arrays.sort(cars);

        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i].toString());
            System.out.println("");
        }


    }
}
