/*
Task 3
Дан список Person с полями name, age, city.
Используйте Stream API для фильтрации людей,
которые старше определенного возраста
и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */
package lesson_47.hw_lesson_47.task_3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonApp {
    public static void main(String[] args) {
        List<Person> persons = getListPersons();

        List<Person> filteredPersons = persons.stream()
//                .peek(System.out::println)
//                .distinct()
                .filter(p -> p.getAge() > 25 && p.getCity().equalsIgnoreCase("Берлин"))
                .collect(Collectors.toList());

        System.out.println("Люди старше 25 лет и проживающие в городе \"Берлин\":");
        filteredPersons.forEach(p -> System.out.println(p.getName()));
    }

    private static List<Person> getListPersons() {
        return List.of(
                new Person("Иванов", 23, "Берлин"),
//                new Person("Краснов", 26, "Берлин"),
                new Person("Краснов", 26, "Берлин"),
                new Person("Чернов", 35, "Мюнхен"),
                new Person("Павлов", 51, "Кельн"),
                new Person("Петров", 29, "Берлин"),
                new Person("Бутусов", 19, "Берлин"),
                new Person("Сидоров", 48, "Гамбург")

        );
    }


}
