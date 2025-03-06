package lesson_28.hw_lesson_28.task_2;

public class MainApp {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("Tesla Model S"),
                new Bicycle("Giant XTC"),
                new Motorcycle("Harley-Davidson")
        };

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
            System.out.println("==============================");
        }


//        for (Vehicle vehicle : vehicles){
//            vehicle.startEngine();
//            System.out.println("==============================");
//        }
    }
}
