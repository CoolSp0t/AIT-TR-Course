package lesson_03;

public class IntegerNum {
    public static void main(String[] args) {
        System.out.println("Mathematics ");

        int x = 20;
        int y = 10;

        int z = x - y; // = - это присвоение, а не "равенство", как было в школе

        System.out.println(" z = x - y : " + z); // в кавычках - это текстовое оформление, сопровождение
        z = x * y;
        System.out.println(" z = x * y : " + z);

        int a = 57;
        int b = 10;

//         деление целых чисел
        int c = a / b;

        System.out.println("Частное " + a + " / " + b + " = " + c ); // целочисленное деление

        int d = a % b;

        System.out.println("Частное " + a + " % " + b + " = " + d ); // целочисленное деление c остатком

        int n = 60 % 12; // остаток от деления
        System.out.println(" 60 % 12 = " + n);

        System.out.println("========= вещественные числа ========");

        double f = 10.0D;
        double g = 9.8;
        double e = f / g;
        System.out.println("Result = " + f + " / " + g + " = " + e );

//      форматированный вывод
        System.out.printf("Result: %.2f",  e  );

//        преобразование типов
        int num1 = 10;
        int num2 = 3;

        double d1 = (double)num1 / (double)num2; // преобразование типа int в тип double
        System.out.println();
        System.out.println(d1);

        int num3 = (int)d1; // преобразование типа
        System.out.println(num3);

        System.out.println("======= методы класса Math. ======");

        double r = 10;
        double length = 2 * Math.PI * r; // длина окружности
        System.out.println("Length of circle is : " + length);

        double area = Math.PI * Math.pow(r, 2); // PI * r² - площадь круга
        System.out.println("Area of Circle is : "+ area);

        System.out.println("===== инкреметн и декремент ======");
        int i = 0;

        i++; // увеличение на 1

        System.out.println("i = " + i);

        ++i; // увеличение на 1

        System.out.println("i = " + i);


        // += , -+ , *= , /= - провести эксперименты, что получится. Прочитать в статьях
    }
}
