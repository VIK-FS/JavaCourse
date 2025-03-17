package lesson_35.hw_lessons_35.task_2;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5.0,3.0);
        Rectangle rec2 = new Rectangle(5.0,3.0);
        Rectangle rec3 = new Rectangle(4.0,2.0);

        System.out.println("rec1.equals(rec2): " + rec1.equals(rec2));
        System.out.println("rec1.equals(rec3): " + rec1.equals(rec3));
        System.out.println("rec1.equals(null): " + rec1.equals(null));
        System.out.println("rec1.equals(Some string ): " + rec1.equals("Some string"));
    }
}
