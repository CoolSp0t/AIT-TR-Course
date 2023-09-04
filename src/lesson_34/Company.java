package lesson_34;

import java.util.Arrays;
import java.util.Comparator;

public class Company {
    
    private Employee[] employees;
    private int companySize ;

    public Company(int capacity) {
        employees = new Employee[capacity];
        this.companySize = 0;
    }


    public boolean addEmployee(Employee employee){
        if(companySize < employees.length){
            employees[companySize] = employee;
            companySize++;
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee employee){
        for (int i = 0; i < companySize; i++) {
            if(employees[i].equals(employee)){
                employees[i] = employees[companySize-1];
                companySize--;
                return true;
            }
        }
        return false;
    }
    public void allEmployees(){
        for (int i = 0; i < companySize; i++) {
            System.out.println(employees[i]);
        }
    }

    public double allSalary(){
        double result = 0;
        for (int i = 0; i < companySize; i++) {
            result += employees[i].salary();
        }
        return result;
    }


    public void sortEmployees(){
//        Employee[] sortedEmployees = new Employee[companySize]; // var1
//        for (int i = 0; i < companySize; i++) {
//            sortedEmployees[i] = employees[i];
//        }
//        Arrays.sort(sortedEmployees);
        Arrays.sort(employees, 0,companySize); // var 2
    }

    public void sortEmployeesById(){
        Arrays.sort(employees,0, companySize, new EmployeeIdComparator());
    }

    public void sortEmployeesByNameThenId(){
        Arrays.sort(employees,0,companySize,new EmployeeNameIdComparator());
    }

    public void sortEmployeesByIdAnonym(){
        Arrays.sort(employees, 0, companySize, new Comparator<Employee>() {
            public int compare(Employee employee1, Employee employee2){
                return employee1.getId()-employee2.getId();
            }
        });
    }




}
