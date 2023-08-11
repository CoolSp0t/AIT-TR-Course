package lesson_19;

public class Auto {
    public void gas(){
        System.out.println("Авто едет вперед!");
    }
    /*
    Происходят какие то сложные действия,
    в результате которых автомобиль движется вперед
     */

    public void breakMe(){
        System.out.println("Авто замедляется");
    }
    /*

    */

    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.gas();
        auto.breakMe();

    }


}
