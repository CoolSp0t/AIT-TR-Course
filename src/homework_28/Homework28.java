package homework_28;

public class Homework28 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Round round = new Round(7);

        double square = rectangle.calculateSquare();
        System.out.println("Rectangle square: " + rectangle.calculateSquare());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());


        double square1 = round.calculateSquare();
        System.out.println("Round square: " + round.calculateSquare());
        System.out.println("Round perimeter: " + round.calculatePerimeter());

        System.out.println("Total square: " + totalSquare(square, square1));
    }


    public static double totalSquare(double rectangleSquare, double roundSquare) {
        return rectangleSquare + roundSquare;
    }


}
