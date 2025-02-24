/*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */
package lesson13.hw_lesson13;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        System.out.println("Количество символов в имени пользователя " + name + ": " + name.length());

        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);

        System.out.printf("В имени '%s' код первого символа    '%c' " +
                "в десятичной системе счисления: '%d'\n", name, first, (int) first);
        System.out.println("В имени '" + name + "' код последнего символа '" + last + "' в десятичной системе счисления: '"
                + (int) last + "'");


    }

}
