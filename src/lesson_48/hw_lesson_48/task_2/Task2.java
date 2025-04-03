/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */
package lesson_48.hw_lesson_48.task_2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Поездка", null, "незнакомые", "края");

        Optional<String> sortedString = stringList.stream()
//                .filter(string -> string != null)
                .filter(Objects::nonNull)
//                .min(Comparator.comparing(string -> string.length()));
                .min(Comparator.comparing(String::length));

        System.out.println("Строка с минимальной длинной: " + sortedString.orElse("Нет доступных строк"));
    }
}
