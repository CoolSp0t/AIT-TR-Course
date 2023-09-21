package lesson_48.enums;

public class Main {
    public static void main(String[] args) {
//        Directions north = Directions.NORTH;
//        System.out.println(north);
//        System.out.println(Directions.EAST);

        for (Directions direction : Directions.values()){
            System.out.println(direction);
        }

        Directions direction = Directions.WEST;
//        if(direction ==  Directions.EAST){
//            System.out.println("go east");
//        }else if()
//
        getDirection(Directions.EAST);
        getDirection(Directions.WEST);
        getDirection(Directions.NORTH);
        getDirection(Directions.SOUTH);

        String east = "east";
        Directions eastFromString = Directions.valueOf(east.toUpperCase()); //  если константы с таким значением нет, генерируется exception
        getDirection(eastFromString);

        Directions dir = Directions.NORTH;
        System.out.println(dir.getLetter());
        String letterWest = Directions.WEST.getLetter();
        System.out.println(letterWest);
    }




    public static void getDirection(Directions direction){
        switch (direction){
            case SOUTH:
                System.out.println("go south");
                break;
            case EAST:
                System.out.println("go east");
                break;
            case WEST:
                System.out.println("go west");
                break;
            case NORTH:
                System.out.println("go north");
                break;
        }
    }
}
