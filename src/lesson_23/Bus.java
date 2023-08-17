package lesson_23;

public class Bus {
    private final int id;
    private String model;
    private int capacity;
    static private int counterForId;
    private  BusDriver driver; //изначально null
    private final  AutoPilotBus autoPilot;

    public Bus(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.autoPilot = new AutoPilotBus("AP-001" , this);
        this.id = counterForId++;
    }

    public Bus(String model, int capacity, BusDriver driver) {
        this(model,capacity);
        this.driver = driver;

    }

    public String getAutoPilotInfo() {
        return autoPilot.toString();
    }

    public void moveByDriver(){ // автобус начинает движение
        //проверяем включен ли автопилот
        if(autoPilot.isActive()){
            autoPilot.turnOff();
        }

        // водителю автобуса передается команда начать управление автобусом
        driver.driveBus(this); // в методе водителю передается ссылка на автобус
    }
    public void moveByAutopilot(){
        autoPilot.driveBus();
    }
    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) { // назначить водителя этого автобуса
        this.driver = driver;
    }

    public String toString() {
        return "{id: " + id + "; model:" + model + "; driver: " + (driver == null ? "no driver yet" : driver.toString()) + " автопилот:" + autoPilot.toString() +"}";
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}


