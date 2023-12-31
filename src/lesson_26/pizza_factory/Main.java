package lesson_26.pizza_factory;

import java.util.Scanner;

public class Main {
    /*
    проект "Pizza Factory".
    Нужно создать фабрику по производству пиццы. Фабрика должна уметь готовить такие виды пиццы:
    Гавайи, Салями, Моцарелла. Каждый вид пиццы должен уметь:
    подготавдиваться( накладывать ингредиенты, и т.д)
    печься
    упаковываться

    в каждом случае должно быть а каком виде пиццы идет речь.
    В классе Main не должен создаваться новый объект пиццы, а из него должен поступать заказ на изготовление нужного
    вида пиццы в класс PizzaFactory, который должен выбрать нужную пиццу для изготовления

    Алгоритм реализации:

    1. Нужно создать родительский абстрактный класс Pizza и три дочерних класса.
    2. возможно не все методы родительского класса должны быть абстрактными, а только те, реализация которых в дочерних
    классах различна.
    3.Создать класс PizzaFactory в котором будет осуществляться создания нового объекта в зависимости от выбора заказчика.
    (Возможно, стоит использовать в этом случае Switch)
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose your pizza : 1. mozzarella 2. salami 3.hawaii ");
//        int x = scanner.nextInt();
//        PizzaFactory.makePizza(x);
/*
        PizzaFactory factory = new PizzaFactory();
        Pizza salami = factory.createPizza("1");
        salami.orderPizza();

        System.out.println();

        Pizza mozzarella = factory.createPizza("2");
        mozzarella.orderPizza();

        System.out.println();


        Pizza hawaii = factory.createPizza("3");
        hawaii.orderPizza();
*/

        do {
            System.out.println("Choose your pizza : 1. mozzarella 2. salami 3.hawaii ");
            String pizzaChoice = scanner.nextLine();
            PizzaFactory.makePizza(pizzaChoice);
//            while (pizzaChoice == null){
//                System.out.println("Wrong choice . try one more time");
//                pizzaChoice = scanner.nextLine();
//                PizzaFactory.makePizza(pizzaChoice);
//            }

        } while (!scanner.nextLine().equalsIgnoreCase("no"));












    }










}
