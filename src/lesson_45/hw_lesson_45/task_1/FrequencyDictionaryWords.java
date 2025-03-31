/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста
и возвращает Map<String, Integer>, где каждому слову соответствует 
количество его вхождений в текст.
 */
package lesson_45.hw_lesson_45.task_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyDictionaryWords {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \\\"строка\\\" для " +
                "удаления! Тестовая строка для удаления слов.";
        System.out.println("Тетовая входная строка: " + testString);

        Map<String, Integer> frequencyMap = quantityEntry(testString);
        printFrequencyMap(frequencyMap);

    }

    private static Map<String, Integer> quantityEntry(String string) {
        String[] words = string.replaceAll("[^а-яА-Яa-zA-Z0-9 ]", "").split("\\s+");

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    private static void printFrequencyMap(Map<String, Integer> map) {
        System.out.println("\"Частотный словарь слов: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%-11s -> %d\n", entry.getKey(), entry.getValue());
        }
    }


}
