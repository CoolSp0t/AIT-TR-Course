package lesson_29;

public class PassengerCar extends Car{

    private int capacity;

    public PassengerCar(String model, String manufacturer, int year, String colour, int capacity) {
        super(model, manufacturer, year, colour);
        this.capacity = capacity;
    }

    @Override
    public void move() {
        System.out.println("Passenger car " + getModel() +   " is moving");
    }

    @Override
    public void stop() {
        System.out.println("Passenger car "+ getModel() + " stopped");
    }

    public String toString(){
        return "PassengerCar{}" + super.toString();
    }
}
