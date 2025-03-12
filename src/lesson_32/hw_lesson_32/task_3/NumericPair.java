/*
Task 3: Обобщенный класс с ограничениями типов
Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.
Пример использования:
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
 */
package lesson_32.hw_lesson_32.task_3;

public class NumericPair<T extends Number> {
    private T value1;
    private T value2;

    public NumericPair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public double sum(){
        return value1.doubleValue() + value2.doubleValue();
    }

}
