package Transport;

public class Car extends Transport implements Competing {

    private BodyType bodyType;
    public Car(String brand, String model, double engine, BodyType bodyType) {
        super(brand, model, engine);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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


    public void printType(){
        if (bodyType == null){
            System.out.println("Данных недостаточно");
        }else{
            System.out.println("Тип авто: " + bodyType);
        }
    }

    @Override
    public boolean toFixTheCar() {
        return Math.random() > 0.7;
    }

    @Override
    public void toPerformMaintenance() {
        System.out.println("Машина " + getModel()+ "починена");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() +
                '}';
    }
}
