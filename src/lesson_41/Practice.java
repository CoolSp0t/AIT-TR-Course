package lesson_41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

    /*
    Написать метод, который принимает лист имен , в котором имена могут повторяться и возвращает лист повторяющихся
    элементов
    "John", "Peter","Mary","Ann","John","Peter" -> John,Peter
    List<String> getDuplicates( List<String> input)

     */



    public List<String> getDuplicates(List<String> input){
        Set<String> res = new HashSet<>(input);
        res.removeAll(input);
        return  new ArrayList<>(res);
    }


    // все задачи в HW40

}
