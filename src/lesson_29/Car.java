package lesson_29;

public abstract class  Car implements Movable{

    private String model;
    private String manufacturer;
    private int year;
    private  String colour;

    public Car(String model, String manufacturer, int year, String colour) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public  void move(){
        System.out.println("Car " + getModel() +   " is moving");
    }



    @Override
    public  void stop(){
        System.out.println("Car "  + getModel() + " stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}
