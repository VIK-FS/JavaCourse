package lesson13;

import java.util.Scanner;

public class ScanerExample {
    public static void main(String[] args) {
        //строка подготавливает программу для чтения данных из стандартного потока ввода
//        от пользователя через клавиатуру
        Scanner sc = new Scanner(System.in);
        // Прочитать строку
        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        System.out.println("Привет, " + name);

        // Прочитать число
        System.out.println("Введите ваш возраст: ");
        int age = sc.nextInt();
        // Всегда после вызова мотодов nextInt(), nextDouble(),next() и.
        sc.nextLine();
        System.out.println("Ваш возраст " + age);


        System.out.println("Введите ваш город: ");
        String city = sc.nextLine();
        System.out.println("Ваш город: " + city);

//        sc.close();

        // Todo Чтение токенами чисел

        // Разделитель
        /*

         */

        System.out.println("Введите число PI: ");
        double pi = sc.nextDouble();
        sc.nextLine();
        System.out.println("PI: " + pi);

    }
}
