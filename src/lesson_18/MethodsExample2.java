package lesson_18;

public class MethodsExample2 {
    public static void main(String[] args) {

        int temp = 55;
        changeMe(temp);

        System.out.println(temp);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(numbers);
        changeMe(numbers);
        printArray(numbers);

        int[] link2 = numbers;
        link2[2] = -100;

        System.out.print("numbers: ");
        printArray(numbers);
        System.out.print("link2: ");
        printArray(link2);

        // null
        numbers = null;
//        printArray(null);

//        numbers[0] = 10; // ошибка возникает во время работы программы
        // нельзя взять 0 элемент у ничего
//        System.out.println(numbers.length);// Тоже NPE ошибка

        link2[9] = 0;
        printArray(link2);

        numbers = new int[]{10, 20, 30};
        System.out.print("numbers: ");
        printArray(numbers);

        String hello = "Hello";
        changeMe(hello);
        System.out.println("hello main: " + hello);

        String str2 = hello.toUpperCase();
        System.out.println("str2: " + str2);
        System.out.println("hello: " + hello);


    } // Methods area

    public static void changeMe(String str) {
        System.out.println("method str start value: " + str);
        str = str + "!!!";
        System.out.println("str method: " + str);

    }


    public static void changeMe(int[] array) {
        array[0] = 1000;


    }

    public static void changeMe(int x) {

        x = 100;
    }


    // Метод выводящий целые числа
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : "]\n"));//(i != array.length - 1 ? ", " : "]\n")

        }
    }


}// End class
