package lesson_27.hw_lesson_27.task_2;

public class Component {
    protected String brand;
    protected String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getInfo() {
        return brand + " " + model;
    }
}
