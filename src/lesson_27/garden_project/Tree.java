package lesson_27.garden_project;

public class Tree  extends Plant{
    private static final int GROW_TREE = 5;
    public Tree(String name, int height, int age) {
        super(name, height, age);


    }
    public int getGrowPerSeason(){
        return GROW_TREE;
    }


    public void doSummer(){
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getName() +  " has grown in Summer. Height is  " + getHeight() +" cm");
    }
    public void doAutumn(){
        System.out.println(getName() + " is not growing in Autumn. Height is " + getHeight() + " cm");
    }





}
