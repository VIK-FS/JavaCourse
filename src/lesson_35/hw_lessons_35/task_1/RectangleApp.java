package lesson_35.hw_lessons_35.task_1;

public class RectangleApp {
    public static void main(String[] args) {

        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(2,5);
        rectangles[2] = new Rectangle(8,3);
        rectangles[3] = new Rectangle(10,10);

        for (Rectangle rectangle : rectangles) {
            System.out.printf("%s\n", rectangle);
//            System.out.printf("%-39s| адрес: %s \n", rectangle, rectangles.toString());
        }
    }
}
