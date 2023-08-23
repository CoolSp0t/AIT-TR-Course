package lesson_26.pizza_factory;

public class PizzaFactory {

    public static void makePizza(String str){


        switch (str){
            case "1": {
                Pizza mozzarella = new Mozzarella();
                mozzarella.orderPizza();
                break;
            }
            case "2":{
                Pizza salami = new Salami();
                salami.orderPizza();
                break;
            }
            case "3":{
                Pizza hawaii = new Hawaii();
                hawaii.orderPizza();
                break;
            }
            default:{
                System.out.println("Wrong pizza");
            }
        }

    }

    public Pizza createPizza(String type){   // var 2
        switch(type){
            case "1": return new Salami();
            case "2": return new Mozzarella();
            case "3": return new Hawaii();
            default: return null;

            }
        }









}
