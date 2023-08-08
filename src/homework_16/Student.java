package homework_16;

public class Student {
    String name;
    String university;
    String group;

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }


    public Student(String name, String university){
        this.name = name;
        this.university = university;
    }

    public Student(String name, String university , String group){
        this.name = name;
        this.university = university;
        this.group = group;
    }

}
