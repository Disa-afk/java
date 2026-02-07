package repository.impl;

import domain.Vehicle;
import repository.VehicleRepository;

import java.util.*;

public class InMemoryVehicleRepository implements VehicleRepository {

    private final Map<Integer, Vehicle> storage = new HashMap<>();

    public void add(Vehicle vehicle) {
        storage.put(vehicle.getId(), vehicle);
    }

    public Vehicle findById(int id) {
        return storage.get(id);
    }

    public List<Vehicle> findAll() {
        return new ArrayList<>(storage.values());
    }

    public void remove(int id) {
        storage.remove(id);
    }
}
