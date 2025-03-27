/*
Task 1
Напишите метод, который принимает на вход две реализации интерфейса List.
Метод должен возвращать список состоящий из элементов,
которые присутствуют в обеих коллекциях.
 */
package lesson_43.hw_lesson_43.task_1;

import java.util.ArrayList;
import java.util.List;

public class ListApp {

    public static List<Integer> listByBothCollections(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>(l1);
        result.retainAll(l2);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(0, 1, 2, -2, -3, 4, 5, 6, 7, 8, -9, 10));
        List<Integer> list2 = new ArrayList<>(List.of(0, -1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        ListApp app = new ListApp();
//        List<Integer> list = app.listByBothCollections(list1, list2);
        List<Integer> list = listByBothCollections(list1, list2);

        System.out.println("Список № 1 состоящий из элементов: " +list1);
        System.out.println("Список № 2 состоящий из элементов: " +list2);
        System.out.println("Список состоящий из элементов,\n" +
                "которые присутствуют в обеих коллекциях: " + list);
    }

}
