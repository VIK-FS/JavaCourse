/*
Task 6
Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */
package lesson_16.hw_lesson_16;

import java.util.Random;

public class Task_06 {
    public static void main(String[] args) {
        int[] numbers = {5, 6, -25, 0, 31, -15};

        System.out.print("Исходный массив:   ");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        int minIndex = 0;
        int maxIndex = 0;
        i = 1;
        while (i < numbers.length) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
            i++;
        }

        int temp = numbers[minIndex];
        numbers[minIndex] = numbers[maxIndex];
        numbers[maxIndex] = temp;

        System.out.print("Измененный массив: ");
        i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();
    }
}


