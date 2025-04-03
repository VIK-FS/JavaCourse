/*
Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список
 */
package lesson_48.hw_lesson_48.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(59, 1, -2, 3, 58, 489, 80, 45, -78, 56, 32, 4, 76, 7, 97, 3214, -56);

        List<Integer> evenIntegers = integers.stream()

                .filter(i -> i % 2 == 0)
                .sorted()
                .map(integer -> integer * 2)
                .collect(Collectors.toList());
        System.out.println("Отфильтрованный список четных чисел умноженных на 2: " + evenIntegers);

    }

}
