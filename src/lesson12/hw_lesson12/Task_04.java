/*
Task 4
Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
Ожидаемый результат:

Значение myDouble: 10.0
 */
package lesson12.hw_lesson12;

//import java.util.Locale;

public class Task_04 {
    public static void main(String[] args) {
        int intVar = 10;
        double myDouble = intVar;

        System.out.printf("Значение myDouble: %.1f\n", myDouble);
//        System.out.printf(Locale.ENGLISH,"Значение myDouble: %.1f\n", myDouble);

    }
}
