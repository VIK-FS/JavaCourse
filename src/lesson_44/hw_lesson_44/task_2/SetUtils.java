package lesson_44.hw_lesson_44.task_2;

import java.util.HashSet;
import java.util.Set;

public class SetUtils {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2){
       Set<T> result = new HashSet<>(set1);
       result.retainAll(set2);
       return result;
    }

    public static <T> Set<T> difference(Set<T> set1, Set<T> set2 ){
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
