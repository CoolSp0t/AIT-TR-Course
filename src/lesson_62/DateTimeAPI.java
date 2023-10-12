package lesson_62;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Set;

public class DateTimeAPI {
    /*
    Data/Time API

    Начиная с Java 8 появились новые классы для работы с датой и временем

    Существовавшие до этого классы имели ряд недостатков:
    1. Не были потокобезопасными
    2. Плохой дизайн и работа методов
    3. Не учитывали временные зоны

    Основные новые классы для работы с датой и временим:
    1. LocalDate
    2. LocalTime
    3. LocalDateTime
    4. ZonedDateTime
    5. Period
    6. Duration

    Классы 1-3 - наиболее часто используемые. Используют местное время и как правило указывать
    временные зоны не нужно
     */

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now(); // now() -  возвращает текущие время
        System.out.println("Time now is " +  localTime);

        LocalTime localTime1 = LocalTime.of(13,35,20); // of() - создание объекта LocalTime
        System.out.println("our time is " + localTime1);

        // получить часы
        System.out.println("Hour " + localTime1.getHour());

        // получить минуты
        System.out.println("Hour " + localTime1.getMinute());

        // методы добавления часов, минут, секунд, наносекунд к объекту времени
        LocalTime newLocalTime = LocalTime.of(17,25,34,11111111);
        System.out.println("Adding hours " + newLocalTime.plusHours(2));
        System.out.println("Adding minutes " + newLocalTime.plusMinutes(10));
        System.out.println("Adding seconds " + newLocalTime.plusSeconds(10));
        System.out.println(newLocalTime);

        // методы для вычитания часов, минут, секунд, наносекунд от времени
        System.out.println("Subtracting hours " + newLocalTime.minusHours(1));

        // isBefore() and isAfter() - проверяет раньше ли один объект времени другого или позже
        // позже или раньше чем время с которым оно сравнивается. Возвращается true или false соответственно

        LocalTime timeToCheck = LocalTime.of(13,25);
        System.out.println(timeToCheck.isBefore(LocalTime.now()));
        System.out.println(timeToCheck.isAfter(LocalTime.now()));

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

        // LocalDate - предоставляет собой дату без указания временной зоны в формате год - месяц - день (year-month-day)

        LocalDate localDate = LocalDate.of(2023,1,10);
        System.out.println(localDate);
        System.out.println(LocalDate.now());


        System.out.println(LocalDate.now().isLeapYear()); // проверяет високосный ли год

        // isBefore isAfter
        System.out.println(localDate.isAfter(LocalDate.now()));
        System.out.println(localDate.isBefore(LocalDate.now()));

        LocalDate dateNow = LocalDate.now();
        LocalDate yesterday = dateNow.minusDays(1);
        System.out.println("yesterday " + yesterday);

        System.out.println(dateNow.getDayOfWeek());
        System.out.println(dateNow.getEra());
        System.out.println(dateNow.lengthOfMonth());
        System.out.println(dateNow.lengthOfYear());

        //LocalDateTime - сочетание даты и времени

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTimeNow);

         LocalDateTime localDateTime1 =LocalDateTime.of(2000,10,1,10,15);
        System.out.println(localDateTime1.getDayOfYear());
        System.out.println(localDateTime1.getMonth());
        System.out.println(localDateTime1.getMonthValue());

        // ZonedDateTime - время/дата с учетом временной зоны
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        LocalDateTime now =LocalDateTime.now();
        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime inLondon = ZonedDateTime.of(now,london);
        System.out.println(inLondon);


        inLondon = ZonedDateTime.now(london);

        ZonedDateTime inBerlin = ZonedDateTime.now();


        Iterator<String> iterator = availableZoneIds.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        availableZoneIds.forEach(System.out::println);


        // Period - класс, используемый для изменения или получения разницы между двумя датами. Он работает
        // с временными единицами год, месяц, день
        LocalDate nowDate = LocalDate.now();
        LocalDate finalDate = nowDate.plus(Period.ofDays(5));
        System.out.println(finalDate);

        int fiveDays = Period.between(nowDate, finalDate).getDays();
        ChronoUnit.DAYS.between(nowDate,finalDate);


        // Duration - класс можно использовать при работе с временем
        LocalTime initTime = LocalTime.of(10,30,50);
        LocalTime newTime = initTime.plus(Duration.ofHours(2));
        long duration = Duration.between(initTime,newTime).getSeconds();
        System.out.println(duration);

        ChronoUnit.SECONDS.between(initTime,newTime);

        //  форматирование даты и времени DateTimeFormatter
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        String formatted = dateTimeFormatter.format(dateTime);
        System.out.println("Formatted with Basic ISO date format string is " + formatted);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String formatted1 = dateTimeFormatter1.format(dateTime);
        System.out.println("Formatted with  ISO local date format string is " + formatted1);

        // "2023/10/12 12:42:30 - представление текущего времени преобразовать такому формату
        DateTimeFormatter ourFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println(dateTime.format(ourFormatter));

        /*
        y - year
        M - month в виде числе
        MMM - month Jan
        MMMM - полное название месяца
        d - day день месяца
        E - день недели Mon Пон
        EEEE - полное название дня недели
        h - hour час 1-12
        H - hour 0-23
        m - minute
        s - second
        a - am/pm

        yyyy-MM-dd "2023-12-10"
        dd-MMM-yyyy "12-Oct-2023"
        E,MMM dd yyyy "Thu,Oct 12 2023"
        h:mm a "12:58 PM"


         */


    }
}
