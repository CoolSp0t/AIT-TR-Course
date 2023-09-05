package homework_36;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class Homework36Test {
    ArrayList<Integer> ints1 = new ArrayList<>();

    ArrayList<Integer> ints2 = new ArrayList<>();
    @Test
    public void isEqualTest(){
        ints1.add(1);
        ints1.add(2);
        ints1.add(3);
        ints1.add(4);

        ints2.add(5);
        ints2.add(2);
        ints2.add(3);
        ints2.add(8);
        ArrayList<String> actual = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("No");
        expected.add("Yes");
        expected.add("Yes");
        expected.add("No");
        for (int i = 0; i < ints1.size(); i++) {
            if(ints1.get(i) == ints2.get(i)){
                actual.add("Yes");
            }else {
                actual.add("No");
            }
        }
        assertLinesMatch(expected, actual);

    }
    @Test
    public void isBiggerTest(){
        ints1.add(1);
        ints1.add(2);
        ints1.add(3);
        ints1.add(4);

        int a = 3;
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        ArrayList<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        actual.add(4);
        Iterator<Integer> iterator = actual.iterator();

        while (iterator.hasNext()){
            if(iterator.next()>=a){
                iterator.remove();
            }
        }

        assertTrue(expected.equals(actual));
    }

}