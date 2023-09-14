package lesson_41;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Platforms {

    public static void main(String[] args) {
        List<Integer> arrival = Arrays.asList(100,140,150,200,215,400);
        List<Integer> departure = Arrays.asList(110,300,220,230,315,600);

        System.out.println("Minimum platforms required " + findMinPlatformsNumber(arrival, departure));
    }
    /*
    написать метод, находящий минимальное количество платформ требуюмых на ж/д станции чтобы принять количество поездов по расписанию

    Есть время прибытия и отправления поездов

    List arrival    [100,140,150,200,215,400]
    List departure  [110,220,230,300,315,600]
    List departure  [110,300,220,230,315,600]



    time        arr/dep         platforms
    1:00            arr             1
    1:10            dep             0
    1:40            arr             1
    1:50            arr             2
    2:00            arr             3
    2:15            arr             4
    2:20            dep             3
    2:30            dep             2
    3:00            dep             1
    3:15            dep             0
    4:00            arr             1
    6:00            dep             0
     */


    public static int findMinPlatformsNumber(List<Integer> arrival, List<Integer> departure){
        Collections.sort(arrival);
        Collections.sort(departure);
        int neededPlatforms = 0;
        int maxPlatforms = 0;
        int i = 0;
        int j = 0;

        while (i<arrival.size() && j< departure.size()){
            if(arrival.get(i) < departure.get(j)){
                neededPlatforms++;
                i++;

                if(neededPlatforms> maxPlatforms){
                    maxPlatforms= neededPlatforms;
                }

            }else {
                neededPlatforms--;
                j++;
            }


        }







        return maxPlatforms;

    }


}
