/*
Task 1
1.	Создайте класс Sportsman с тремя полями: name (имя), аде (возраст) и score (рейтинг).
2.	Реализуйте интерфейс Comparable в классе Sportsman, чтобы задать "естественный" порядок сортировки, например, по name.
3.	Создайте отдельный класс, реализующий Comparator, чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.
4.	В методе main создайте массив из нескольких объектов Sportsman.
5.	Отсортируйте его с использованием:
        естественного порядка, определенного в Comparable,
        данного класса Comparator,
        анонимного класса Comparator для сортировки по третьему полю (например, age).
6.	Выведите каждый вариант отсортированного массива в консоль.
 */
package lesson_42.hw_lesson_42.task_1;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmens = new Sportsman[10];
        sportsmens[0] = new Sportsman("Ronaldo", 39, 200);
        sportsmens[1] = new Sportsman("Messi", 36, 250);
        sportsmens[2] = new Sportsman("Neymar", 31, 180);
        sportsmens[3] = new Sportsman("Mbappe", 25, 220);
        sportsmens[4] = new Sportsman("Lewandowski", 35, 240);
        sportsmens[5] = new Sportsman("Salah", 31, 190);
        sportsmens[6] = new Sportsman("De Bruyne", 32, 210);
        sportsmens[7] = new Sportsman("Kane", 30, 230);
        sportsmens[8] = new Sportsman("Benzema", 35, 250);
        sportsmens[9] = new Sportsman("Suarez", 37, 240);

        System.out.println("==вывод массива(sportsmens)==\n");
        printSportmans(sportsmens);

        System.out.println("\n==Сортировка массива по имени==\n");
        Arrays.sort(sportsmens);
        printSportmans(sportsmens);

        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();
        Arrays.sort(sportsmens, sportsmanScoreComparator);
        System.out.println("\n==Сортировка массива по рейтингу==\n");
        printSportmans(sportsmens);

        System.out.println("\n==Анонимный класс для сортировки по возрасту==\n");

        Arrays.sort(sportsmens, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });

        printSportmans(sportsmens);
    }

    public static void printSportmans(Sportsman[] sportsmens) {
        for (Sportsman sportsman : sportsmens) {
            System.out.println(sportsman);
        }
    }
}
