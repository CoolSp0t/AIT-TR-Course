package lesson_61.practice;

public class BankAccount {
    String IBAN;
    Person1 owner;

    public BankAccount(String IBAN, Person1 owner) {
        this.IBAN = IBAN;
        this.owner = owner;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Person1 getOwner() {
        return owner;
    }

}
