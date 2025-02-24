/*
Task 1
Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4.
Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Выведите на экран значение переменной.
Сколько программа отбросила в остаток при операции деления?
 */
package lesson12.hw_lesson12;

public class Task_01 {
    public static void main(String[] args) {
        int intVar1 = 0;
        int intVar2 = 1;
        int intVar3 = 2;
        int intVar4 = 3;
        int arithmeticMean = (intVar1 + intVar2 + intVar3 + intVar4) / 4;
        int remainderOfDivision = (intVar1 + intVar2 + intVar3 + intVar4) % 4;

        System.out.printf("Значение переменной arithmeticMean: %d\n", arithmeticMean);
        System.out.printf("Программа отбросила в остаток при операции деления: %d\n", remainderOfDivision);
    }
}
