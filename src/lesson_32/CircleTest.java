package lesson_32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    // given___ when___then___
    // givenRadius_whenFindArea_thenReturnArea
    @Test
    public void givenRadius1_whenFindArea_thenReturnArea3_14(){
        double actualArea = Circle.findArea(1d);
        double expectedArea = Math.PI;

        assertEquals(expectedArea,actualArea);

    }
    @Test
    public void givenAandB_whenCompare_thenReturn(){
          assertTrue(Circle.compareNumbers(5,3));

    }
    @Test
    public void givenThreeAndZero_whenCompare_thenReturnTrue(){
        assertTrue(Circle.compareNumbers(0,3));
    }
    @Test
    public void givenThreeAndZero_whenResultFalse_thenReturnTrue(){
        assertFalse(3<0);
        assertFalse(Circle.compareNumbers(0,3));
    }

}