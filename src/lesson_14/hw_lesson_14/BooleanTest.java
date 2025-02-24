/*
Task 4
Дан следующий код. Вашей задачей является предсказать, какой вывод будет напечатан в консоли после выполнения программы.

public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
    }
}
Copy
Предскажите, что будет выведено на консоль для Result 1 до Result 5. Объясните кратко свой ответ.
/*
Result 1: true ((8 + 3) > 10)
Result 2: true (8 - 3) == 5
Result 3: false (8 * 3) != 24
Result 4: true ((8 / 3) -> 2) >= 2
Result 5: false !((8 % 3) -> 2) == 2
 */

package lesson_14.hw_lesson_14;

public class BooleanTest {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        boolean result;

        result = (a + b) > 10;
        System.out.println("Result 1: " + result);

        result = (a - b) == 5;
        System.out.println("Result 2: " + result);

        result = (a * b) != 24;
        System.out.println("Result 3: " + result);

        result = (a / b) >= 2;
        System.out.println("Result 4: " + result);

        result = !(a % b == 2);
        System.out.println("Result 5: " + result);
    }

}
