package homework_44;

public class Auto implements Comparable<Auto> {

    private String make;
    private String model;
    private int price;

    public Auto(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Auto o) {
        return model.equals(o.getModel()) ?  Integer.compare(price,o.getPrice()) : model.compareTo(o.getModel());

    }
}
