/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка,
 которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */
package lesson_47.hw_lesson_47.task_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(16, 22, 1, 2, 3, 45, 89, 48, 65, -46, 20, 3, 2, 98, 90, 159, 222, 370);
        List<Integer> sortedIntegersList = sortedIntegers(integers);
        System.out.println("Чётные числа из старого списка больше 10 и меньше 100: " + sortedIntegersList);


    }

    private static List<Integer> sortedIntegers(List<Integer> integers) {
        List<Integer> uniqueIntegers = integers.stream()
                .filter(integer -> integer % 2 == 0 && integer > 10 && integer < 100)
                .sorted()
                .collect(Collectors.toList());
        return uniqueIntegers;
    }


}
