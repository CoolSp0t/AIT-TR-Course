package lesson_56;

import lesson_52.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSerialization {
    /*
    Сериализация - превращение объекта в поток байтов для записи в файл, передаче по сети, записи в базу данных

    десериализация - наоборот, восстановление объекта из потока байтов
    Сериализовать можно объекты класса, реализующего интерфейса Serializable. Этот интерфейс не определяет никаких методов, а служит маркером(указателем) что объект может
    быть сериализован

    для сериализации используется класс ObjectOutputStream
    конструктор ObjectOutputStream(OutputStream output)
    void writeObject(Object object)
     */
    public static void main(String[] args) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.txt"))){
            Employee employee = new Employee("John", 35,5000.0,true);
            outputStream.writeObject(employee);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        /*
        Для десериализации используется класс ObjectInputStream
        ObjectInputStream(InputStream input)
        Object readObject()
         */
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.txt"))){
            Employee employee = (Employee) inputStream.readObject();
            System.out.println("name "  + employee.name + " age " + employee.age + " salary " + employee.salary + " manager " + employee.isManager);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50,2000.0,false));
        employees.add(new Employee("Ann", 25,5000.0,true));

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.txt"))){
            outputStream.writeObject(employees);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // десериализация
        List<Employee> employeesList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.txt"))){
            employeesList = (ArrayList<Employee>) inputStream.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        for(Employee employee : employeesList){
            System.out.println(employee.name);
            System.out.println(employee.age);
            System.out.println(employee.salary);
            
        }
    }

}
