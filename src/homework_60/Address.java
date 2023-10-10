package homework_60;

public class Address {
    String address;
    int houseNumber;

    public Address(String address, int houseNumber) {
        this.address = address;
        this.houseNumber = houseNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
