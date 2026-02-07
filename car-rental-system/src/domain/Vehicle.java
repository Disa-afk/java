package domain;

import domain.enums.VehicleStatus;

public abstract class Vehicle {

    private int id;
    private String brand;
    private String model;
    private String registrationNumber;
    private VehicleStatus status;

    public Vehicle(int id, String brand, String model, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.status = VehicleStatus.AVAILABLE;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }
}
