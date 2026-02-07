package domain;

import domain.enums.RentalStatus;

import java.time.LocalDate;

public class Rental {

    private int id;
    private Client client;
    private Vehicle vehicle;

    private Branch pickupBranch;
    private Branch returnBranch;

    private LocalDate startDate;
    private LocalDate endDate;
    private double totalPrice;
    private RentalStatus status;

    public Rental(int id,
                  Client client,
                  Vehicle vehicle,
                  Branch pickupBranch,
                  Branch returnBranch,
                  LocalDate startDate,
                  LocalDate endDate,
                  double totalPrice) {

        this.id = id;
        this.client = client;
        this.vehicle = vehicle;
        this.pickupBranch = pickupBranch;
        this.returnBranch = returnBranch;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalPrice = totalPrice;
        this.status = RentalStatus.ACTIVE;
    }

    public int getId() {
        return id;
    }

    public Branch getPickupBranch() {
        return pickupBranch;
    }

    public Branch getReturnBranch() {
        return returnBranch;
    }

    public RentalStatus getStatus() {
        return status;
    }

    public void complete() {
        this.status = RentalStatus.COMPLETED;
    }
}
