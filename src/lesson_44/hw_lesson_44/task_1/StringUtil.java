package lesson_44.hw_lesson_44.task_1;

import java.util.*;

public class StringUtil {

    public static List<String> getUniqueSortedWords(String testString) {
        // Заменить все НЕ-буквы на пустоту
        // заменит символ, который не является буквой, цифрой или пробелом - на "" (пустоту)
        String newString = testString.replaceAll("[^a-zA-Za-яА-Я0-9 ]", "");

        // Преобразование строки в массив слов
        // s+ - "пробельный символ в кол-ве 1 шт. или более"
        String[] words = newString.split("\\s+");

        Set<String> set = new HashSet<>(Arrays.asList(words));

        List<String> sortedList = new ArrayList<>(set);

//        sortedList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                int lengthCompare = Integer.compare(s1.length(), s2.length());
//                return (lengthCompare != 0) ? lengthCompare : s1.compareTo(s2);
//            }
//        });

//        sortedList.sort((s1, s2) -> {
//            int lengthCompare = Integer.compare(s1.length(), s2.length());
//            return (lengthCompare != 0) ? lengthCompare : s1.compareTo(s2);
//        });

        sortedList.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        return sortedList;
    }
}
