/*
Task 0
Написать класс Employee (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info() выводящий информацию о работнике.
 */
package lesson_23.hw_lesson23.task_0;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Игорь Войтенко", 38, 3500);
//        System.out.println(employee.info());

//        System.out.println("Имя: " + employee.getName());
//        System.out.println("Возраст: " + employee.getAge() + " лет");
//        System.out.println("Зарплата: " + employee.getSalary() + " €\n");

        employee.info();

        employee.setName("Михаил Никитенко");
        employee.setAge(29);
        employee.setSalary(3900);
        System.out.println("=================================");

        employee.info();
    }
}
