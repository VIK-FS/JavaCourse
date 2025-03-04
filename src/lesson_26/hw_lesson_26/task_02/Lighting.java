package lesson_26.hw_lesson_26.task_02;

public class Lighting {
    private String name;
    private String colorLight;
    private double luminousFlux;
    private double voltage;
    private double current;

    public Lighting(String name, String colorLight) {
        this.name = name;
        this.colorLight = colorLight;
    }

    public void setColorLight(String colorLight) {
        this.colorLight = colorLight;
    }

    public void setValues(double voltage, double current, double luminousFlux) {
        this.voltage = voltage;
        this.current = current;
        this.luminousFlux = luminousFlux;
    }

    public void displayInfo() {
        System.out.printf("Название лампы: %s, цвет света: %s\n", name, colorLight);
    }

    public double calculatePower() {
        return voltage * current;
    }

    public double calculateLuminousEfficacy() {
        double power = calculatePower();
        return luminousFlux / power;
    }

    public void displayPower() {
        double power = calculatePower();
        System.out.printf("Мощность: %.1f Вт\n", power);
    }

    public void displayLuminousEfficacy() {
        double luminousEfficacy = calculateLuminousEfficacy();
        System.out.printf("Коэффициент светоотдачи: %.1f лм/Вт\n", luminousEfficacy);
    }

    public String toString() {
        return String.format("Лампа: %s, цвет света: %s, напряжение: %.1f В, ток: %.2f А, световой поток: %.1f лм",
                name, colorLight, voltage, current, luminousFlux);
    }
}
