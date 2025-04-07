/*
Task 2
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней даты
 */
package lesson_50.hw_lesson_50.task_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата: " + today);
        System.out.printf("Текущий год: %s, месяц: %s, день: %s \n"
                , today.getYear(), today.getMonth(), today.getDayOfMonth());

        LocalDate myBirthday = LocalDate.of(1979, 5, 16);
        LocalDate anotherLocalDate = LocalDate.of(2020, 12, 8);
        System.out.println("myBirthday: " + myBirthday);
        System.out.println("myBirthday.equals(anotherLocalDate): " + myBirthday.equals(anotherLocalDate));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Текущая дата: " + localDateTime);
        System.out.println("Текущая дата + 3 часа: " + localDateTime.plusHours(3));
        System.out.println("Текущая дата + одна неделя: " + localDateTime.plusWeeks(1));
        System.out.println("Текущая дата которая  на год раньше сегодняшней: " + localDateTime.minusYears(1));
        System.out.println("Текущая дата которая  на год позже сегодняшней: " + localDateTime.plusYears(1));

        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Tomorrow : " + tomorrow + "\nYesterday: " + yesterday);

        List<LocalDate> days = Arrays.asList(tomorrow, yesterday, today);
        List<String> day = days.stream()
                .map(d -> {
                    if (d.isBefore(today)) return d + " находится до сегодняшней даты";
                    else if (d.isAfter(today)) return d + " находится после сегодняшней даты";
                    else return d + " сегодняшняя дата";
                })
                .collect(Collectors.toList());
        day.forEach(System.out::println);
    }
}
