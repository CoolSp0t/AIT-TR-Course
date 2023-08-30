package lesson_32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberTest {

    /*
    test cases
    1. массив пустой
    2. в массиве один элемент
    3. в массиве два элемента
    4. в массиве из нескольких элементов максимальный находится в середине
    5. в массиве из нескольких элементов максимальный находится в начале
    6. в массиве из нескольких элементов максимальный находится в конце
     */

    private MaxNumber m = new MaxNumber();
    @Test
    public void zeroElement_test(){
        int[] actual = {};
        assertEquals(-1,m.findMax(actual));
    }

    @Test
    public void oneElement_test(){
        int[] actual = {2};
        assertEquals(2, m.findMax(actual));
    }
    @Test
    public void twoElement_test(){
        int[] actual = {3,4};
        assertEquals(4,m.findMax(actual));
    }

    @Test
    public void severalElement_middleTest(){
        int[] actual = {2,4,7,9,3,1,5};
        assertEquals(9,m.findMax(actual));
    }

    @Test
    public void severalElement_startTest(){
        int[] actual = {9,4,7,2,3,1,5};
        assertEquals(9,m.findMax(actual));
    }

    @Test
    public void severalElement_endTest(){
        int[] actual = {2,4,7,5,3,1,9};
        assertEquals(9,m.findMax(actual));
    }


}