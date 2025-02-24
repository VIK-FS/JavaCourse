/*
Task 2
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведите ее на печать.
P.S. - правильно выберите типы данных
 */
package lesson12.hw_lesson12;

public class Task_02 {
    public static void main(String[] args) {

        float value1 = 2.0f;
        float value2 = 0.5f;
        float value3 = -1.5f;
        float value4 = -0.5f;
        float value5 = -0.5f;
        float value6 = -1.5f;
        float value7 = -0.5f;

        float averageTemperature = (value1 + value2 + value3 + value4 + value5 + value6 + value7) / 7;

        System.out.printf("Средняя температура за прошедшую неделю: %.2f\n", averageTemperature);

    }
}
