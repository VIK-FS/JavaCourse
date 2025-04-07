/*
Task 3
Написать метод, принимающий список из нескольких дат типа LocalDate
и возвращающий количество дней между самой ранней и поздней датами в этом списке
 */
package lesson_50.hw_lesson_50.task_3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        LocalDate d1 = localDate.plusDays(6);
        LocalDate d2 = localDate.minusDays(28);
        LocalDate d6 = localDate.plusDays(48);
        LocalDate d7 = localDate.plusDays(95);
        LocalDate d3 = localDate.minusDays(46);
        LocalDate d8 = localDate.plusDays(78);
        LocalDate d4 = localDate.minusDays(190);
        LocalDate d9 = localDate.plusDays(20);
        LocalDate d5 = localDate.minusDays(46);
        LocalDate d10 = localDate.plusDays(14);


        long result = returnNumbersOfDays(d1, null, d3, null, d5, d6, d7, d8, d9, d10);
        System.out.println("Разница между самой ранней и самой поздней датой: " + result + " дней");
    }

    private static long returnNumbersOfDays(LocalDate... dates) {
        if (dates == null || dates.length == 0) {
            throw new IllegalArgumentException("Список дат не должен быть пустым или null");
        }

        List<LocalDate> validDates = Arrays.stream(dates)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        if (validDates.isEmpty()) {
            throw new IllegalArgumentException("Нет ни одной корректной даты (все значения null)");
        }

        LocalDate min = validDates.stream()
                .min(LocalDate::compareTo)
                .orElseThrow();

        LocalDate max = validDates.stream()
                .max(LocalDate::compareTo)
                .orElseThrow();

        return ChronoUnit.DAYS.between(min, max);
    }
}




