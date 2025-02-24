/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
 */
package lesson_16.hw_lesson_16;

public class Task_01 {
    public static void main(String[] args) {
        int total = 1;
        int i = 1;
        int max = 15;

        while (i <= max) {
            total *= i;
//            System.out.printf("Произведение всех чисел от 1 до %d включительно: %d\n", i, total);
            i++;
        }
        System.out.printf("Произведение всех чисел от %d до %d включительно: %d\n", i - max, max, total);
    }
}
