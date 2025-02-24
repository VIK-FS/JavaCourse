package lesson12;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 5;
        x = x + 10;

        x += 5;
        System.out.println("x: " + x);

        x -= 2;
        x *= 2;
        x /= 5;
        System.out.println("x: " + x);

//        Инкремент
        x++; // x = x + 1; x += 1;
        System.out.println("19 строка: " + x);

        //        Декремент
        x--; // x = x - 1; x -= 1;
        System.out.println("x: " + x);

        System.out.println("==========================================\n");

        /*
        Инкремент и декремент можно записпть по разному:
        после переменной х++, х-- (постфикс)
        перед переменной ++х, --х (префикс)

         */
        int var = 100;
        System.out.println("var: " + var++ + var);
        System.out.println("var: " + var);

        int y = 100;
        System.out.println("y: " + ++y + y);
        System.out.println("y: " + y);


    }
}
