package Transport;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engine, Capacity capacity) {
        super(brand, model, engine);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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

    public void printType(){
        if (capacity == null){
            System.out.println("Данных недостаточно");
        }else{
            System.out.println("Вместимость от " + capacity.getFrom() + " до " + capacity.getTo());
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                "}";


    }
}
