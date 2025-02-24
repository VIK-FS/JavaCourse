/*
Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
 */
package lesson13.hw_lesson13;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку чётной длины с клавиатуры");

        String evenStr = sc.nextLine();

        int evenStrLength = evenStr.length();
        String subString = evenStr.substring((evenStrLength / 2 - 1), evenStrLength / 2 + 1);
        System.out.printf("Два средних символа строки '%s': являются '%s'\n", evenStr, subString);

        sc.close();
    }
}
