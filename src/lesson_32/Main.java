package lesson_32;

public class Main {
    /*
    Юнит тестирование JUnit5

    Тестирование это когда один программный код запускает другой с целью проверик его функционирования
    на соответствие ожидаемому результату




    Виды тестирования:

    unit тестирования - тестирование отдельных методов


    integration testing - проверяется работает  ли вся система или какой то ее компонент в соответствии с ожиданиями


    performance test - проверка эффективности работы системы при высокой нагрузке


    JUnit 5

    Платформа JUnit
    JUnit Jupiter
    JUnit Vintage

    Для тестирования методов какого либо класса обычно создается отдельный тестовый класс, который принято называть
    по имени тестируемого класса прибавляя в конце слово Test
    Car -> CarTest

    Несколько  аннотаций JUnit5:

    @BeforeEach - метод будет запускаться будет запускаться перед каждым тестовым методом
    @DisplayName - может использываться для определения имени теста
    @Test - становится тестовым методом




     */

    public static void main(String[] args) {
        Calculator calculator;
        calculator= new Calculator();
        System.out.println(calculator.multiply(4, 5));
        System.out.println(calculator.multiply(0, 5));
        System.out.println(Circle.compareNumbers(5,3));
        System.out.println(Circle.compareNumbers(3,5));


        System.out.println("---");

        int a = 1 ;
        int b= 2;
        System.out.println(Integer.compare(a, b));

    }


}

