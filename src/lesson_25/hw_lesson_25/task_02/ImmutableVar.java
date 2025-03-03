/*
Task 2
Неизменяемая переменная
•	Объявите переменную final int MAX_USERS = 100;.
•	Попробуйте изменить значение MAX_USERS в коде после её инициализации.
•	Объясните, что произошло при попытке изменения значения.
 */
package lesson_25.hw_lesson_25.task_02;

import javax.sound.midi.Soundbank;

public class ImmutableVar {
    public static void main(String[] args) {

        final int MAX_USERS = 100;
        // Пробуем изменить значение переменной
//        MAX_USERS = 200; // Ошибка! Невозможно изменить значение final переменной.
        // java: cannot assign a value to final variable MAX_USERS
        // Код, наверное, даже не скомпилируется

        System.out.println("Максимальное количество пользователей  : " + MAX_USERS);

    }
}
