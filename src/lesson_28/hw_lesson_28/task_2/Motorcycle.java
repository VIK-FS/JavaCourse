package lesson_28.hw_lesson_28.task_2;

public class Motorcycle extends Vehicle {

    public Motorcycle(String model) {
        super(model);
    }

    @Override
    public void startEngine(){
        System.out.printf("Двигатель у '%s' запустился.\n", getModel());
    }
}
