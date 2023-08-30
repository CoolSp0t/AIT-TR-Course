package homework_32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Homework32Test {



    Rectangle rectangle;
    Round round;
    Round round1;

    @BeforeEach
    public void setUp(){
        rectangle = new Rectangle(5, 2);
        round =new Round(1);
        round1 = new Round(2);
    }
    @Test
    public void oneEle_test(){
        double result = 3.1415;
        double[] doubles = {round.calculateSquare()};
        assertEquals(result, Homework32.totalSquare(doubles));


    }
    @Test
    public void twoEle_test(){
        double result = 3.1415 + 10;
        double[] doubles = {round.calculateSquare(), rectangle.calculateSquare() };
        assertEquals(result, Homework32.totalSquare(doubles));


    }

    @Test
    public void threeEle_test(){
        double result =(3.1415 *2*2)+3.1415+ 10;
        double[] doubles = {round.calculateSquare(),round1.calculateSquare(), rectangle.calculateSquare() };
        assertEquals(result, Homework32.totalSquare(doubles));

    }


}