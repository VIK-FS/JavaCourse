package Lesson_29.hw_lesson_29.task_1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String typeFigure, double width, double height) {
        super(typeFigure);
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.printf("%s шириною %.1f см. и длиною %.1f см. имеет площадь %.2f см\u00B2."
                , getTypeFigure(), width, height, width * height);
        calculatePerimeter();
    }

    @Override
    public void calculatePerimeter() {
        System.out.printf("и периметр %.2f см.\n", 2 * (width + height));
    }
}
