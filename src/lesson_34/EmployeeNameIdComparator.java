package lesson_34;

import java.util.Comparator;

public class EmployeeNameIdComparator implements Comparator<Employee> {

    public int compare(Employee employee1, Employee employee2){
        return employee1.getName().equals(employee2.getName()) ? employee1.getName().compareTo(employee2.getName()): employee1.getId()-employee2.getId();
    }
}
