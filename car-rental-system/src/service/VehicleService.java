package service;

import domain.Vehicle;
import repository.VehicleRepository;

import java.util.List;

public class VehicleService {

    private final VehicleRepository repository;

    public VehicleService(VehicleRepository repository) {
        this.repository = repository;
    }

    public void addVehicle(Vehicle vehicle) {
        repository.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return repository.findAll();
    }
}
