package domain;

public class Car extends Vehicle {

    private String carClass;

    public Car(int id, String brand, String model,
               String registrationNumber, String carClass) {
        super(id, brand, model, registrationNumber);
        this.carClass = carClass;
    }

    public String getCarClass() {
        return carClass;
    }
}
