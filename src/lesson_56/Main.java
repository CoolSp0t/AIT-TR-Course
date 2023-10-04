package lesson_56;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John",20,201,"Street1,Berlin","Engineer");
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.ser"));
            outputStream.writeObject(student);
            outputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        Student johnDeserialized  = null;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.ser"));
            johnDeserialized = (Student) inputStream.readObject();
            inputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
            return;
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("name " + johnDeserialized.getName());
        System.out.println("age " + johnDeserialized.getAge() );
        System.out.println("regNum " + johnDeserialized.getRegNumber());
        System.out.println("address " +  johnDeserialized.getAddress());
        System.out.println("previous education " +johnDeserialized.getPreviousEducation());
    }
}


//NIO.2