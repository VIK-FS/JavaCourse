/*
Task 3 *(Опционально)
Напишите программу, которая просит пользователя ввести слово "hello".
Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
Если вводится неправильное слово, программа продолжает запрашивать ввод, пока не будет введено правильное слово.

Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова,
и выведите это количество на экран.
 */
package lesson_16.hw_lesson_16;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

        String greeting;
        int count = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите слово \"hello\" для завершения работы программы: ");
            greeting = sc.nextLine();
            count++;
        }
        while (!greeting.equalsIgnoreCase("hello"));

        System.out.println("Спасибо! Вы ввели правильное слово, программа завершает свою работу.");
        System.out.println("Количество попыток: " + count);


    }
}
