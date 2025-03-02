package lesson_24.hw_lesson_24.task_1;

public class Calculator {

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
