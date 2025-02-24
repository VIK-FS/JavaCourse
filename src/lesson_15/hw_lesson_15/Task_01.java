/*
Task 1
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */
package lesson_15.hw_lesson_15;

import java.util.Random;

public class Task_01 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum1 = random.nextInt(101);
        int randomNum2 = random.nextInt(101);
        int randomNum3 = random.nextInt(101);
        int randomNum4 = random.nextInt(101);

        int max = randomNum1;

        if (randomNum2 > max) {
            max = randomNum2;
        }
        if (randomNum3 > max) {
            max = randomNum3;
        }
        if (randomNum4 > max) {
            max = randomNum4;
        }

        System.out.printf("Первое случайное число:    '%d'\nВторое случайное число:    '%d'\n" +
                        "Третье случайное число:    '%d'\nЧетвёртое случайное число: '%d'\n"
                , randomNum1, randomNum2, randomNum3, randomNum4);
        System.out.println("Максимальное число: " + max);

    }
}
