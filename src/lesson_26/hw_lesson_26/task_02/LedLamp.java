package lesson_26.hw_lesson_26.task_02;

public class LedLamp extends Lighting {
    private String colorTemperature;

    public LedLamp(String name, String colorLight, String colorTemperature) {
        super(name, colorLight);
        this.colorTemperature = colorTemperature;
    }

    public void displayColorTemperature() {
        System.out.printf("Цветовая температура: %s\n", colorTemperature);
    }
}

