/*
Task 4 * (Опционально)
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

Для каждой буквы имени создайте отдельную переменную типа char,
инициализированную соответствующей буквой в нижнем регистре.

Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции
(без использования библиотечных функций), и выведите результат.

Пример программы:

public class Main {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        // Ваш код
    }
}
Copy
Output:

HANNA
Copy
Пояснение
Переменные ch1, ch2, ch3, ch4 и ch5 должны быть преобразованы из нижнего регистра в верхний
с использованием только арифметических операций.
Вывод результата должен быть в виде строки с именем в верхнем регистре.
 */

package lesson13.hw_lesson13;

public class Task_04 {
    public static void main(String[] args) {
        char ch1 = 'v';
        char ch2 = 'i';
        char ch3 = 't';
        char ch4 = 'a';
        char ch5 = 'l';
        char ch6 = 'i';
        char ch7 = 'i';

        int shift = 32;

        ch1 = (char) (ch1 - shift);
        ch2 = (char) (ch2 - shift);
        ch3 = (char) (ch3 - shift);
        ch4 = (char) (ch4 - shift);
        ch5 = (char) (ch5 - shift);
        ch6 = (char) (ch6 - shift);
        ch7 = (char) (ch7 - shift);

        System.out.printf("Имя в верхнем регистре: '%c%c%c%c%c%c%c'\n", ch1, ch2, ch3, ch4, ch5, ch6, ch7);

    }
}
