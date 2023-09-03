package lesson_34;

public class SalesManager extends Employee{

    private double percentFromSales;

    private double salesVolume;

    public SalesManager(String name, String surname, int workedHours, double percentFromSales, double salesVolume) {
        super(name, surname, workedHours);
        this.percentFromSales = percentFromSales;
        this.salesVolume = salesVolume;
    }

    @Override
    public double salary() {
        double salary = salesVolume * (percentFromSales/100);
        if(salary<= getWorkedHours()* StateConstants.MIN_WAGE){
            salary = getWorkedHours()* StateConstants.MIN_WAGE;
        }
        return salary;
    }
    @Override
    public String toString() {
        return "Sales employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +

                        '}';
    }

}

