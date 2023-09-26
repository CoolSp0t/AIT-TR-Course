package homework_45;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class Homework45Test {

    Homework45 homework45 = new Homework45();
    @Test
    public void testFindSingleNumber_3Numbers_2Different(){
        List<Integer> ints = Arrays.asList(1,3,1);
        assertEquals(3, homework45.returnNonPairNumber(ints));
        assertEquals(3, homework45.returnNonPairNumberMerge(ints));
    }

    @Test
    public void testFindSingleNumber_3Numbers_3Different(){
        List<Integer> ints = Arrays.asList(3,3,3);
        assertEquals(3, homework45.returnNonPairNumber(ints));
        assertEquals(3, homework45.returnNonPairNumberMerge(ints));
    }
    @Test
    public void testFindSingleNumber_5Numbers(){
        List<Integer> ints = Arrays.asList(1,1,15,1,1);
        assertEquals(15, homework45.returnNonPairNumber(ints));
        assertEquals(15, homework45.returnNonPairNumberMerge(ints));
    }
    @Test
    public void testFindSingleNumber_9Numbers(){
        List<Integer> ints = Arrays.asList(1,8,8,8,8,8,1,2,2);
        assertEquals(8, homework45.returnNonPairNumber(ints));
        assertEquals(8, homework45.returnNonPairNumberMerge(ints));
    }

    @Test
    public void testFindSingleNumber_throwsNoSuchElementException(){
        List<Integer> ints = Arrays.asList(1,8,8,8,8,1,2,2);
       assertThrows(NoSuchElementException.class,()-> homework45.returnNonPairNumberMerge(ints));
    }
}