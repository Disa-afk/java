package service;

import domain.*;
import repository.RentalRepository;
import strategy.PricingStrategy;

import java.time.LocalDate;

public class RentalService {

    private final RentalRepository repository;
    private final PricingStrategy pricingStrategy;

    public RentalService(RentalRepository repository,
                         PricingStrategy pricingStrategy) {
        this.repository = repository;
        this.pricingStrategy = pricingStrategy;
    }

    public Rental rentVehicle(int id,
                              Client client,
                              Vehicle vehicle,
                              Branch pickupBranch,
                              Branch returnBranch,
                              LocalDate start,
                              LocalDate end) {

        double price = pricingStrategy.calculatePrice(start, end);

        Rental rental = new Rental(
                id,
                client,
                vehicle,
                pickupBranch,
                returnBranch,
                start,
                end,
                price
        );

        repository.add(rental);
        client.addRental(rental);

        return rental;
    }
}
