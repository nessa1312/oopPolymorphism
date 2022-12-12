package Transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, double engine) {
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.engineVolume = engine;
    }
    public void addDriver (Driver<?> driver){
        drivers.add(driver);
    }
    public void addMechanic (Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }
    public void addSponsor (Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngine() {
        return engineVolume;
    }
    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void printType();

    public boolean toFixTheCar() {
        return false;
    }

    public void toPerformMaintenance() {
    }
}
