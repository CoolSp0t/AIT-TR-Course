package lesson_50.type_conversion;

public class Main {
    /*
    Type conversion (преобразование типов)


    Преобразование совместных типов
    Автоматическое преобразование типов возможно при соблюдении двух условий:
    1. Эти типы совместимы
    2. Тип, в который происходит преобразование больше чем тип из которого происходит преобразование
        Пример: преобразование из типа byte в тип int
       Такое преобразование называется разширающим (widening)
     */
    public static void main(String[] args) {
        int i = 10;
        float f;
        f = i; // присвоение значения переменной целого типа переменной типа float
        System.out.println(f);

        Long lLong = 101230056L;
        double dDouble;
        dDouble = lLong;
        System.out.println(dDouble);


        dDouble = 100123456.0;
//        lLong = dDouble;


        /*
        Преобразование несовместимых типов (casting)

        (target-type)  expression
         */
        double x, y;
        x = 100.23;
        y = 200.56;
        int res = (int) (x/y);

        System.out.println("res = " + res);

        int j = 100;
        byte b = (byte) j; // потеря информации не происходит, т.к. byte может хранить число 100
        System.out.println("j = 100, b = " + b);



        j = 300;
      b = (byte) j;  // потеря информации происходит, т.к. 300 в байт уже не влезает
        System.out.println("j = 300, b = " + b);

        b = 89;
        char ch = (char) b; // ASCII код для Y
        System.out.println("ch = " +ch);



        // текстовый блок( с 15 джава) """ """
        /*
        String str = """
                    aaaaaaaaa
                    bbbbbbbbb
                    .cccccccc
                    "cccccccccccccc!"
                    """;
         */


        // var in Java
        /*
        в случае использования var, компилятор присваивает тип переменной по типу начального значения, которое обязательно должно быть

         */
        var a = 25; // var будет заменено конкретным типом (int)

//      a = "wert";

        double average = 10.5;

        var average1 = 10.5;

        int var = 25; // просто имя переменной
        var x1 = -var;

        System.out.println(x1);

        var ourArray = new int[10];

        // через var можно обьявить только локальные переменные(поля класса, параметры метода, тип возвращаемого метода, значения нельзя)


        var string ="Hello java";

        var subStr = string.substring(1,4);
        var OurClass = new OurClass();

        // var fileInputStream = new FileInputStream("in.txt")
        for (var k = 0; k < 5 ; k++);
        for ( var v : ourArray);

        // еще ограничение в использовании var:
//        var anotherVar = null; - так инициализировать нельзя

//        var arr = {1,2,3}; - так тоже нельзя

        // нельзя так же использовать в качестве имени класса, интерфейса и т.д., начального значения в лямбда выражениях

        }

    }


