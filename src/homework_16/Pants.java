package homework_16;

public class Pants {
    String size;
    String color;
    String type;

    public Pants(){

    }

    public Pants(String size){
        this.size = size;
    }

    public Pants(String size, String color){
        this.size =size;
        this.color = color;
    }

    public Pants(String size, String color, String type){
        this.size = size;
        this.color = color;
        this.type = type;
    }

    void inTheCloset(){
        System.out.println("Pants are in the closet");
    }

    void areWashed(){
        System.out.println("Pants are washed");
    }


}
