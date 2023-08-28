package lesson_29;

public class Truck extends Car {

    private int fuelCurrentTankCapacity = 0;
    private int currentCapacity = 0;
    private int maxFuelTankCapacity;
    private int maxLoadCapacity;

    public Truck(String model, String manufacturer, int year, String colour, int maxLoadCapacity, int maxFuelTankCapacity) {
        super(model, manufacturer, year, colour);
        this.maxLoadCapacity = maxLoadCapacity;
        this.maxFuelTankCapacity = maxFuelTankCapacity;
    }

    public int getFuelCurrentTank() {
        return fuelCurrentTankCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public int getMaxFuelTankCapacity() {
        return maxFuelTankCapacity;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setFuelTankCapacity(int fuelCurrentTankCapacity) {
        if(fuelCurrentTankCapacity<=maxFuelTankCapacity){
        this.fuelCurrentTankCapacity = fuelCurrentTankCapacity;
        }else {
            System.out.println("my fuel tank is only " + maxFuelTankCapacity + " litres");
        }
    }



    public void load(int capacity){
        if(capacity > getRemainingCapacity() ){
            System.out.println("This is too heavy for me! Can`t continue");
            printRemainingCapacity();
            return;
        }
        currentCapacity += capacity;
        System.out.println("Loading " + capacity + " tons");
        System.out.println("Loaded " + capacity + " tons");
        printRemainingCapacity();
    }

    public void unload(int unloadCapacity){
        if(unloadCapacity > currentCapacity){
            System.out.println("Not enough cargo!");
            printRemainingCargo();
            return;
        }
        if(unloadCapacity < 0){
            System.out.println("Can`t unload negative capacity");
            return;
        }
        currentCapacity -= unloadCapacity;
        System.out.println("Unloading " +unloadCapacity + " tons");
        System.out.println("Unloaded " + unloadCapacity + " tons");
        printRemainingCargo();
    }

    private void printRemainingCargo(){
        System.out.println("Remaining cargo capacity is " + currentCapacity);
    }
    private int getRemainingCapacity(){
        return maxLoadCapacity -= currentCapacity;
    }
    private void printRemainingCapacity(){
        System.out.println("Remaining capacity " + getRemainingCapacity() + " tons");
    }



    @Override
    public void move() {
        if (fuelCurrentTankCapacity == 0) {
            System.out.println("Not enough fuel, can` t drive ");
            return;
        }
        if(currentCapacity == 0){
            System.out.println("Load Truck before driving");
        }
        System.out.println("Truck " + getModel() + " is moving");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + getModel() + " stopped");
    }
}
