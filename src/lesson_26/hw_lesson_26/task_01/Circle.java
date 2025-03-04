package lesson_26.hw_lesson_26.task_01;

public class Circle extends Shape {
    private static final double PI = 3.14;
    double radius;

    public Circle(String name) {
        super(name);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = PI * (radius * radius);
        System.out.printf("Площадь круга: %.1f кв.см.\n", area);
    }
}
