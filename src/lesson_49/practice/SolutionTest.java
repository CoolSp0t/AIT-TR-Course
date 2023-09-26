package lesson_49.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    List<Integer>test;

    @BeforeEach
    public void SetUp(){
    Solution solution1 = new Solution();
    test = Arrays.asList(1,2,3,5);
    }
    @Test
    public void simpleTest_true(){
        assertTrue(solution.multiplyWithOutOtherCollections(test,6));
        assertTrue(solution.multiplyWithArrayDeque(test,6));
    }

    @Test
    public void simpleTest_false(){
        assertFalse(solution.multiplyWithOutOtherCollections(test,7));
        assertFalse(solution.multiplyWithArrayDeque(test,7));
    }

    @Test
    public void simpleTest_false_oneElt(){
        assertFalse(solution.multiplyWithOutOtherCollections(Arrays.asList(3),7));
        assertFalse(solution.multiplyWithArrayDeque(Arrays.asList(3),7));
    }

    @Test
    public void simpleTest_false_less(){
        assertFalse(solution.multiplyWithOutOtherCollections(Arrays.asList(9,10,29),7));
        assertFalse(solution.multiplyWithArrayDeque(Arrays.asList(9,10,29),7));
    }

    @Test
    public void simpleTest_true_otherList(){
        assertTrue(solution.multiplyWithOutOtherCollections(Arrays.asList(2,5,18,70),36));
        assertTrue(solution.multiplyWithArrayDeque(Arrays.asList(2,5,18,70),36));
    }
    @Test
    public void simpleTest_false_otherTest(){
        assertFalse(solution.multiplyWithOutOtherCollections(Arrays.asList(2,5,18,70),40));
        assertFalse(solution.multiplyWithArrayDeque(Arrays.asList(2,5,18,70),40));
    }


}