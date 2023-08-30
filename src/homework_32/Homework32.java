package homework_32;

public class Homework32 {
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

        double[] doubles = {square, square1};
        System.out.println("Total square: " +totalSquare(doubles));
    }


    public static double totalSquare(double rectangleSquare, double roundSquare) {
        return rectangleSquare + roundSquare;
    }

    public static double totalSquare(double[] doubles){
        double result = 0;
        for (int i = 0; i < doubles.length; i++) {
            result += doubles[i];
        }
        return result;
    }
}
