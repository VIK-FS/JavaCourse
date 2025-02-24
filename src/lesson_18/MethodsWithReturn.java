package lesson_18;

public class MethodsWithReturn {
    public static void main(String[] args) {

        // возвращаемое значение - это результат, который метод отправляет обратно вызывающему его (методу) коду
        //
//        int sum = 10 + 5;
        calculeSum(10, 5);
        int sum = calculeSum(10, 5);
//        System.out.println("result: " + sum); // -> int sum =15
        sum = calculeSum(10, 5) + calculeSum(20, 30);
        int pow = (int) powTwo(3);
        System.out.println("powTwo(3): " + powTwo(0));
        System.out.println("powTwo(3): " + (int) powTwo(3));
        System.out.println("powTwo(3): " + powTwo(-3));
//        test(5);


    }// Methods area

    public static void test(int x) {
        // НЕ печатать числа, если х = 3
        if (x == 3) {
            // как-то прервать работу
            return; // прекращает работу метода.

        }

        // 0 - x
        for (int i = 0; i < x; i++) {
            System.out.print(i + ", ");
        }
    }

    // написать метод возвращающий 2 в степени х
    public static double powTwo(int x) {
        // 2 ^ x
        // 2 ^ 3 = 2*2*2 = 8

        boolean isPositive = x >= 0;
        // если х отрицательный  - отбросить знак числа
        if (x < 0) x *= (-1);

        double result = 1;
        // x = 2
        for (int i = 1; i <= x; i++) {
            result *= 2;
        }

        if (isPositive) {
            return result;
        } else {
            // 1 / 4.0
            return 1 / result;
        }

    }


    public static int calculeSum(int a, int b) {
        int result = a + b;
        System.out.println("result: " + result);
        return result;
    }


}
