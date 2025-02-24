/*
Task 5 * (Опционально)
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->

T
w
e
n
t
y
 */
package lesson_17.hw_lesson_17;

public class Task_05 {
    public static void main(String[] args) {
        String[] words = {"One", "Two", "Twenty"};
        printLongestStringChars(words);
    }

    public static void printLongestStringChars(String[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Массив пустой или null.");
            return;
        }

        String longest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > longest.length()) {
                longest = array[i];
            }
        }

        for (int i = 0; i < longest.length(); i++) {
            System.out.println(longest.charAt(i));
        }
    }
}

