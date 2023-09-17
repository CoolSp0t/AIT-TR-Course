package homework_43;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Homework43Test {

    private Homework43 homework43;
    @BeforeEach
    public void setUp(){
        homework43 = new Homework43();
    }
    @Test
    public void stringBooleanTestSeveral(){
        String[] words = new String[] {"a","b","a","b","c"};
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);

        assertEquals(expected, homework43.findTrueFalse1(words));
        assertEquals(expected, homework43.findTrueFalse2(words));
    }

    @Test
    public void stringBooleanTestSame(){
        String[] words = new String[] {"c","c","c","c","c"};
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("c", true);

        assertEquals(expected, homework43.findTrueFalse1(words));
        assertEquals(expected, homework43.findTrueFalse2(words));
    }


    @Test
    public void stringBooleanTestAllFalse(){
        String[] words = new String[] {"a","b","c"};
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a", false);
        expected.put("b", false);
        expected.put("c", false);

        assertEquals(expected, homework43.findTrueFalse1(words));
        assertEquals(expected, homework43.findTrueFalse2(words));
    }
    @Test
    public void nameToNumberTest_2(){
        List<String> input = Arrays.asList("John", "Mary", "Peter","John");
        assertEquals(2,homework43.nameToNumberOccurence(input,"John"));
    }


    @Test
    public void nameToNumberTest_1(){
        List<String> input = Arrays.asList("John", "Mary", "Peter","John");
        assertEquals(1,homework43.nameToNumberOccurence(input,"Peter"));
    }

    @Test
    public void nameToNumberTest_0(){
        List<String> input = Arrays.asList("John", "Mary", "Peter","John");
        assertEquals(0,homework43.nameToNumberOccurence(input,"Bill"));
    }


    @Test
    public void nameToNumberTest_onlyTwoJohns(){
        List<String> input = Arrays.asList("John","John");
        assertEquals(2,homework43.nameToNumberOccurence(input,"John"));
    }


    @Test
    public void findAnagram(){
        List<String> input = Arrays.asList("john","ann","bill","nan","nna","llbi","ohnj");
        List<String> expected = Arrays.asList("john","ohnj");
        assertEquals(expected,homework43.findAnagrams("john",input));

    }
    @Test
    public void findAnagram_nonExist(){
        List<String> input = Arrays.asList("john","ann","bill","nan","nna","llbi","ohnj");
        List<String> expected = new ArrayList<>();
        assertEquals(expected,homework43.findAnagrams("kenny",input));
    }

    @Test
    public void findAnagram_oneExist(){
        List<String> input = Arrays.asList("john");
        List<String> expected = new ArrayList<>();
        expected.add("john");
        assertEquals(expected,homework43.findAnagrams("john",input));
    }












}