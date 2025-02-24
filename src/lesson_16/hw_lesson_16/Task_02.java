/*
Task 2
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */
package lesson_16.hw_lesson_16;

public class Task_02 {
    public static void main(String[] args) {

        int i = 1;
        String str = "Task";

        while (i <= 10) {
            System.out.printf("\"%s%d\"", str, i);
            String sepSign = (i <=9) ? ", " : ".\n";
            System.out.print(sepSign);
            i++;
        }

    }
}
