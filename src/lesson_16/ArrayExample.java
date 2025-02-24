package lesson_16;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        int x;
        x = 10;


        int[] array;// объявление массива целых чисел
        int array1[];// Альтернативный способ объявления.
        String[] strings; // массив строк.

        array = new int[4];
        strings = new String[10];// массив строк на 10 ячеек

        int[] array2 = new int[8];
        boolean[] bools = new boolean[3];
        /*
        значения по умолчанию для int
        1. для всех числовых типов (0/0.0)
        2. для boolean - false
        3. для String - Null
         */

        //Получить из массива значение, находящееся в ячейке с индексом 0.
        int value = array2[0];
        System.out.println("array2[0]: " + value);//0
        System.out.println("array2[7]: " + array2[7]);//0
        System.out.println("bools[1]: " + bools[1]);//false
        System.out.println("strings[7]: " + strings[7]);//null

        System.out.println("x: " + x);

        System.out.println(array2);

        //Явная инициализация массива значениями
        int[] numbers = new int[]{45, 45, 16, 0, 159};
        int[] ints = {-10, 54, 32, 333, 444};

        int val = numbers[0];
        System.out.println("numbers[0]: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100; // новое значение 100 вместо 16
        int len = numbers.length;// длина массива/количество элементов в массиве
        System.out.println("numbers.length: " + len);


//        System.out.println(array2[0-7]);
        System.out.println("Вывести все элементы массива");
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + ", ");
            i++;
        }
        System.out.println();

        // Создать массив на 10 эл. и заполнить его случайными числами от 0 до 100 включительно
        Random random = new Random();

        int[] num = new int[10];
        i = 0;
        System.out.print("[");
        while (i < num.length) {
            num[i] = random.nextInt(101);
            System.out.print(num[i] + ", ");
            i++;
        }
        System.out.println("]");

        // найти min в массиве

        // Находим минимальное число
        int min = num[0]; // Берём первый элемент за минимум
        i = 1; // Начинаем проверку со второго элемента
        while (i < num.length) {
            if (num[i] < min) {
                min = num[i];
            }
            i++;
        }

        System.out.println("Минимальное число: " + min);


        int min1 = num[0];
        i = 0;
        while (i < num.length) {
            if (num[i] < min1) {
                min1 = num[i];
            }
            i++;
        }
        System.out.println("Минимальное число: " + min1);
    }
}
