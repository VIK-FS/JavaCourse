
package lesson_32.hw_lesson_32.task_1;

public class PairApp {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");

        System.out.println(pair.getFirst()); // Вывод: Hello
        System.out.println(pair.getSecond()); // Вывод: World

        pair.swap();

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
