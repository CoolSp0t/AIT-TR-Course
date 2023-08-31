package lesson_33.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnimalWeightComparatorTest {
    Animal animal1 = new Animal("Wolf", 100, "White");
    Animal animal2 = new Animal("Bear", 300, "Brown");
    Animal animal3 = new Animal("Fox", 150, "Red");
    Animal animal4 = new Animal("Elephant", 1000, "Grey");
    Animal animal5 = new Animal("Anaconda", 500, "Yellow");
    @Test
    public void weightComparatorTest(){
        Animal[] actual={animal1, animal2,animal3,animal4,animal5};
        Animal[] expected = {animal1,animal3,animal2,animal5,animal4};
        Arrays.sort(actual,new AnimalWeightComparator());
        assertArrayEquals(expected,actual);
    }

}