/*
Массивы
Task 5
Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
 */
package lesson_16.hw_lesson_16;

import java.util.Random;


public class Task_05 {
    public static void main(String[] args) {
        Random random = new Random();

        int length = random.nextInt(11) + 5;
        int[] numbers = new int[length];

        int i = 0;
        while (i < length) {
            numbers[i] = random.nextInt(101) - 50;
            i++;
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        i = 0;
        while (i < length) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            sum += numbers[i];
            i++;
        }

        double average = (double) sum / length;

        System.out.print("Массив: ");
        i = 0;
        while (i < length) {
            System.out.print(numbers[i] + " ");
            i++;
        }

        System.out.println();

        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);
        System.out.printf("Среднее арифметическое всех значений в массиве: %.02f\n", average);
    }
}

