/*
Task 4 Опционально
Практикуем groupingBy
Есть класс Student, описывающий студентов университета:

public class Student {
private String name;
private int age;
private String major; // специальность
private int year;     // курс
private double grade; // средняя оценка

    // Конструктор, геттеры, toString()
}
Copy
Создай список студентов (List) — минимум 10 объектов, с разнообразными значениями.

Задания:
Группировка по специальности
Сгруппируй студентов по специальности (поле major) в Map<String, List>.

Группировка по курсу с использованием Set
Сгруппируй студентов по курсу (year), при этом сохрани их в виде Set.

Подсчёт количества студентов по специальности
Построй Map<String, Long>, где ключ — специальность, а значение — количество студентов на этой специальности.

Средний балл по специальности
Построй Map<String, Double>, где ключ — специальность, а значение — средняя оценка студентов на этой специальности.

Список оценок по специальности
Построй Map<String, List>, где хранятся только оценки по каждой специальности.

Суммарная статистика по возрасту
Используй IntSummaryStatistics, чтобы получить:

минимальный возраст,
максимальный возраст,
средний возраст,
общее количество студентов,
сумму всех возрастов.
Требования:
Вся логика должна быть оформлена в main().
Не забудь добавить toString() в класс Student для красивого вывода.
Постарайся использовать Stream API и Collectors как на уроке.
 */
package lesson_48.hw_lesson_48.task_4;

import java.util.*;
import java.util.stream.Collectors;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                List.of(
                        new Student("Иван Иванов", 20, "Информатика", 2, 4.5),
                        new Student("Мария Петрова", 22, "Физика", 4, 4.7),
                        new Student("Алексей Смирнов", 21, "Информатика", 3, 3.9),
                        new Student("Ольга Васильева", 23, "Психология", 4, 4.8),
                        new Student("Дмитрий Сако", 19, "Экономика", 1, 4.0),
                        new Student("Екатерина Кузнецова", 22, "Экономика", 3, 4.9),
                        new Student("Сергей Панин", 24, "Юриспруденция", 1, 4.3),
                        new Student("Татьяна Михайлова", 20, "Психология", 2, 4.2),
                        new Student("Роман Чистяков", 21, "Информатика", 5, 4.1),
                        new Student("Наталья Селезнева", 23, "Иностранные языки", 4, 3.8),
                        new Student("Петр Панов", 22, "Физика", 3, 4.0),
                        new Student("Анастасия Кузина", 24, "Физика", 4, 4.6),
                        new Student("Дмитрий Буйнов", 21, "Математика", 5, 4.2),
                        new Student("Марина Григорьева", 23, "Экономика", 1, 4.7),
                        new Student("Андрей Сидоров", 19, "Экономика", 2, 4.3),
                        new Student("Елена Морозова", 22, "Математика", 3, 4.8),
                        new Student("Игорь Попов", 24, "Юриспруденция", 5, 4.5),
                        new Student("Ксения Касаткина", 21, "Психология", 3, 4.0),
                        new Student("Владимир Чернов", 20, "Информатика", 2, 4.4),
                        new Student("Ирина Лебедева", 23, "Иностранные языки", 5, 4.0)
                )
        );

        System.out.println("Список студентов:");
        students.forEach(System.out::println);

        Map<String, List<Student>> map = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor));

        System.out.println("Группировка студентов по специальности: ");
        map.forEach((major, studentsList) -> System.out.println(String.format("%-17s", major) + ": " + studentsList));

        Map<Integer, Set<Student>> yearMap = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.toSet()));

        System.out.println("Группировка студентов по курсу: ");
        yearMap.forEach((year, studentsSet) -> System.out.println(year + ": " + studentsSet));

        Map<String, Long> countMap = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));

        System.out.println("Подсчёт количества студентов по специальности:");
        countMap.forEach((major, count) -> System.out.println(String.format("%-17s", major) + ": " + count));

//        List<Map.Entry<String, Long>> sortedList = students.stream()
//                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()))
//                .entrySet().stream() // Преобразуем Map в поток записей (ключ-значение)
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toList());
//
//        System.out.println("Студенты, отсортированные по количеству студентов на специальности:");
//        sortedList.forEach(entry ->
//                System.out.println(entry.getKey() + ": " + entry.getValue() + " студентов")
//        );
        Map<String, Double> avrMap = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.averagingDouble(Student::getGrade)));

        System.out.println("Средний балл по специальности:");
        avrMap.forEach((major, avrCount) -> System.out.println(String.format("%-17s", major) + ": " + String.format("%.2f", avrCount)));

        Map<String, List<Double>> listGradeMap = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getMajor, Collectors.mapping(Student::getGrade, Collectors.toList())));

        System.out.println("Список оценок по специальности: ");
        listGradeMap.forEach((major , list) -> System.out.println(String.format("%-17s", major) + ": " + list));

        IntSummaryStatistics statistics = students.stream()
                .collect(Collectors.summarizingInt(Student::getAge));
        System.out.println("Статистика по возрасту:");
        System.out.println("минимальный возраст       : " + statistics.getMax());
        System.out.println("максимальный возраст      : " + statistics.getMin());
        System.out.println("средний возраст           : " + statistics.getAverage());
        System.out.println("общее количество студентов: " + statistics.getCount());
        System.out.println("сумма всех возрастов      : " + statistics.getSum());
        System.out.println("Суммарная статистика по возрасту: " + statistics);
    }
}
