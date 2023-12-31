package lesson_34;

import java.util.Arrays;

public class AccountingMain {

    /*
    Написать программу для бухгалтерии
    Программа должна уметь :
    - добавлять сотрудников в штат
    - удалять сотрудников из штата
    - рассчитывать зарплату для двух категорий сотрудников
            - сотрудник с почасовой оплатой
            - менеджер по продажам
    У программы должны быть следующие классы:
    - Company, в котором содержатся методы для добаления сотрудника, удаления сотрудника, вывода на экран всех сотрудников
      и метод для суммирования зарплат всех сотрудников
    - классы сотрудников:
        - abstract Employee
        - WageEmployee
        - SalesManager
    У сотрудников должны быть поля: id, имя , фамилия , количество проработанных часов. Также должен быть метод
    подсчета зарплаты
    У сотрудника на почасовой оплате должно быть ставка за час. Метод расчета его зарплаты должен учитывать минимальный
    размер оплаты труда
    У менеджера по продажам нет фиксированной оплаты, его запралата рассчитывается как процент от объема продаж.
    Но его метод тоже должен учитывать минимальный размер оплаты труда.

    Дополнительно:
    Программа также должна содержать методы, предоставляющие возможность сортировки списка сотрудников
    по следующим критериям:
    - по фамилии
    - по id
    - по имени, а если имени одинаковые, то по id


     */

    public static void main(String[] args) {
        Employee employee = new WageEmployee("Walter", "White", 40, 15);
        Employee employee1 = new SalesManager("Walter", "Black", 40, 5, 100000);
        Company company = new Company(100);
        System.out.println(employee.toString());
        System.out.println(employee1.toString());
        company.addEmployee(employee);
        company.addEmployee(employee1);
        company.allEmployees();
        System.out.println(company.allSalary());

        System.out.println("----------------------------");


        Employee[] employees = {employee, employee1};
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));




        Arrays.sort(employees , new EmployeeIdComparator());
        System.out.println(Arrays.toString(employees));



        Arrays.sort(employees, new EmployeeNameIdComparator());
        System.out.println(Arrays.toString(employees));

        company.removeEmployee(employee);
        company.allEmployees();


        company.sortEmployees();
        company.allEmployees();












    }
}
