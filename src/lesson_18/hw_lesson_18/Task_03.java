/*
Task 3 * (Опционально)
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */
package lesson_18.hw_lesson_18;

public class Task_03 {
    public static void main(String[] args) {
        int[] numbers = new int[]{0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] primeNumbers = findOnlyPrimeNumbers(numbers);

        System.out.print("Простые числа в изначальном массиве: ");
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.print(primeNumbers[i] + " ");
        }

    }

    public static int[] findOnlyPrimeNumbers(int[] numbers) {
        int[] tempArray = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                tempArray[index] = num;
                index++;
            }
        }

        int[] primeInts = new int[index];
        for (int i = 0; i < index; i++) {
            primeInts[i] = tempArray[i];
        }

        return primeInts;
    }

}
