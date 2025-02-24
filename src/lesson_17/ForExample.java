package lesson_17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {
        /*
        for ( <Блок инициализации> ; Блок проверок/ условие выхода ; Блок изменений){
        //Тело цикла
        }
         */

        // 0-10
        int j = 0;
        while (j < 10) {
            System.out.print(j + ", ");
            j++;
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("После цикла for");


        // бесконечный цикл. Ни один из блоков не является обязательным
        /*
        for (; ; ) {
            System.out.println("Hello, world!");
        }
        */

        int i1 = 5;
//        for (i1 = 0; i1 >= 0; i1 +=100_000) {
//            System.out.print(i1 + ", ");
//        }
//        System.out.println(i1);

        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }

        // Мы можем инициализировать и изменять любое кол-во переменных в блоках инициализации
        int k = 14;

        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }

        // создать массив целых чисел случайной длины 5-15
        // и заполнить массив случайными значениями -50  до 50

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[");
        // 0...len-2 -> ", " ; len-1 -> "]\n"
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50;
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
//            if (ints[i] < ints[minIndex]) {
//                minIndex = i;
//            }

        }
//        System.out.print("]");

        int i = 1;

            // Ищем индексы минимального и максимального элементов
        for (i = 0; i < ints.length; i++) {
            if (ints[i] < ints[minIndex]) {
                minIndex = i;
            }
        }

//        for (i = 0; i < ints.length; i++) {
//            if (ints[i] > ints[maxIndex]) {
//                maxIndex = i;
//            }
//        }

            System.out.println("Номер индекса minIndex: " + minIndex);
            System.out.println("Значение индекса minIndex: " + ints[minIndex]);
//        System.out.println("maxIndex: " + ints[maxIndex]);

            // continue, break

        for ( i = 0; i < 7; i++) {
//            if (i == 3) continue; //прервать текущую итерацию цикла и перейти в блок изменений (i++)
//            // Мы перейдем в блок изменений переменных (i++) и потом в блок проверки условия
//            // в текущей итерации все команды прсле continue будут пропущены
            if (i == 3) break;
            System.out.print(i + ", ");

        }
        System.out.println();


    }
}
