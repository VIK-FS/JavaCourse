/*
Task 1
Дан текст Programming is fun.

Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.
 */
package lesson_14.hw_lesson_14;

import javax.sound.midi.Sequence;

public class Task_01 {
    public static void main(String[] args) {
        String str = "Programming is fun";
        boolean isSequencePresent  = str.contains("fun");
        System.out.printf("Содержит ли эта строка \"%s\" слово \"fun\"? %b\n", str,isSequencePresent );

        boolean isWordPresent = str.matches(".*\\bfun\\b.*");
        System.out.printf("Содержит ли эта строка '%s' слово 'fun'? %b\n", str,isWordPresent );

    }
}
