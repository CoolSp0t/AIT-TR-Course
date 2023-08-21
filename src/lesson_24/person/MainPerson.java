package lesson_24.person;

public class MainPerson {
    public static void main(String[] args) {
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        ProAthlete proAthlete = new ProAthlete();
        Person person = new Person();

        Person[] people = new Person[3];
        people[0] = amateurAthlete;
        people[1] = proAthlete;
        people[2] = person;

        for(Person persons: people){
            persons.running();
        }



    }
}
