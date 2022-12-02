package Transport;

public class Truck extends Transport implements Competing {

    private Weight weight;

    public Truck(String brand, String model, double engine, Weight weight) {
        super(brand, model, engine);
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик на пит-стопе");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузовика:...");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика:...");
    }

    @Override
    public void endMoving() {
        System.out.println("Грузовик закончил движение");
    }

    public void printType(){
        if (weight == null){
            System.out.println("Данных недостаточно");
        }else{
            String from = weight.getFrom() == null?"":"от"+weight.getFrom() + " ";
            String to = weight.getTo() == null?"":"до"+weight.getTo();
            System.out.println("Грузоподъемность: " + from + to);
        }
    }

    @Override
    public String toString() {
        return "Track{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
