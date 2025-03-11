package lesson_31.lists;

//import lesson_23.hw_lesson23.task_1.MagicArrayList;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        // Пример с типом Integer, можно использовать другие типы, например, String
        Integer[] test = {1, 2, 3, 4, 5};

        // Создаём объект MagicArrayList с обобщённым типом
        MagicArrayList<Integer> magic = new MagicArrayList<>(test);

        // Добавление элемента в коллекцию
        magic.add(10);
        System.out.println("После добавления 10: " + magic.toString());

        // Изменение элемента в исходном массиве
        test[3] = 1000;

        // Добавление нескольких элементов
        magic.add(20, 330, 40);
        magic.test();
        System.out.println("После добавления 20, 330, 40: " + magic.toString());

        // Преобразование в массив и вывод
//        Integer[] fromMagic = magic.toArray();
//        System.out.println("Массив после преобразования в toArray(): " + Arrays.toString(fromMagic));

        System.out.println("===========remove==========");

        // Удаление элементов по значению
        System.out.println("Удаление элемента 330: " + magic.removeByValue(330));
        System.out.println("Удаление несуществующего элемента 10000: " + magic.removeByValue(10000));
        System.out.println("Удаление некорректного значения (-2_147_483_647): " + magic.removeByValue(-2_147_483_647));

        // Печать текущего состояния массива после удалений
        System.out.println("После удалений: " + magic.toString());

//        int[] test = {1, 2, 3, 4, 5};
//
//        MagicArrayList magic = new MagicArrayList(test);
//        magic.add(10);
//
//        System.out.println(magic.toString());
//
//        test[3] = 1000;
//
//        magic.add(20,330,40);
//        magic.test();
//        System.out.println(magic.toString());
//
//        int[] fromMagic = magic.toArray();
//        System.out.println("массив: " + Arrays.toString(fromMagic));
//
//        System.out.println("===========remove==========");
//
//        System.out.println(magic.removeByValue(330));
//        System.out.println(magic.removeByValue(10000));
//        System.out.println(magic.removeByValue(-2_147_483_647));
//
//        System.out.println(magic.toString());

    }

}
