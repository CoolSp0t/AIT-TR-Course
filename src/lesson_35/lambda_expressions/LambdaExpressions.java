package lesson_35.lambda_expressions;

public class LambdaExpressions {

    /*
    Lambda expressions and Functional Interfaces
    Лямбда выражения и фукнциональные интерфейсы

    Лямбда выражения - это фактически форма анонимного класса, анонимный метод(метод без названия)
    Лямбда выражения связаны с функциональными интерфейсами

    Функциональный интерфейс - это интерфейс с  одним абстрактным методом


    Синтаксис лямбда выражения
    параметры -> тело лямбда выражения
    parameter -> lambda body
     */

    public static void main(String[] args) {
//        без параметров
//        () -> 100.0;

//        () -> Math.random() * 1000;

//        с параметрами
//        (n) -> 2.0 / n;
//        (n) -> (n % 2) == 0; возвращает boolean
//        n -> 1/n;

        // double getValue();
        OurValue ourValue;
        ourValue = () -> 100.0;
//        ourValue = () -> "str"; не совместимый тип
        System.out.println("value is " + ourValue.getValue());

        OurParamValue ourParamValue = (double n) -> 2.0 / n;
        System.out.println("Value with param is" + ourParamValue.getValue(100.0));
//        ourParamValue = () -> 2.0 ; не совместим по колво параметров


        OurTestInterface isDivided = (a, b) -> (a % b) == 0;
        System.out.println("a is divided by b without remainder? " + isDivided.test(10, 2));

        OurTestInterface isMore = (a, b) -> (a > b);
        System.out.println("a > b? " + isMore.test(10, 2));

        OurTestInterface isEqual = (a, b) -> a == b;
        System.out.println("a == b? " + isEqual.test(10, 2));

        StringTestInterface isPart = (a, b) -> a.indexOf(b) != -1;
        String str = " This is a test";
        System.out.println("a is part b ? " + isPart.test(str,"is"));

        StringTestInterface isEqualString = (str1, str2) -> str1.equals(str2);
        System.out.println(isEqualString.test("qwerty","qwertz"));


        NumericInterface smallDivider = n -> {
            int res = 1;
            n = n < 0 ? -n : n;
            for (int i = 2; i <= n ; i++) {
                if( n % i == 0 ){
                    res = i ;
                    break;
                }
            }
            return res;
        };


    }


    public double return100() {
        return Math.random() * 1000;
    }
}
