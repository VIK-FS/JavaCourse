package lesson_18.hw_lesson_18;

import java.util.Arrays;

public class Task_01_01 {
    public static void main(String[] args) {

        int[] test1 = {0, 1, 2, 3, 4, 5, 6};
        int[] test2 = {0, 1, 2};

        copyOfArray(test1, 3);
        copyOfArray(test2, 5);
        copyOfArray(null, 4);
        copyOfArray(test1, -2);
    }

    public static void copyOfArray(int[] array, int newLength) {

        if (array == null) {
            System.out.println("Входной массив == null");
            return;
        }

        if (newLength < 0) {
            System.out.println("Ошибка: новая длина не может быть отрицательной.");
            return;
        }

        int[] result = new int[newLength];

        for (int i = 0; i < newLength && i < array.length; i++) {
            result[i] = array[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
