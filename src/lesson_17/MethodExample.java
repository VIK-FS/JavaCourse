package lesson_17;

public class MethodExample {
    public static void main(String[] args) {
        sayHello();

        char ch = 'A';
        printDecimalCodeOfChar(ch);
        char anotherChar = 'B';
        printDecimalCodeOfChar(anotherChar);
        printDecimalCodeOfChar('6');


        int[] array = {1, 45, 76, 54, 980, 435, 9, 0};
        printArray(array);
        int[] array2 = {8, 49, 589, 7589, 980, 4535, 999, 250};
        printArray(array2);

        array[3] = 1001;
        array[0] = 100_000;

        printArray(array);

        String[] strings = {"Hello", "Java", "Test", "World"};

        printArray(strings);

        testParametrOrder(1,"Hello");
        testParametrOrder("Java", 200);
    } //Method area (место написания метода)


    /*
    В пределах одного класса может быть два и более методов с одинаковым именем,
    но разным набором параметров (тип и порядок параметров имеет значение
     */

    public static void testParametrOrder(int x, String str) {
        System.out.println("INT + STRING: " + x + " | " + str);
    }

    public static void testParametrOrder(String str, int y) {
        System.out.println("Другое поведение: " + str + " | " + y);
    }


    // Метод выводящий строки

    public static void printArray(String[] strings) {
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + (i == strings.length - 1 ? "]\n" : ", "));
        }
    }


    // Метод выводящий целые числа
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : "]\n"));//(i != array.length - 1 ? ", " : "]\n")

        }
    }

    public static void printDecimalCodeOfChar(char ch1) {
        // char ch1 = ch (из аргумента вызова) - условно выролняемая строка  при вызове метода
        // перед началом работы метода
        System.out.println((int) ch1);
    }

    public static void sayHello() {
        //тело метода
        System.out.println("Hello World!");
    }


}
