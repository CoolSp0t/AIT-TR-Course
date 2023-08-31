package lesson_33.cars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CarsDemoTest {
    Car car = new Car("Volvo", 2015, 30000);
    Car car1 = new Car("Toyota", 1990, 5000);
    Car car2 = new Car("Audi", 2023, 150000);
    Car car3 = new Car("Lada", 1980, 1);

    @Test
    public void sorted(){
        Car[] actual = {car, car1, car2, car3};
        Car[] expected ={car3, car1, car , car2};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void  testCompareTo(){
       assertTrue(car.compareTo(car1) > 0);
    }
    @Test
    public void testCompareToFalse(){
        assertFalse(car.compareTo(car1)<0);

    }

}