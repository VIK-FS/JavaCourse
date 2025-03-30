package lesson_44.hw_lesson_44.task_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StrUtil {
    public static char getFirstUniqueChar(String str) {
        List<Character> uniqueChars = new ArrayList<>();
        Set<Character> repeatedChars = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (repeatedChars.contains(c)) {
                continue;
            }
            if (uniqueChars.contains(c)) {
                uniqueChars.remove((Character) c);
                repeatedChars.add(c);
            } else {
                uniqueChars.add(c);
            }
        }

        return uniqueChars.isEmpty() ? '\0' : uniqueChars.get(0);
    }
}
