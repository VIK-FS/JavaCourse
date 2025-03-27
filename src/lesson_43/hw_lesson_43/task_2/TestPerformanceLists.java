/*
    Task 2 (* Опционально)
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.
И сравните время последовательного выполнения всех методов для каждой реализации List-а.

Пример метода, который измеряет время выполнения некоторого кода и возвращает его в миллисекундах:

Пример метода
public class TimerExample {
    public static void main(String[] args) {
        // Измеряем и выводим время выполнения метода someMethod
        long duration = someMethod();
        System.out.println("Время выполнения метода: " + duration + " миллисекунд");
    }
    private static long someMethod() {
        // Засекаем время начала выполнения
        long startTime = System.currentTimeMillis();
        // Тело метода
        // Засекаем время окончания выполнения
        long endTime = System.currentTimeMillis();
        // Возвращаем разницу во времени в миллисекундах
        return endTime - startTime;
    }
}
 */
package lesson_43.hw_lesson_43.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestPerformanceLists {
//    private static final String GREEN = "\u001B[32m";
//    private static final String RED = "\u001B[31m";
//    private static final String RESET = "\u001B[0m";
    private static final int MAX_VALUE = 1_000;
    private static final int SIZE = 100_000;
    private static final int INSERT_COUNT = 2_000;
    private static final int REMOVE_COUNT = 1_000;
    private static final int RANGE = 10_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Тест ArrayList:");
        testPerformance(arrayList);

        System.out.println("\nТест LinkedList:");
        testPerformance(linkedList);

//        listWithRandomValues(arrayList);
//        listWithRandomValues(linkedList);
//        System.out.println("Получение всех значений элементов списка по его индексу (ArrayList): "
//                + listByIndex(arrayList) + " мс.");
//        System.out.println("Получение всех значений элементов списка по его индексу (LinkedList): "
//                + listByIndex(linkedList) + " мс.");
//
//        System.out.println("\nВставка 2_000 новых значений по случайному индексу (ArrayList): "
//                + insertRandomIndex(arrayList) + " мс.");
//        System.out.println("Вставка 2_000 новых значений по случайному индексу (LinkedList): "
//                + insertRandomIndex(linkedList) + " мс.");
//
//        System.out.println("\nУдалить 1_000 элементов по случайному индексу (ArrayList): "
//                + removeRandomIndex(arrayList) + " мс.");
//        System.out.println("Удалить 1_000 элементов по случайному индексу (LinkedList): "
//                + removeRandomIndex(linkedList) + " мс.");
//
//        System.out.println("\nУдалить 1_000 элементов по значению  (ArrayList): "
//                + removeRandomByValue(arrayList) + " мс.");
//        System.out.println("Удалить 1_000 элементов по значению  (LinkedList): "
//                + removeRandomByValue(linkedList) + " мс.");
//
//        listWithRandomValues(linkedList);

    }
    private static void testPerformance(List<Integer> list) {
        listWithRandomValues(list);

        long durationGetByIndex = listByIndex(list);
        long durationInsert = insertRandomIndex(list);
        long durationRemoveByIndex = removeRandomIndex(list);
        long durationRemoveByValue = removeRandomByValue(list);

        System.out.println("Время получения элементов по индексу: " + durationGetByIndex + " мс.");
        System.out.println("Время вставки 2000 элементов: " + durationInsert + " мс.");
        System.out.println("Время удаления 1000 элементов по индексу: " + durationRemoveByIndex + " мс.");
        System.out.println("Время удаления 1000 элементов по значению: " + durationRemoveByValue + " мс.");

        long totalTime = durationGetByIndex + durationInsert + durationRemoveByIndex + durationRemoveByValue;
        System.out.println("Общее время выполнения всех операций: " + totalTime + " мс.");
    }

    private static List<Integer> listWithRandomValues(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            list.add(random.nextInt(MAX_VALUE + 1));
        }
        return list;
    }

    private static long listByIndex(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            int value = list.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long insertRandomIndex(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < INSERT_COUNT; i++) {
            int index = random.nextInt(SIZE);
            list.add(index, random.nextInt(MAX_VALUE + 1));
        }
        return System.currentTimeMillis() - startTime;
    }
    private static long removeRandomIndex(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < REMOVE_COUNT && !list.isEmpty(); i++) {
            int index = random.nextInt(SIZE);
            list.remove(index);
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long removeRandomByValue(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < REMOVE_COUNT; i++) {
            int value = random.nextInt(RANGE+1);
            list.remove((Integer) value);
        }
        return System.currentTimeMillis() - startTime;
    }
}
