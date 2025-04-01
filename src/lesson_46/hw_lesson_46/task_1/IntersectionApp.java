/*
Task 1
Пересечение двух карт:
Реализуйте метод, который принимает две карты Map<String, Integer> и возвращает новую карту,
содержащую только те записи, ключи которых присутствуют в обеих исходных картах.

Для совпадающих ключей значение можно брать из любой карты

 Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
Copy
//Output
banana: 20
cherry: 30
 */
package lesson_46.hw_lesson_46.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class IntersectionApp {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Predicate<String> keyInMap2 = key -> map2.containsKey(key);
//        Predicate<String> keyInMap2 = map2::containsKey;


        Map<String, Integer> intersectionMap = intersection(map1, map2);
        System.out.println("intersection(map1, map2):");
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
        Map<String, Integer> intersectionMap1 = intersection(map1, keyInMap2);
        System.out.println("intersection(map1, keyInMap2):");
        intersectionMap1.forEach((key, value) -> System.out.println(key + ": " + value));


    }

    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key));
            }
        }
        return result;
    }

    public static Map<String, Integer> intersection(Map<String, Integer> map1, Predicate<String> predicate) {
        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if (predicate.test(key)) {
                result.put(key, map1.get(key));
            }
        }
        return result;
    }
}
