package homework_22.task2;

public class Drink {
    private String name;
    private String color;
    private boolean isHaveDrinkAlcohol;
    private int mlInBottle;

    public Drink(String name,String color , int mlInBottle, boolean isHaveDrinkAlcohol) {
        this.name = name;
        this.color = color;
        this.mlInBottle = mlInBottle;
        this.isHaveDrinkAlcohol = isHaveDrinkAlcohol;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHaveDrinkAlcohol() {
        return isHaveDrinkAlcohol;
    }

    public void setHaveDrinkAlcohol(boolean haveDrinkAlcohol) {
        isHaveDrinkAlcohol = haveDrinkAlcohol;
    }

    public int getMlInBottle() {
        return mlInBottle;
    }

    public void setMlInBottle(int mlInBottle) {
        this.mlInBottle = mlInBottle;
    }

    public String toString() {
        return "{" + " name " + name + " ml in bottle " + mlInBottle + "}";
    }


}



