package lesson_34;

public abstract class Employee implements Comparable<Employee> {
    private final int id;

    static int counter;
    private String name;
    private String surname;

    private  int workedHours;





    public Employee(String name, String surname, int workedHours) {
        this.id = counter++;
        this.name = name;
        this.surname = surname;
        this.workedHours = workedHours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public abstract double salary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workedHours=" + workedHours +
                '}';
    }


    public int compareTo(Employee e){
        return getSurname().compareTo(e.getSurname());
    }
}
