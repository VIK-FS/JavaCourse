/*
Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.

Проверьте:
равны ли переменные,
не равны ли они,
больше ли a, чем b,
и меньше ли b, чем a.

Выведите результат на экран.
 */
package lesson_14.hw_lesson_14;

public class Task_02 {
    public static void main(String[] args) {
        double randomD = Math.random();
        int value1 = 51;
        int value2 = 101;
        int randomI1 = (int) (randomD * value1);
        int randomI2 = (int) (randomD * value2);

        boolean isEquals = randomI1 == randomI2;
        boolean isNotEquals = randomI1 != randomI2;
        boolean isMore = randomI1 > randomI2;
        boolean isLess = randomI2 < randomI1;

        System.out.printf("Равны ли переменные '%d' и '%d': %b \n",randomI1,randomI2,isEquals);
        System.out.printf("Не равны ли переменные '%d' и '%d': %b \n",randomI1,randomI2,isNotEquals);
        System.out.printf("Больше ли '%d' чем '%d': %b \n",randomI1,randomI2,isMore);
        System.out.printf("Меньще ли '%d' чем '%d': %b \n",randomI2,randomI1,isLess);

        System.out.printf("В  первую переменную 'randomI1' записано случайное значение: '%d' от 0 до 50\n", randomI1);
        System.out.printf("Во вторую переменную 'randomI2' записано случайное значение: '%d' от 0 до 100\n", randomI2);


//        (опционально) Во вторую переменную случайное значение от -20 до 30.
        int min = -20;
        int max = 30;

        randomI2 = (int) (Math.random() * (max - min + 1) + min);
        System.out.printf("Во вторую переменную 'randomI2' записано случайное значение: '%d' от '%d' до '%d'\n"
                , randomI2
                , min
                , max);


    }
}
