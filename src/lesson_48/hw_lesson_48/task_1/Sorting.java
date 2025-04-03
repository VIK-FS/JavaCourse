/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
 */
package lesson_48.hw_lesson_48.task_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {

        List<Integer> integers = Arrays.asList(59, 1, -2, 3, 58, 489, 80, 45, -78, 56, 32, 4, 76, 7, 97, 3214, -56);

        List<Integer> sortedInteger = integers.stream()
                .filter(n -> n > 10)
                .sorted(Comparator.comparingInt(n -> n % 10))
                .collect(Collectors.toList());

        System.out.println("Числа больше 10, отсортированные по последней цифре: " + sortedInteger);
    }

}

