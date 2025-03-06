package lesson_28.hw_lesson_28.task_3;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.printf("%s радиусом %.1f см. имеет площадь %.2f см\u00B2.\n", getName()
                , radius, PI * radius * radius);
    }
}
