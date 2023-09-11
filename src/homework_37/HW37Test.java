package homework_37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HW37Test {
    HW37 hw37;
    @BeforeEach
    public void setUp(){
        hw37 = new HW37();
    }
    @Test
    public void shortestOrLongestTest_oneElement(){
        assertEquals("a",hw37.findShortestOrLongest(Arrays.asList("a")));
    }
@Test
    public void shortestOrLongestTest_shortFirst(){
        assertEquals("a",hw37.findShortestOrLongest(Arrays.asList("bb","a","ddd")));
    }  public void shortestOrLongestTest_longestFirst(){
        assertEquals("aaa",hw37.findShortestOrLongest(Arrays.asList("bb","aaa","d")));
    }

}