package homework_28;

public class Rectangle implements Shape {

    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateSquare() {
        int square = height * width;
        return square;
    }

    @Override
    public double calculatePerimeter() {
        int perimeter = (height + width) * 2;
        return perimeter;
    }
}
