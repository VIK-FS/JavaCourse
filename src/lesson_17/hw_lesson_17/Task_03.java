/*
Task 3
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)

P.S. А почему вы решили, что число может прийти только положительное? ;)


 */
package lesson_17.hw_lesson_17;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        expIntDigit(num1);

    }

    public static void expIntDigit(int num1) {
        if (num1 < 0) {
            double total = 1;
            for (int i = 0; i < -num1; i++) {
                total *= 2;
            }
            total = 1 / total;
            System.out.printf("Число 2 в '%d' степени: %.4f\n", num1, total);
        } else {
            int total = 1;
            for (int i = 0; i < num1; i++) {
                total *= 2;
            }
            System.out.printf("Число 2 в '%d' степени: %d\n", num1, total);
        }
    }
}

