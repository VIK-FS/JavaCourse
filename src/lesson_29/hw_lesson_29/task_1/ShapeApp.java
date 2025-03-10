/*
Task 1
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */
package lesson_29.hw_lesson_29.task_1;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Круг", 11),
                new Rectangle("Прямоугольник", 10, 15),
                new Triangle("Треугольник", 3, 4)
        };

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].calculateArea();
        }
    }
}
