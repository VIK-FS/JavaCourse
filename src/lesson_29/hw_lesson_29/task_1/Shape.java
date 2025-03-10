package lesson_29.hw_lesson_29.task_1;

public abstract class Shape {
    private String typeFigure = "Figure";

    public Shape(String typeFigure) {
        this.typeFigure = typeFigure;
    }

    public String getTypeFigure() {
        return typeFigure;
    }

    public abstract void calculateArea();

    public abstract void calculatePerimeter();


}
