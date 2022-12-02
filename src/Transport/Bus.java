package Transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engine) {
        super(brand, model, engine);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус на пит-стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автобуса:...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса:...");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус закончил движение");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                "}";
    }
}
