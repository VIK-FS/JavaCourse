package homeworks.hw_29.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        Circle circle = new Circle(-10);
        System.out.println(circle);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 20);
        shapes[2] = new Triangle(3, 4, 5);

    double sumArea = 0;
    double sumPerimeter = 0;


        for (int i = 0; i < shapes.length; i++) {
            double area = shapes[i].area();
            double perimeter = shapes[i].perimeter();
            System.out.printf("%s площадь: %.2f; периметр: %.2f\n", shapes[i] .getClass(), perimeter, area);
            sumArea += shapes[i].area();
            sumPerimeter += shapes[i].perimeter();
            System.out.println("==================== \n");
        }
        System.out.printf("Сумма площадей: %.2f\n", sumArea);
        System.out.printf("Сумма периметров: %.2f\n", sumPerimeter);

        System.out.println("========================================");

//        CircleSingleTone circleSingleTone

        CircleSingleTone single =  CircleSingleTone.getCircle(-5);
        System.out.println(single);

        CircleSingleTone circleSingle = CircleSingleTone.getCircle(-10);
        System.out.println(single);


    }



}
