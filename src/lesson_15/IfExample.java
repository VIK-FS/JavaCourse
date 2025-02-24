package lesson_15;
//
import java.util.Random;
import java.util.Scanner; // del - Ctrl + Alt + O

public class IfExample {
    public static void main(String[] args) {
        // Условный оператор if - позволяет выборочно выполнять отдельные части программы (блоки кода)
        // if (условие) оператор;
        //

        // if (условие) {
        //
        // }

        int age = 5;

        if (age > 18) System.out.println("Вы совершеннолетний");
        else System.out.println("Вам меньше 18");

        System.out.println("Продолжение программы ");

        if (age > 11) {
            System.out.println("Блок IF");
            System.out.println("Вы уже не ребёнок");
        } else {
            // Блок который выполнится когда условие выдаст false
            System.out.println("Блок ELSE");
            System.out.println("Сейчас age = " + age);
        }

        Random rand = new Random();

        int score = rand.nextInt(101);

        if (score >= 90) {
            System.out.println("Супер! " + score);
        } else if (score >= 75) {
            System.out.println("Хорошо! " + score);
        } else if (score >= 50) {
            System.out.println("Удовлетворительно " + score);
        } else {
            System.out.println("Плохо! " + score);
        }

        System.out.println("Продолжение программы ");

        // Нахождение минимального значения из несколько чисел
        int v1 = rand.nextInt(51); // 0...50
        int v2 = rand.nextInt(51);//
        int v3 = rand.nextInt(51); //

        int r4 = rand.nextInt(101) - 20;
//        r4 = random.nextInt(10,70) // Java 17

        System.out.println(v1 + "|" + v2 + "|" + v3);

        int min = v1;
        if (v2 < min) {
            min = v2;
        }
        if (v3 < min) min = v3;

        System.out.println("min: " + min);



    }
}
