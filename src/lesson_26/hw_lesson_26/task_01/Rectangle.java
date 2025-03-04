package lesson_26.hw_lesson_26.task_01;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        double area = width * height;
        System.out.printf("Площадь прямоугольника: %.1f кв.см.\n", area);
    }
}
