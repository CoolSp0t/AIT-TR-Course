package lesson_43.set_implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OurHashSetTest {

    @Test
    public void size_returnsNumberOfElementsInSet(){
        OurSet<Integer> ourSet = new OurHashSet<>();
        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(4);
        assertEquals(3,ourSet.size());
    }

    @Test
    public void add_returnsTrueForNewElt(){
        OurSet<Integer> ourSet = new OurHashSet<>();
        boolean result = ourSet.add(1);
        assertTrue(result);
    }

    @Test
    public void add_returnsFalseForExistingElt(){
        OurSet<Integer> ourSet = new OurHashSet<>();
        ourSet.add(1);
        boolean result = ourSet.add(1);
        assertFalse(result);

    }
    @Test
    public void remove_returnsTrueForExistingElt(){
        OurSet<Integer> ourSet = new OurHashSet<>();
        ourSet.add(1);
        boolean result = ourSet.remove(1);
        assertTrue(result);
    }

    @Test
    public void remove_returnsFalseForNonExistingElt(){
        OurSet<Integer> ourSet = new OurHashSet<>();
        ourSet.add(1);
        boolean result = ourSet.remove(2);
        assertFalse(result);
    }

    @Test
    public void contains_returnsTrueForExistingElt(){
        OurSet<Integer> ourSet = new OurHashSet<>();
        ourSet.add(1);
        boolean result = ourSet.contains(1);
        assertTrue(result);
    }


    @Test
    public void contains_returnsFalseForNonExistingElt(){
        OurSet<Integer> ourSet = new OurHashSet<>();
        ourSet.add(1);
        boolean result = ourSet.contains(2);
        assertFalse(result);
    }





}