package lesson_29.hw_lesson_29.task_1;

public class Circle extends Shape {
//    {
//        typeFigure = "Круг";
//    }

    private final double PI;
    private double radius;


    public Circle(String typeFigure, double radius) {
        super(typeFigure);
        this.PI = 3.14;
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.printf("%s радиусом %.1f см. имеет площадь %.2f см\u00B2.", getTypeFigure(), radius, PI * radius * radius);
        calculatePerimeter();
    }

    @Override
    public void calculatePerimeter() {
        System.out.printf("и длину окружности %.2f см.\n", 2 * PI * radius);

    }
}
