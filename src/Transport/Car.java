package Transport;

public class Car extends Transport implements Competing {
    public Car(String brand, String model, double engine) {
        super(brand, model, engine);
    }

    @Override
    public void startMoving() {
        System.out.println("Легковый автомобиль начал движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Легковый автомобиль на пит-стопе");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга легкового автомобиля:...");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля:...");
    }

    @Override
    public void endMoving() {
        System.out.println("Легковый автомобиль закончил движение");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() +
                '}';
    }
}
