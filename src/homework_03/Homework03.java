package homework_03;

public class Homework03 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int num0 = 0 , num1 = 1 , num2 = 2 , num3 = 3, num4 = 4, num5 = 5,  num6 = 6, num7 = 7, num8 = 8,  num9 = 9;
        int num10 = 10;
        int numTogether = num0 + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9;
        int numDivision = numTogether / num10;
        int numRemainder = numTogether % num10;
        System.out.println("Result : " + numDivision);
//        отбросило 0.5 так как мы работаем только с целыми числами
        double d1 = (double)numTogether / (double)num10;
        System.out.println("Result Double " + d1);

        System.out.println("Task 2");

        double productA = 1000;
        double productB = 500;
        double discount = 0.1;
        double result = productA + productB;
        double result2 = result *  (1 - discount);
        double discountResult = result - result2;
        System.out.println("Result = " + result2 + " Discount = " + discountResult );


        System.out.println("Task 3");
        double temp1 = 27 , temp2 = 34 , temp3 = 27 , temp4 = 26 , temp5 = 25 , temp6 = 25 , temp7 = 22;
        double tempTogether = temp1 + temp2 + temp3 + temp4 + temp5 + temp6 +temp7;
        double tempAverage = tempTogether / 7;
        System.out.printf("Result : %.2f", tempAverage);

        System.out.println();
        System.out.println("Task 4");

        int a = 33;
        int b = a%2;
        System.out.println("First result : " + b);

        int x = 5;
        int y = x%3;
        System.out.println("Second result : " + y);





    }

}
