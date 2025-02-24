/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке,
и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр
с суммой последних двух цифр.
Примеры:

- Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
- Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */
package lesson_15.hw_lesson_15;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        String strDigit = sc.nextLine();

        if (strDigit.length() == 4) {
            char c1 = strDigit.charAt(0);
            char c2 = strDigit.charAt(1);
            char c3 = strDigit.charAt(2);
            char c4 = strDigit.charAt(3);

            if (c1 >= '0' && c1 <= '9' &&
                    c2 >= '0' && c2 <= '9' &&
                    c3 >= '0' && c3 <= '9' &&
                    c4 >= '0' && c4 <= '9') {

//                System.out.printf("c1 char = '%c'\nc2 char = '%c'\nc3 char = '%c'\nc4 char = '%c'\n", c1, c2, c3, c4);

                int sum1 = (c1 - '0') + (c2 - '0');
                int sum2 = (c3 - '0') + (c4 - '0');
//                char c = '0';
//                int code = c;
//                System.out.printf("'%d' - это ASCII-код '0' \n", code);

                if (sum1 == sum2) {
                    System.out.printf("Число '%s' -> ('%c'+'%c') = '%d'; ('%c'+'%c') = '%d';'%d' равно '%d' -" +
                                    " число счастливое\n"
                            , strDigit, c1, c2, sum1, c3, c4, sum2, sum1, sum2);
                } else {
                    System.out.printf("Число '%s' -> ('%c'+'%c') = '%d'; ('%c'+'%c') = '%d';'%d'  не равно '%d'- " +
                                    "число НЕ является счастливым\n"
                            , strDigit, c1, c2, sum1, c3, c4, sum2, sum1, sum2);
                }
            } else {
                System.out.println("Ошибка! Введенное значение не является четырехзначным числом.");
            }
        } else {
            System.out.println("Ошибка! Введите ровно 4 цифры.");
        }
    }
}
