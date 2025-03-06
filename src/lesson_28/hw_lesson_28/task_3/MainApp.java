/*
Task 3 опционально
Фигуры и их площади

Создайте класс Фигура с методом рассчитатьПлощадь().

Реализуйте классы различных геометрических фигур (например, Круг, Квадрат, Треугольник).

В главном классе создайте список фигур и вычислите площадь каждой из них.
 */
package lesson_28.hw_lesson_28.task_3;

public class MainApp {
    public static void main(String[] args) {
        Figure[] figures = {
                new Circle("Круг", 5.5),
                new Square("Квадрат", 6.9),
                new Triangle("Треугольник", 4.7, 9.1)
        };

        for (int i = 0; i < figures.length; i++) {
            figures[i].calculateArea();
        }

//        for (Figure figure : figures) {
//            figure.calculateArea();
//        }

    }
}
