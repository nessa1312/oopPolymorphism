import Transport.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", " Vesta ", 1.7);
        Car audi = new Car("Audi", " A5 ", 3.0);
        Car bmw = new Car("BMW", " X5 ", 2.5);
        Car kia = new Car("KIA", " Rio X ", 1.6);

        Truck kamaz = new Truck("Kamaz", " A1 ", 4.0);
        Truck kamaz1 = new Truck("Kamaz", " B2 ", 4.5);
        Truck volvo = new Truck("Volvo", " C3 ", 5.0);
        Truck reno = new Truck("Reno", " D4 ", 5.5);

        Bus busOne = new Bus("busOne", " A1 ", 3.0);
        Bus busTwo = new Bus("busTwo", " A2 ", 2.0);
        Bus busThree = new Bus("busThree", " A3 ", 2.4);
        Bus busFour = new Bus("busFour", " A4 ", 2.5);

        lada.startMoving();
        lada.maxSpeed();
        lada.bestLapTime();
        lada.pitStop();
        lada.endMoving();

        audi.startMoving();
        audi.maxSpeed();
        audi.bestLapTime();
        audi.pitStop();
        audi.endMoving();

        bmw.startMoving();
        bmw.maxSpeed();
        bmw.bestLapTime();
        bmw.pitStop();
        bmw.endMoving();

        kia.startMoving();
        kia.maxSpeed();
        kia.bestLapTime();
        kia.pitStop();
        kia.endMoving();

        kamaz.startMoving();
        kamaz.maxSpeed();
        kamaz.bestLapTime();
        kamaz.pitStop();
        kamaz.endMoving();

        kamaz1.startMoving();
        kamaz1.maxSpeed();
        kamaz1.bestLapTime();
        kamaz1.pitStop();
        kamaz1.endMoving();

        volvo.startMoving();
        volvo.maxSpeed();
        volvo.bestLapTime();
        volvo.pitStop();
        volvo.endMoving();

        reno.startMoving();
        reno.maxSpeed();
        reno.bestLapTime();
        reno.pitStop();
        reno.endMoving();

        busOne.startMoving();
        busOne.maxSpeed();
        busOne.bestLapTime();
        busOne.pitStop();
        busOne.endMoving();

        busTwo.startMoving();
        busTwo.maxSpeed();
        busTwo.bestLapTime();
        busTwo.pitStop();
        busTwo.endMoving();

        busThree.startMoving();
        busThree.maxSpeed();
        busThree.bestLapTime();
        busThree.pitStop();
        busThree.endMoving();

        busFour.startMoving();
        busFour.maxSpeed();
        busFour.bestLapTime();
        busFour.pitStop();
        busFour.endMoving();

        DriverB carDriverB = new DriverB("Александр",4, audi);
        DriverD busDriverD = new DriverD("Алексей", 10, busThree);
        DriverC truckDriverC = new DriverC("Артур", 11, kamaz1);

        System.out.println(carDriverB);
        System.out.println(busDriverD);
        System.out.println(truckDriverC);
    }
}