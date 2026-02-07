package repository;

import domain.Rental;
import java.util.List;

public interface RentalRepository {
    void add(Rental rental);
    Rental findById(int id);
    List<Rental> findAll();
}
