package lesson_26.hw_lesson_26.task_02;

public class HalogenLamp extends Lighting {
    private double temperature;

    public HalogenLamp(String name, String colorLight, double temperature) {
        super(name, colorLight);
        this.temperature = temperature;
    }

    public void displayTemperature() {
        System.out.printf("Температура спирали: %.1f °C\n", temperature);
    }
}


