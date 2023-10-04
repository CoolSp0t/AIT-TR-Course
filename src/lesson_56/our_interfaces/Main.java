package lesson_56.our_interfaces;

public class Main {
    /*
    Используя наши интерфейсы написать такие лямбда выражения:
    1. Конкатинировать числа a и b
    1 и 2 -> 12

    2. Если длина строки равна трем вернуть true иначе false
    3. Если длина строки четная вернуть true иначе false
    4. Вернуть строку в верхний регистр
    5. Если длина строки равна 4 вернуть 4 звездочки **** вернуть строку без изменений
    6. Распечатать строку в виде !строка!
    7. Возвращает "Hello World"
     */
    public static void main(String[] args) {
        // 1. Конкатинировать числа a и b
        Concatable concatable = (a , b) -> Integer.toString( a) + Integer.toString(b);
        String result = concatable.concat(1,2);
        System.out.println(result);

        // 2. Если длина строки равна трем вернуть true иначе false
        Checkable checkable = (str) -> str.length() == 3;
        System.out.println(checkable.check("pay"));

        // 3. Если длина строки четная вернуть true иначе false
        Checkable checkable1 = (str) -> str.length() % 2 == 0;
        System.out.println(checkable1.check("pay"));

        // 4. Вернуть строку в верхний регистр
        Transformable transformable = (str) -> str.toUpperCase();
        System.out.println(transformable.modify("pay"));

        // 5. Если длина строки равна 4 вернуть 4 звездочки **** вернуть строку без изменений
        Transformable transformable1 = (str) ->{
            if(str.length() == 4){
                return "****";
            }
            return  str;
        };
        System.out.println(transformable1.modify("Java"));

        // 6. Распечатать строку в виде !строка!
        Printable printable = (str) -> System.out.println("!"+str+"!");
        printable.print("Java");

        // 7. Печатает "Hello World"
        Producable producable = () -> "Hello World";
        System.out.println(producable.produce());
    }
}
