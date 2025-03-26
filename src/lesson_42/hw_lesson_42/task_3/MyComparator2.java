/*
Task 3 * ОПЦИОНАЛЬНО
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Output
 */
package lesson_42.hw_lesson_42.task_3;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator2 implements Comparator<Integer> {
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
        } else if (isAEven){
            return a.compareTo(b);
        }else {
            return b.compareTo(a);
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        System.out.println("Массив до сортировки:    " + Arrays.toString(integers));
        Arrays.sort(integers, new MyComparator2());

        System.out.println("Массив после сортировки: " + Arrays.toString(integers));
    }

}

