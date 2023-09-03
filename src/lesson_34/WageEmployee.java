package lesson_34;

public class WageEmployee extends Employee{
    private double salaryPerHour;

    public WageEmployee(String name, String surname, int workedHours, int salaryPerHour) {
        super(name, surname, workedHours);
        this.salaryPerHour = salaryPerHour;
    }



    @Override
    public double salary() {
        double salary = getWorkedHours()*salaryPerHour;

        if(salary <= getWorkedHours()*StateConstants.MIN_WAGE){
            salary = getWorkedHours() * StateConstants.MIN_WAGE;
        }
         return salary;
    }


    @Override
    public String toString() {
        return "Wage employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", workedHours=" + getWorkedHours() +
                '}';
    }


}

