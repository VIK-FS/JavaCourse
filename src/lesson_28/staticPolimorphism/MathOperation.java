package lesson_28.staticPolimorphism;
/*
Статический полиформизм (Overload)
динамический полиформизм (Override)
 */

public class MathOperation {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println (sum(1,2));
    }

}
