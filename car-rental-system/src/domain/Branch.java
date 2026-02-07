package domain;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private int id;
    private String address;
    private List<Vehicle> vehicles = new ArrayList<>();

    public Branch(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
