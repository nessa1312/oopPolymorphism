import Transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", " Vesta ", 1.7, BodyType.SEDAN);
        Car audi = new Car("Audi", " A5 ", 3.0, BodyType.COUPE);
        Car bmw = new Car("BMW", " X5 ", 2.5, BodyType.CROSSOVER);
        Car kia = new Car("KIA", " Rio X ", 1.6, BodyType.HATCHBACK);

        Truck kamaz = new Truck("Kamaz", " A1 ", 4.0, Weight.N3);
        Truck kamaz1 = new Truck("Kamaz", " B2 ", 4.5, Weight.N2);
        Truck volvo = new Truck("Volvo", " C3 ", 5.0, Weight.N3);
        Truck reno = new Truck("Reno", " D4 ", 5.5, Weight.N1);

        Bus busOne = new Bus("busOne", " A1 ", 3.0, Capacity.MEDIUM);
        Bus busTwo = new Bus("busTwo", " A2 ", 2.0, Capacity.LARGE);
        Bus busThree = new Bus("busThree", " A3 ", 2.4, Capacity.EXTRA_SMALL);
        Bus busFour = new Bus("busFour", " A4 ", 2.5, Capacity.EXTRA_LARGE);

        DriverD busDriverD = new DriverD("Алексей", 10, busThree);
        DriverC truckDriverC = new DriverC("Артур", 11, kamaz1);
        DriverB carDriverB = new DriverB("Михаил",6, audi);

        ArrayList<Transport> allTransports = new ArrayList<>();
        allTransports.add(lada);
        allTransports.add(audi);
        allTransports.add(bmw);
        allTransports.add(kia);
        allTransports.add(kamaz);
        allTransports.add(volvo);
        allTransports.add(busOne);
        allTransports.add(busTwo);
        allTransports.add(busThree);
        allTransports.add(busFour);

        Mechanic mechanicOne = new Mechanic("Механик 1", "Копания 1", TransportType.CAR);
        Mechanic mechanicTwo = new Mechanic("Механик 2", "Копания 1", TransportType.BUS);
        Mechanic mechanicThree =new Mechanic("Механик 3", "Копания 1", TransportType.TRUCK);
        Mechanic mechanicFour =new Mechanic("Механик 4", "Копания 2", TransportType.CAR);
        Mechanic mechanicFife =new Mechanic("Механик 5", "Копания 2", TransportType.TRUCK);
        Mechanic mechanicSix = new Mechanic("Механик 6", "Копания 3", TransportType.BUS);
        Mechanic mechanicSeven =new Mechanic("Механик 7", "Копания 3", TransportType.CAR);
        Mechanic mechanicEight =new Mechanic("Механик 8", "Копания 4", TransportType.BUS);

        lada.getMechanicList().add(mechanicOne);
        lada.getMechanicList().add(mechanicTwo);
        lada.getMechanicList().add(mechanicThree);
        bmw.getMechanicList().add(mechanicThree);
        bmw.getMechanicList().add(mechanicFour);
        bmw.getMechanicList().add(mechanicFife);
        bmw.getMechanicList().add(mechanicSix);
        volvo.getMechanicList().add(mechanicSeven);
        volvo.getMechanicList().add(mechanicEight);

        Sponsor sponsorOne = new Sponsor("Спонсор 1", 5_000_000);
        Sponsor sponsorTwo = new Sponsor("Спонсор 2", 6_000_000);
        Sponsor sponsorThree = new Sponsor("Спонсор 3", 7_000_000);
        Sponsor sponsorFour = new Sponsor("Спонсор 4", 8_000_000);
        Sponsor sponsorFife = new Sponsor("Спонсор 5", 9_000_000);
        Sponsor sponsorSix = new Sponsor("Спонсор 6", 10_000_000);

        lada.getSponsorList().add(sponsorOne);
        lada.getSponsorList().add(sponsorTwo);
        bmw.getSponsorList().add(sponsorThree);
        volvo.getSponsorList().add(sponsorFour);
        kia.getSponsorList().add(sponsorFife);
        kamaz.getSponsorList().add(sponsorSix);

        for (Transport car :allTransports) {
            if (car.getMechanicList().size() != 0) {
                System.out.println(car.getMechanicList());
            }
            if (car.getSponsorList().size() != 0) {
                System.out.println(car.getSponsorList());
            }
        }

        ServiceStation<Transport> transportServiceStation = new ServiceStation<Transport>();
        transportServiceStation.addTransport(audi);
        transportServiceStation.addTransport(volvo);
        transportServiceStation.addTransport(kamaz);
        transportServiceStation.addTransport(busOne);
        transportServiceStation.addTransport(bmw);

        transportServiceStation.maintenance();
    }
}


