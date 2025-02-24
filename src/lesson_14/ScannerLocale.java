package lesson_14;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocale {
    public static void main(String[] args) {
        String data = "3,14 42,7";
        Scanner sc = new Scanner(data);

        sc.useLocale(Locale.US);
        // Locale - формат чисел

        //Locale.US
        //Locale.GERMANY


        System.out.println(Locale.getDefault());
        String text = "42,Java,3.14,Hello";
        Scanner scanner = new Scanner(text);
        scanner.useLocale(Locale.US);
        scanner.useDelimiter(",");

        scanner.useDelimiter("\\s*,\\s*");// Разделитель

        System.out.println(scanner.nextInt());
        String java = scanner.next(); // next() - считает ОДИН токен
        System.out.println(java);
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());

        System.out.println(Locale.getDefault());
//        scanner.reset(); // Вернуться к стандартному разделителю
    }
}
