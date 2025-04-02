/*
Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на
определенную букву
(например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.
 */
package lesson_47.hw_lesson_47.task_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Апельсин", "Банан", "Авокадо", "Вишня",
                "Арбуз", "Мандарины", "Лимон", "Малина");

        String searchLetter = "а";

        List<String> sortedString = sortedStringList(fruits, searchLetter);
        System.out.println("строки, которые начинаются на букву '" + searchLetter + "': " + sortedString);
    }

    private static List<String> sortedStringList(List<String> fruits, String letter) {
        List<String> sortedList = fruits.stream()
                .filter(f -> f.toLowerCase().startsWith(letter))
                .sorted()
                .collect(Collectors.toList());
        return sortedList;

    }


}
