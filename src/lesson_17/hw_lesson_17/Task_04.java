/*
Task 4 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100. Программа должна найти,
 и вывести на экран все простые числа. Посчитайте сколько получилось таких чисел в массиве.

Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */
package lesson_17.hw_lesson_17;

import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[50];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }

        int countPrimes = 0;
        System.out.print("Простые числа: ");

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                countPrimes++;
            }
        }

        System.out.println("\nКоличество простых чисел: " + countPrimes);
    }
}
