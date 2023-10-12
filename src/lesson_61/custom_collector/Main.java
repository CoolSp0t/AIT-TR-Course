package lesson_61.custom_collector;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {
    /*
    Пусть есть класс Employee c переменными String name и int salary.
    Нужно написать свой коллектор, считающий суммарную зарплату всех сотрудников
     */
    public static void main(String[] args) {
        Employee e1 =new Employee("John",1500);
        Employee e2 =new Employee("Helen",1800);
        Employee e3 =new Employee("Jack",2100);
        Employee e4 =new Employee("Ann",2400);
        Supplier<Box> supp = () -> {
            System.out.println("Supplying starting value");
            return new Box(0);
        };

        BiConsumer<Box,Employee> accumulator = (result, employee)-> {
            result.setValue(result.getValue()+ employee.getSalary());
            System.out.println(result.getValue()+ " " + employee.getName());
        };

        BinaryOperator<Box> combiner = (res1, res2)-> {
            System.out.println("combining results");
            res1.setValue(res1.getValue()+ res2.getValue());
            return res1;
        };
        // T, A, R
        Collector<Employee,Box,Box> salaryCollector =Collector.of(supp,accumulator,combiner);
        Box box = Stream.of(e1,e2,e3,e4).parallel().collect(salaryCollector);
        System.out.println("Total salary " +box);
    }
}
