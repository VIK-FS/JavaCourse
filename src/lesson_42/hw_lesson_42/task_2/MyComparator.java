/*
Task 2 * ОПЦИОНАЛЬНО
Напишите MyComparator, реализующий Comparator с методом сравнения
для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Output
 */
package lesson_42.hw_lesson_42.task_2;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        boolean isAEven;
        boolean isBEven;
        if (a % 2 == 0) {
            isAEven = true;
        } else {
            isAEven = false;
        }
        if (b % 2 == 0) {
            isBEven = true;
        } else {
            isBEven = false;
        }

        if (isAEven && !isBEven) {
            return -1;
        } else if (!isAEven && isBEven) {
            return 1;
        } else {
            return a.compareTo(b);
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        System.out.println("Массив до сортировки:    " + Arrays.toString(integers));
        Arrays.sort(integers, new MyComparator());

        System.out.println("Массив после сортировки: " + Arrays.toString(integers));
    }

}
