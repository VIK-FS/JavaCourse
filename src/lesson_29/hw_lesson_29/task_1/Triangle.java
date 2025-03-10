package lesson_29.hw_lesson_29.task_1;

public class Triangle extends Shape {
    private double cathetus1;
    private double cathetus2;

    public Triangle(String typeFigure, double cathetus1, double cathetus2) {
        super(typeFigure);
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    @Override
    public void calculateArea() {
        System.out.printf("%s с длиною катетов %.1f см. и %.1f см. имеет площадь %.2f кв.см\u00B2."
                , getTypeFigure(), cathetus1, cathetus2, cathetus1 * cathetus2 / 2);
        calculatePerimeter();
    }

    @Override
    public void calculatePerimeter() {
        double hyp = (Math.sqrt((cathetus1 * cathetus1) + (cathetus2 * cathetus2)));
        System.out.printf("и периметр %.2f см.\n", cathetus1 + cathetus2 + hyp);
    }

}
