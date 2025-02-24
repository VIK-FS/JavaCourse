/*
Task 4 * (Опционально)
Программа запрашивает у пользователя ввод произвольного числа. Вывести сумму цифр этого числа.

Пример:

567432 -> 5+6+7+4+3+2 -> 27
 */
package lesson_16.hw_lesson_16;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arbitraryNumber;

        while (true) {
            System.out.print("Введите произвольное число: ");
            if (sc.hasNextInt()) {
                arbitraryNumber = sc.nextInt();
                sc.nextLine();
                break;
            } else {
                System.out.println("Ошибка! Введите целое число.");
                sc.nextLine();
            }
        }

        int temp = arbitraryNumber;
        int div = 1;
        int total = 0;

        while (temp >= 10) {
            div *= 10;
            temp /= 10;
        }

        System.out.print(arbitraryNumber + " -> ");

        while (div > 0) {
            int digit = arbitraryNumber / div;
            total += digit;

            System.out.print(digit);

            arbitraryNumber %= div;
            div /= 10;

            if (div > 0) {
                System.out.print("+");
            }
        }

        System.out.println(" -> " + total);
    }
}
