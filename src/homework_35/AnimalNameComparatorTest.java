package homework_35;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AnimalNameComparatorTest {

    Animal animal1 = new Animal("Wolf", 100, "White");
    Animal animal2 = new Animal("Bear", 300, "Brown");
    Animal animal3 = new Animal("Fox", 150, "Red");
    Animal animal4 = new Animal("Elephant", 1000, "Grey");
    Animal animal5 = new Animal("Anaconda", 500, "Yellow");
    @Test
    public void nameComparatorTest(){
        Animal[] actual={animal1, animal2,animal3,animal4,animal5};
        Animal[] expected= {animal5,animal2,animal4,animal3,animal1};
        Arrays.sort(actual, new AnimalNameComparator());
        assertArrayEquals(expected,actual);
    }

}