package repository.impl;

import domain.Rental;
import repository.RentalRepository;

import java.util.*;

public class InMemoryRentalRepository implements RentalRepository {

    private final Map<Integer, Rental> storage = new HashMap<>();

    public void add(Rental rental) {
        storage.put(rental.getId(), rental);
    }

    public Rental findById(int id) {
        return storage.get(id);
    }

    public List<Rental> findAll() {
        return new ArrayList<>(storage.values());
    }
}
