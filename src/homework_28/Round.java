package homework_28;

public class Round implements Shape {
    int radius;
    private static final double PI = 3.1415;

    public Round(int radius) {
        this.radius = radius;
    }


    @Override
    public double calculateSquare() {
        double square = PI * radius * radius;
        return square;

    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * PI * radius;
        return perimeter;

    }
}
