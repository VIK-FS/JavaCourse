package lesson_26.hw_lesson_26.task_01;

public class Shape {
    private String name;
    private String color = "не указан";

    public Shape(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.printf("Название фигуры: %s, цвет: %s\n", name, color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
