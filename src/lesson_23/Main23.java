package lesson_23;

public class Main23 {
    public static void main(String[] args) {
        Bus bus = new Bus("Sprinter", 20);
        System.out.println(bus.toString());

        BusDriver driver = new BusDriver("Bob", 35);

        System.out.println(driver.toString());

//        System.out.println(bus.toString());

        BusDriver driver1 = new BusDriver("John" , 28);
        Bus bus1 = new Bus("Vito" , 12 ,driver1);
        bus.setDriver(driver1);
        bus1.setDriver(driver);
        System.out.println(bus.toString());
        System.out.println(bus1.toString());

        bus.moveByDriver();
        bus1.moveByDriver();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println(bus.getAutoPilotInfo());

        System.out.println();
        System.out.println("-----------------------------");
        bus.moveByAutopilot();
        bus.moveByDriver();


        System.out.println("Homework23");
        driver.addCategories1("D");
        driver.addCategories1("A");
        driver.addCategories1("asd");
        driver.addCategories1("dggg");
        driver.addCategories1("dasd");
        driver.addCategories1("llm");
        System.out.println(driver.toString());
//        System.out.println(driver.removeCategory("D"));
        System.out.println(driver.toString());
//        driver.removeAllCategories();
        System.out.println(driver.toString());


        System.out.println("--------------------------");
        driver.testArrayCopy(2);










    }
}
