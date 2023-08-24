package lesson_27.garden_project;

public class Flower extends Plant {

    private static final int GROW_FLOWER = 2;
    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    public int getGrowPerSeason(){
        return GROW_FLOWER;
    }

    public void doSummer(){
        System.out.println(getName() + " blooms. Height is " +  getHeight() + " cm");
    }

    public void doAutumn(){
        setHeight(0);
        System.out.println(getName() + " is cut. Height is " + getHeight() + " cm");
    }
}
