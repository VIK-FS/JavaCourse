/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны.
В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */
package lesson_18.hw_lesson_18;

public class Task_01 {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6};
        int lengthArray = 3;

        arraySpecifiedLength(numbers, lengthArray);
    }

    public static void arraySpecifiedLength(int[] numbers, int lengthArray) {
        System.out.print("{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array," + lengthArray + ") -> вывод на печать {");
        int[] copyOfArray = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            if (i < numbers.length) {
                copyOfArray[i] = numbers[i];
            } else {
                copyOfArray[i] = 0;
            }
            System.out.print(copyOfArray[i] + (i < lengthArray - 1 ? ", " : "}\n"));

        }
    }

}
