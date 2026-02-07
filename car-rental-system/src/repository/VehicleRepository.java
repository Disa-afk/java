package repository;

import domain.Vehicle;
import java.util.List;

public interface VehicleRepository {
    void add(Vehicle vehicle);
    Vehicle findById(int id);
    List<Vehicle> findAll();
    void remove(int id);
}
