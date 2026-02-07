package domain;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;
    private String name;
    private String driverLicenseNumber;
    private List<Rental> rentals = new ArrayList<>();

    public Client(int id, String name, String driverLicenseNumber) {
        this.id = id;
        this.name = name;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }
}
