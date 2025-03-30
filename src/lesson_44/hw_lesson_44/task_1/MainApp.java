/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
отсортированный в порядке увеличения длин слов.
Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
package lesson_44.hw_lesson_44.task_1;

public class MainApp {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \\\"строка\\\" для удаления!";
        System.out.println("Входная строка : " + testString);
        System.out.println("Выходная строка: " + StringUtil.getUniqueSortedWords(testString));
    }
}
