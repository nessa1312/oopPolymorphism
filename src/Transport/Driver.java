package Transport;

public abstract class Driver <T extends Transport> {
    private final String fullName;
    private String category;
    private final int drivingExperience;
    private final T car;

    public Driver(String fullName, String category, int drivingExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }
    public String getFullName() {
        return fullName;
    }
    public String getCategory() {
        return category;
    }
    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void startDriving() {
        System.out.printf("Водитель %s начал двигаться", this.fullName);
        this.car.startMoving();
    }
    public void finishDriving() {
        System.out.printf("Водитель %s закончил движение", this.fullName);
        this.car.endMoving();
    }
    public void refill() {
        System.out.printf("Водитель %s заправляет  %s %s",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }

    @Override
    public String toString() {
        return String.format(
                "Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
                this.fullName, this.car.getBrand(), this.car.getModel());

    }
}


