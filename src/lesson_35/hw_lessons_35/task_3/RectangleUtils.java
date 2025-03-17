package lesson_35.hw_lessons_35.task_3;

public class RectangleUtils {
    public static void removeDuplicates(MyList<Rectangle> list, Rectangle rectangle) {
        boolean firstFound = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(rectangle)) {
                if (!firstFound) {
                    firstFound = true;
                } else {
                    list.remove(i);
                    i--;
                }
            }
        }
    }
}
