package lesson_57.method_reference;

import java.util.function.Predicate;

public class Main {
    /*
    Method References (ссылки на методы)
    ссылка на метод - это способ сослаться на метод не выполняя его.
    Ссылки на методы связаны с лямбда-выражениями т.к. им также требуется совместимый функциональный интерфейс

    Ссылки на статические методы(Method references to static methods)
    ClassName :: methodName
     */
    public static void main(String[] args) {
        boolean result = numTest(OurPredicateClass::isPositive, -1);
        if (result) {
            System.out.println("-1 is negative");
        } else {
            System.out.println("number is positive");
        }
        result = numTest(OurPredicateClass::isEven, 4);
        if (result) {
            System.out.println("4 is even");
        }
        result = numTest(OurPredicateClass::isPositive, 1);
        if (result) {
            System.out.println("1 is positive");
        }
        // ссылки на методы - Method references to instance method
        /*
        objectRef :: methodName
         */

        // Пример 2 - instance method reference
        System.out.println("------Instance method reference---------");
        OurIntegerNumber ourIntegerNumber = new OurIntegerNumber(9);
        OurIntegerNumber ourIntegerNumber1 = new OurIntegerNumber(10);

        IntPredicate intPredicate = ourIntegerNumber :: isFactor;
        result = intPredicate.test(3);
        System.out.println(result);

        intPredicate = ourIntegerNumber1 ::isFactor;
        result = intPredicate.test(3);
        System.out.println(result);

        /*
        Создание ссылки на любой объект класса через ссылку на обычный метод
        ClassName :: instanceMethodName
         */

        // Пример 3  ClassName :: instanceMethodName
        IntPredicate2 intPredicate2 = OurIntegerNumber ::isFactor;
        result =intPredicate2.test(ourIntegerNumber,3);
        System.out.println(result);

        result =intPredicate2.test(ourIntegerNumber1,3);
        System.out.println(result);

        //generic example
        SomeGenericInterface<Integer> someRef = SomeGenericClass::<Integer> genMethod;


        /*
        Ссылки на конструктор (Constructor references)
        className:: new -
        для создания ссылки на конструктор можно использовать функциональный интерфейс, метод которого совместим с конструктором
         */

        // constructor example
        OurInterfaceForConstructor forConstructor = OurClassForConstructor::new;
        OurClassForConstructor objectClass = forConstructor.method("Java");
        System.out.println("String in the new object is " + objectClass.str);




    }

    public static boolean numTest(IntPredicate p, int n) {
        return p.test(n);

    }
}
