/*
Task 2
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Copy
Перегрузить метод, если в него приходит массив + индекс,
то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
 */
package lesson_17.hw_lesson_17;

public class Task_02 {
    public static void main(String[] args) {

        int[] intArray = {1, 4, 3, 6, 7};
        reverseSequence(intArray);
        int idx = 2;
        reverseSequence(intArray, idx);

    }

    public static void reverseSequence(int[] intArray) {

        System.out.print("{1, 4, 3, 6, 7} -> распечатывает  [");
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.print(intArray[i] + (i < intArray.length - 1 ? ", " : "} -> "));
//        }

//        System.out.print("[");
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + (i > 0 ? ", " : "]\n"));
        }

//        System.out.print("[");
//        for (int i = 0; i < intArray.length; i++) {
//            int[] revArray = new int[intArray.length];
//            revArray[i] = intArray[(intArray.length - 1) - i];
//            System.out.print(revArray[i] + (i < intArray.length - 1 ? ", " : "]\n"));
//
//        }
    }

    public static void reverseSequence(int[] intArray, int idx) {
        if (idx < 0 || idx >= intArray.length) {
            System.out.println("Ошибка: индекс выходит за пределы массива!");
            return;
        }
        System.out.print("{1, 4, 3, 6, 7} ->  + индекс "+ idx +" -> [");
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.print(intArray[i] + (i < intArray.length - 1 ? ", " : "} -> "));
//        }

//        System.out.print(" + индекс " + idx + " -> [");

        for (int i = 0; i < idx; i++) {
            System.out.print(intArray[i] + ", ");
        }

        for (int i = intArray.length - 1; i >= idx; i--) {
            System.out.print(intArray[i]);
            if (i > idx) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}