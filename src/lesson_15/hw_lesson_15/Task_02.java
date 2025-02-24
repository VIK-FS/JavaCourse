/*
Task 2
Напишите программу с использованием оператора switch:

Программа просит пользователя ввести число от 1 до 7.
Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
 */
package lesson_15.hw_lesson_15;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число от 1 до 7: ");

        if (sc.hasNextInt()) {
            int digit = sc.nextInt();

            switch (digit) {
                case 1:
                    System.out.println("\"Понедельник\"");
                    break;
                case 2:
                    System.out.println("\"Вторник\"");
                    break;
                case 3:
                    System.out.println("\"Среда\"");
                    break;
                case 4:
                    System.out.println("\"Четверг\"");
                    break;
                case 5:
                    System.out.println("\"Пятница\"");
                    break;
                case 6:
                case 7:
                    System.out.println("\"Выходной\"");
                    break;
                default:
                    System.out.println("Введено неверное число! Введите число от 1 до 7.");
            }

        } else {
            System.out.println("Ошибка! Введите только целое число от 1 до 7.");
        }
    }
}
