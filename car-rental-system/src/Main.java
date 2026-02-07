import domain.*;
import repository.impl.*;
import service.*;
import strategy.*;

import java.time.LocalDate;

public static void main(String[] args) {

    VehicleService vehicleService =
            new VehicleService(new InMemoryVehicleRepository());

    ClientService clientService =
            new ClientService(new InMemoryClientRepository());

    RentalService rentalService =
            new RentalService(
                    new InMemoryRentalRepository(),
                    new DailyPricingStrategy()
            );

    Branch branchA = new Branch(1, "Astana, Astana IT University");
    Branch branchB = new Branch(2, "Almaty, Arbat");

    Car car = new Car(1, "Toyota", "Camry", "777ABC", "Business");
    branchA.addVehicle(car);
    vehicleService.addVehicle(car);

    Client client = new Client(1, "Dias", "DL123456");
    clientService.addClient(client);

    rentalService.rentVehicle(
            1,
            client,
            car,
            branchA,
            branchB,
            LocalDate.now(),
            LocalDate.now().plusDays(3)
    );

    System.out.println("Rental created with pickup and return branches.");
}
