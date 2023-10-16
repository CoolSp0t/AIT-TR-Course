package homework_62;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

public class Homework62 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами
         */

        // Получить и вывести на экран:
        // -текущую дату
        //  -текущий год, месяц и день
        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDateNow);
        System.out.println(localDateNow.getYear());
        System.out.println(localDateNow.getMonth());
        System.out.println(localDateNow.getDayOfWeek());

        // Создать дату , например день рождения и вывести на экран
        LocalDate BirthDay = LocalDate.of(2001,12,2);
        System.out.println(BirthDay);

        // Создать две даты и проверить на равенство
        LocalDate localDate1 = LocalDate.of(2023,5,5);
        LocalDate localDate2 = LocalDate.of(2021,4,7);
        System.out.println(localDate1.compareTo(localDate2));

        // Получить и вывести на экран текущее время
        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTimeNow);

        // текущее время + 3 часа
        LocalTime localTimeNowPlusThreeHours = localTimeNow.plusHours(3);
        System.out.println(localTimeNowPlusThreeHours);

        //Создать дату на неделю позже сегодняшней
        LocalDate plusWeekDate = LocalDate.now().plusWeeks(1);

        // Создать дату, которая была на год раньше сегодняшней используя метод minus
        LocalDate minusYearDate = LocalDate.now().minusYears(1);

        //Создать дату на год позже сегодняшней используя plus метод
        LocalDate plusYearDate = LocalDate.now().plusYears(1);

        //Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate today = LocalDate.now();
        System.out.println(today.isBefore(yesterday));
        System.out.println(today.isAfter(tomorrow));


    }

    //Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами
    public static int daysBetween(List<LocalDate> dateList){
        LocalDate min = dateList.get(0);
        LocalDate max = dateList.get(0);
        for (int i = 0; i < dateList.size(); i++) {
            if(min.isBefore(dateList.get(i))){
                min = dateList.get(i);
            }
            if(max.isAfter(dateList.get(i))){
                max= dateList.get(i);
            }

        }
        return Period.between(min,max).getDays();
    }

    public static long daysBetween1(List<LocalDate> dateList){
        List<LocalDate> sorted = dateList.stream().sorted().collect(Collectors.toList());

        return ChronoUnit.DAYS.between(sorted.get(0),sorted.get(sorted.size()-1));

    }
}
