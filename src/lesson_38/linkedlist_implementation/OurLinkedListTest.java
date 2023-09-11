package lesson_38.linkedlist_implementation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    private OurLinkedList<Integer> list;

    @BeforeEach
    private void init() {
        list = new OurLinkedList<>();
    }

    @Test
    public void testAppendGet_emptyList_addsOneElement() {
        list.append(5);

        assertEquals(5, list.get(0));
    }

    @Test
    public void testAppendGet_emptyList_addsSeveralElement() {
        Integer[] expected = {2, 3, -1, 4, 23, 1, 3, 4, 5, 6, -17, 22, 26, 65, 15, 21};
        for (int i = 0; i < expected.length; i++) {
            list.append(expected[i]);
        }


        for (int i = 0; i < list.size(); i++) {
            assertEquals(expected[i], list.get(i));
        }

    }


    @Test
    public void testSize_emptyList_appendsOneElement() {
        list.append(5);
        assertEquals(1, list.size());
    }


    @Test
    public void testSize_emptyList_appendsSeveralElement() {
        Integer[] expected = {2, 3, -1, 4, 23, 1, 3, 4, 5, 6, -17, 22, 26, 65, 15, 21};
        for (int i = 0; i < expected.length; i++) {
            list.append(expected[i]);
        }
        assertEquals(expected.length, list.size());
    }

    @Test
    public void testSet_oneElement_swapsElement() {
        list.append(0);
        list.set(10, 0);
        assertEquals(10, list.get(0));
    }


    @Test
    public void testSet_severalElement_swapsFirstLastMiddleElement() {
        Integer[] source = {1, 4, -17, 18, 6};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        list.set(10, 0);
        list.set(100, 4);
        list.set(-1000, 2);
        Integer[] expected = {10, 4, -1000, 18, 100};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }


    }

    @Test
    public void testRemoveById_nonEmptyList_removesFirstElt() {
        Integer[] source = {5, 15, 2, 17, 23};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        Integer val = list.removeById(0);
        assertEquals(5, val);

        Integer[] expected = {15, 2, 17, 23};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());


    }

    @Test
    public void testRemoveById_nonEmptyList_removesMiddleElt() {
        Integer[] source = {5, 15, 2, 17, 23};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        Integer val = list.removeById(2);
        assertEquals(2, val);

        Integer[] expected = {5, 15, 17, 23};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());


    }

    @Test
    public void testRemoveById_nonEmptyList_removesLastElt() {
        Integer[] source = {5, 15, 2, 17, 23};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }
        Integer val = list.removeById(4);
        assertEquals(23, val);

        Integer[] expected = {5, 15, 2, 17};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());


    }

    @Test
    public void testRemove_nonEmptyList_removesLastElt() {
        Integer[] source = {5, 15, 2, 17, 23};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }

        boolean removed = list.remove(23);
        assertTrue(removed);

        Integer[] expected = {5, 15, 2, 17};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());

    }

    @Test
    public void testRemove_nonEmptyList_removesMiddleElt() {
        Integer[] source = {5, 15, 2, 17, 23};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }

        boolean removed = list.remove(2);
        assertTrue(removed);

        Integer[] expected = {5, 15,  17,23};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());

    }






    @Test
    public void testRemove_nonEmptyList_removesFirstElt() {
        Integer[] source = {5, 15, 2, 17, 23};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }

        boolean removed = list.remove(5);
        assertTrue(removed);

        Integer[] expected = { 15, 2, 17,23};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }

        assertEquals(4, list.size());

    }


    @Test
    public void testContains_nonEmptyList_containsElts() {
        Integer[] source = {5, 15, 2, 17, 23};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }

       assertTrue(list.contains(5));
       assertTrue(list.contains(17));
       assertTrue(list.contains(23));


    }

    @Test
    public void testContains_nonEmptyList_notContainsElts() {
        Integer[] source = {5, 15, 2, 17, 23};
        for (int i = 0; i < source.length; i++) {
            list.append(source[i]);
        }

        assertFalse(list.contains(51));
        assertFalse(list.contains(7));
        assertFalse(list.contains(27));


    }


}

