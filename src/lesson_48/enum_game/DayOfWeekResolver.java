package lesson_48.enum_game;

import lesson_48.enums.Directions;

import java.util.Scanner;

public class DayOfWeekResolver {

    private String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write the day of the week");
        String input = scanner.nextLine();
        return input;
    }


    private Weekdays weekdaysFromString(String input){
        Weekdays weekdaysFromString = Weekdays.valueOf(input.toUpperCase());
        return weekdaysFromString;
    }
    private void dayOfWeekResolver(Weekdays weekday){
        switch (weekday){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:{
                System.out.println(false);
                break;
            }
            case SATURDAY:
            case SUNDAY:{
                System.out.println(true);
                break;
            }
        }

    }


    public void start(){
        dayOfWeekResolver(weekdaysFromString(input()));
    }
}
