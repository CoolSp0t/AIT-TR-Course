package lesson_26.pizza_factory;

public class PizzaFactory {

    public static void makePizza(int x){

        switch (x){
            case 1: {
                Pizza mozzarella = new Mozzarella();
                mozzarella.orderPizza();
                break;
            }
            case 2:{
                Pizza salami = new Salami();
                salami.orderPizza();
                break;
            }
            case 3:{
                Pizza hawaii = new Hawaii();
                hawaii.orderPizza();
                break;
            }
        }

    }
}
