package lesson_34;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {


    public int compare(Employee employee1, Employee employee2){
        return employee1.getId()-employee2.getId();
    }
}
