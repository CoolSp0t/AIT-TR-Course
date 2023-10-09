package lesson_58;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class TransformerTest {
    private Transformer transformer;
    String input;
    Predicate<String> predicate;
    Function<String,String> function;

    @BeforeEach
    public void setUp(){
        transformer = new Transformer();
        input = "aaa BBBB deF vbghR bbb";
    }
    @Test
    public void testEmpty(){
        input = "";
        predicate = s-> s.length() == 3;
        function = s-> s.toUpperCase();
        assertEquals("",transformer.transformString1(input,function,predicate));
    }
    @Test
    public void test3toUpperCase(){

        predicate = s-> s.length() == 3;
        function = s-> s.toUpperCase();
        assertEquals("AAA BBBB DEF vbghR BBB",transformer.transformString1(input,function,predicate));
    }

}