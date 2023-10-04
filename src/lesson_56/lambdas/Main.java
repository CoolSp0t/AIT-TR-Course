package lesson_56.lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    // Lambda - expressions
    /*
    Лямбда выражения используются для реализации метода функционального интерфейса.
    Функциональным интерфейсом является, имеющий один абстрактный метод.

    (argument list) -> {body}
    () -> {body}
    (par) -> {body}
    (par1,par2,par3) -> {body}
     */
    public static void main(String[] args) {
        int height =1000;
        Flyable f = new Flyable(){

            public void fly() {
                System.out.println("Flying at "  + height  );
            }
        };
        f.fly();



        // реализация через лямбда выражение
        Flyable fLambda = () -> {
            System.out.println("Flying at" +height);
        };
        fLambda.fly();

        Walkable w = () -> {
            return "I can walk";
        };
        System.out.println(w.walk());

        Eatable e = (food) -> {
            return "A man can eat " +food;
        };
        System.out.println(e.eat("apple"));

        Summable s = (i, m) -> {
            return  i + m;
        };
        System.out.println(s.sum(1, 2));

        // короткая форма записи - lambda expression
        Summable s1 = (x,y ) -> x + y;
        System.out.println(s1.sum(2, 3));

        Eatable eShort = food -> "A man can eat " + food;
        System.out.println(eShort.eat("apple"));

        Summable sMinus = (x ,y) -> x-y;
        System.out.println("for sMinus result is " +sMinus.sum(2,3));

        List<String> fruits = new ArrayList<>();
        fruits.add("lemon");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.forEach(fruit -> System.out.println(fruit));

        List<Product> items = new ArrayList<>();
        items.add(new Product("Mouse",25));
        items.add(new Product("Laptop",1000));
        items.add(new Product("Keyboard",75));
        Collections.sort(items, (p1,p2) -> p1.name.compareTo(p2.name));
        System.out.println(items);

        Collections.sort(items,(p1,p2)-> p1.price - p2.price);
        System.out.println(items);

        Operationable<Integer> o = (a,b)-> a+b;
        System.out.println(o.calc(1,2));

        Operationable<String> o2 =(a,b) -> a+b;
        System.out.println(o2.calc("1", "2"));

        // Лямбда в качестве параметра метода
        /*
        Лямбда выражения можно передавать в качестве параметра в метод
         */

        int[] numbers = {1,2,3,4,5,6,7};
        IsMoreThan isMoreThan = num -> num >3;
        System.out.println(isMoreThan.isMore(2));
        System.out.println(isMoreThan.isMore(5));

//        isMoreThan = num-> num > 10;
//        System.out.println(isMoreThan.isMore(9));
//        System.out.println(isMoreThan.isMore(50));

        sumIfCondition(numbers,isMoreThan);
    }
    public static int sumIfCondition(int[] ints, IsMoreThan expression){
        int sum = 0;
        for( int elt : ints){
            if(expression.isMore(elt)){
                sum += elt;
            }
        }
        return sum;
    }
}
