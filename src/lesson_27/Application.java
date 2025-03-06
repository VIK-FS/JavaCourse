package lesson_27;

public class Application {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("John", "LN-21212122121");
        Autobus bus = new Autobus(busDriver, 15);
        System.out.println(bus.toString());

        BusDriver busDriver1 = new BusDriver("Margo", "AR-656464646");
        bus.setDriver(busDriver1);

        System.out.println(bus.toString());

        bus.showListPassengers();

        System.out.println("\n==================");


        Passenger john = new Passenger("Lohn");
        Passenger mario = new Passenger("Mario");
        Passenger jane = new Passenger("Jane");

        System.out.println(john.toString());
        System.out.println(mario.toString());

        bus.takePassenger(john);
        bus.takePassenger(john);
//
        bus.takePassenger(mario);
//
        bus.takePassenger(jane);
        bus.takePassenger(jane);

        // вызываем метод dropPassenger
        bus.dropPassenger(jane);
//
        System.out.println("Количество: "+ bus.getCountPassengers());

        bus.showListPassengers();
    }
}
