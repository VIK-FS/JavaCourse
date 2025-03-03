/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу
Copy
Класс должен содержать:

- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)
 */
package lesson_25.hw_lesson_25.task_01;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число или " +
                "радиус для вычисления длины окружности и площади круга ");
        double num1 = sc.nextDouble();
        System.out.print("Введите операцию: ('+' '-' '*' '/') " +
                "'l' для вычисления длины окружности или " +
                "'s' для вычисления площади круга  ");
        char oper = sc.next().charAt(0);
        double num2 = 0;
        if (oper != 'l' && oper != 's') {
            System.out.print("Введите второе число: ");
            num2 = sc.nextDouble();

        }
        double result = 0;
        double radius = 0;
        Calculator calc = new Calculator();

        switch (oper) {
            case '+':
                result = Calculator.addition(num1, num2);
                break;
            case '-':
                result = Calculator.subtraction(num1, num2);
                break;
            case '*':
                result = Calculator.multiplication(num1, num2);
                break;
            case '/':
                result = Calculator.division(num1, num2);
                break;
            case 'l':
                result = calc.circumference(num1);
                break;
            case 's':
                result = calc.areaOfCircle(num1);
                break;
        }

        if (Double.isNaN(result)) {
            System.out.println("Невозможно выполнить операцию.");
        } else {
            System.out.printf("Результат операции '%c' равен " + ((result % 1 == 0) ? "%.0f\n" : "%.2f\n"), oper, result);
        }
    }
}


//import java.util.Scanner;
//
//public class CalculatorApp {
//
//    public static double getValidNumber(Scanner sc, String message) {
//        double number;
//        while (true) {
//            System.out.print(message + " (или введите 'exit' для выхода): ");
//            if (sc.hasNext("exit")) {
//                System.out.println("Программа завершена.");
//                System.exit(0);
//            } else if (sc.hasNextDouble()) {
//                number = sc.nextDouble();
//                break;
//            } else {
//                System.out.println("Ошибка! Введите число.");
//                sc.next();
//            }
//        }
//        return number;
//    }
//
//    public static char getValidOper(Scanner sc) {
//        char oper;
//        while (true) {
//            System.out.print("Введите операцию ('+' '-' '*' '/') (или 'exit' для выхода): ");
//            String input = sc.next();
//            if (input.equals("exit")) {
//                System.out.println("Программа завершена.");
//                System.exit(0);
//            } else if (input.length() == 1 && "+-*/".contains(input)) {
//                oper = input.charAt(0);
//                break;
//            } else {
//                System.out.println("Ошибка! Введите корректную операцию.");
//            }
//        }
//        return oper;
//    }
//
//    public static boolean askToContinue(Scanner sc) {
//        System.out.print("Для продолжения работы нажмите Enter или 'N' для завершения ");
//
//        sc.nextLine();
//        String input = sc.nextLine().trim().toLowerCase();
//        if (input.equals("n")) {
//            System.out.println("Программа завершена.");
//            return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            double num1 = getValidNumber(sc, "Введите первое число: ");
//            double num2;
//            char oper = getValidOper(sc);
//
//            if (oper == '/') {
//                while (true) {
//                    num2 = getValidNumber(sc, "Введите второе число: ");
//                    if (num2 == 0) {
//                        System.out.println("Ошибка! Деление на 0 невозможно. Введите другое число для деления.");
//                    } else {
//                        break;
//                    }
//                }
//            } else {
//                num2 = getValidNumber(sc, "Введите второе число: ");
//            }
//
//            double result = 0;
//
//            switch (oper) {
//                case '+':
//                    result = Calculator.addition(num1, num2);
//                    break;
//                case '-':
//                    result = Calculator.subtraction(num1, num2);
//                    break;
//                case '*':
//                    result = Calculator.multiplication(num1, num2);
//                    break;
//                case '/':
//                    result = Calculator.division(num1, num2);
//                    break;
//            }
//            System.out.printf("Результат операции '%c' равен:  " + (result % 1 == 0 ? "%.0f\n" : "%.2f\n"), oper, result);
//
//            if (!askToContinue(sc)) {
//                break;
//            }
//        }
//    }
//}
