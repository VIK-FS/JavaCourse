package lesson_28.hw_lesson_28.task_2;

public class Bicycle extends Vehicle{

    public Bicycle(String model) {
        super(model);
    }

    @Override
    public void startEngine() {
        System.out.printf("У велосипеда '%s' нет двигателя!\n", getModel());
    }
}
