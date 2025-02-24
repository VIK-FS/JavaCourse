package lesson12;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        Преобразование типов данных
        1. Неявное преобразование (автоматическое)
        2. Явное преобразование (кастинг)
         */

        // Неявное преобразование происходит автоматически

        byte byteVal = 123;
        int intVal;
        intVal = byteVal; // Неявное преобразование типа byte в тип int
        System.out.println("intVal: " + intVal);

        double doubleVal = intVal;
        System.out.println("doubleVal: " + doubleVal);

        // Явное преобразование (кастинг)
        // Требуется, когда нужно преобразовать значения из бОльшего типа данных в меньшее

        double doubleVal2 = 42.9;
        int int1 = (int) doubleVal2;
        System.out.println("doubleVal2: " + doubleVal2);
        System.out.println("int1: " + int1);

        short shortVal = (short) int1;
        System.out.println("shortVal: " + shortVal);

        double bigDouble = 3_000_000_000_000_000_000.00;

        System.out.println("===================================\n");

        //Преобразование в вычислениях
        int x = 20;
        int y = 7;

        double result;
        // 20 / 7 -> 2 (int) неявное преобразование
        result = x / y;
        System.out.println("result: " + result);


        // 20 / 7.0 -> 2 (int) неявное преобразование
        result = x / 7.0;
        System.out.println("double result : " + result);

        /*
        Когда в выражение присутствует несколько типов данных, приводятся к более широкому типу
         */


        result = (float) x / y;
        System.out.println("float result  : " + result);

        result = x / (double) y;
        System.out.println("double result : " + result);

        // Приоритет мат. операций

        int varC = 2 + 8 / 2;
        System.out.println("varC: " + varC);
        /*
        1. Скобки
        2. * / % - Умножение, деления, остаток от деления
        3. '+ -' - Сложение, вычитание
         */

        varC = (2 + 8) / 2;
        System.out.println("varC: " + varC);

        // 2 % 5 -> 0 целых 2 в остатке
        varC = 25 / (2 % 5) * 3;
        System.out.println("varC: " + varC);


    }
}
