/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */
package lesson_14.hw_lesson_14;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int digit = sc.nextInt();
//        sc.nextLine();
        boolean isEvenDigit = digit % 2 == 0;
        boolean isDivisibleDigitBy3 = digit % 3 == 0;
        boolean isEvenAndDivisibleDigitBy3 = digit % 2 == 0 && digit % 3 == 0;
        System.out.printf("Число: '%d' четное: '%b'; кратно 3: '%b'; четное и кратное 3: '%b'\n"
                ,digit
                ,isEvenDigit
                ,isDivisibleDigitBy3
                ,isEvenAndDivisibleDigitBy3);
    }
}
