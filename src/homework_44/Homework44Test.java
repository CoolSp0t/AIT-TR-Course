package homework_44;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Homework44Test {

    private Homework44 homework44;
    private List<Auto> autos;

    Auto auto1 =new Auto("Volvo","c60" ,10);
    Auto auto2 =new Auto("Mercedes","amers", 40000);
    Auto auto3 =new Auto("Volvo","a60",5000);
    Auto auto4 =new Auto("Volvo","a60", 1000);
    Auto auto5 =new Auto("Mercedes","bmers",39000);
    Auto auto6 =new Auto("Mercedes", "bmers", 1000000);
    Auto auto7 =new Auto("BMW" , "X5", 100000);

    @BeforeEach
    public  void setUp(){
        homework44 = new Homework44();
        autos = new ArrayList<>();

        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);
        autos.add(auto6);
        autos.add(auto7);
    }
    @Test
    public void test_autos(){
        Set<Auto> bmw = new TreeSet<>();
        bmw.add(auto7);


        Set<Auto> mercedes =new TreeSet<>();
        mercedes.add(auto2);
        mercedes.add(auto5);
        mercedes.add(auto6);


        Set<Auto> volvo = new TreeSet<>();
        volvo.add(auto1);
        volvo.add(auto3);
        volvo.add(auto4);

        Map<String,Set<Auto>> expected =new TreeMap<>();
        expected.put(auto7.getMake(),bmw);
        expected.put(auto2.getMake(),mercedes);
        expected.put(auto4.getMake(),volvo);
        assertEquals(expected,homework44.autoByMake(autos));
    }
    @Test
    public void test_autosOne(){



        Set<Auto> mercedes =new TreeSet<>();
        mercedes.add(auto2);
        mercedes.add(auto5);
        mercedes.add(auto6);



        Map<String,Set<Auto>> expected =new TreeMap<>();

        expected.put(auto2.getMake(),mercedes);
        List<Auto> newAutos = Arrays.asList(auto2,auto5,auto6);
        assertEquals(expected,homework44.autoByMake(newAutos));
    }



    @Test
    public void test_autosNo(){


        Map<String,Set<Auto>> expected =new TreeMap<>();

        List<Auto> newAutos = Arrays.asList();
        assertEquals(expected,homework44.autoByMake(newAutos));
    }
}