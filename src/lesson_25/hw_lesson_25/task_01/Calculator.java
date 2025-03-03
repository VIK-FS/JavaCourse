package lesson_25.hw_lesson_25.task_01;

public class Calculator {
    public static final double PI = 3.14;

    public double circumference(double radius){
        return 2*PI*radius;
    }
    public double areaOfCircle(double radius){
        return (PI*(radius*radius));
    }
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.print("Ошибка!!! Деление на ноль! ");
            return Double.NaN;
        }
        return num1 / num2;
    }
}
