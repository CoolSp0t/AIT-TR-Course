package lesson_43;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class OurHashMapTest {
    @Test
    public void testSize_emptyMap_newElements(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"f");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());
    }


    @Test
    public void testSize_emptyMap_noElements(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        assertEquals(0,newMap.size());
    }
    @Test
    public  void testSizePut_notEmptyMap_nonExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"f");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());


        newMap.put(6,"d");
        assertEquals(4, newMap.size());
    }


    @Test
    public  void testSizePut_notEmptyMap_existKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"f");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());


        newMap.put(2,"d");
        assertEquals(3, newMap.size());
    }


    @Test
    public  void testGet_notEmptyMap_existKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"f");
        newMap.put(1,"c");
        assertEquals("a",newMap.get(3));
        assertEquals("f",newMap.get(2));
        assertEquals("c",newMap.get(1));
    }


    @Test
    public  void testGet_notEmptyMap_nonExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"f");
        newMap.put(1,"c");
        assertEquals(null,newMap.get(7));
    }


    @Test
    public  void testGet_emptyMap_nonExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        assertEquals(null,newMap.get(7));

    }
    @Test
    public void testRemove_nonEmptyMap_existKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"f");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());

        newMap.remove(2);
        assertEquals(2,newMap.size());
        assertEquals(null,newMap.get(2));
    }
    @Test
    public void testRemove_nonEmptyMap_nonExistKey(){
        OurMap<Integer,String> newMap = new OurHashMap<>();
        newMap.put(3,"a");
        newMap.put(2,"f");
        newMap.put(1,"c");
        assertEquals(3,newMap.size());

        newMap.remove(6);
        assertEquals(3,newMap.size());
        assertNull(newMap.get(6));
    }

}