package lesson_26.pizza_factory;

public class Hawaii extends Pizza {
    private static String TYPE = "Pizza Hawaii";
    public Hawaii() {
        super(TYPE);
    }

    protected void prepare(){
        System.out.println("Preparing pizza with pineapple");
    }
}
