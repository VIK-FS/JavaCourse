package homeworks.hw_29.shapes;

public class CircleSingleTone extends Shape {

    private static CircleSingleTone instance;
    private double radius;

    private CircleSingleTone(double radius) {
        this.radius = radius;
    }

    public static CircleSingleTone getCircle(double radius) {
        if (radius < 0) return null;
        return new CircleSingleTone(radius);

    }

//     Классический SingleTone
//    public static CircleSingleTone getInstance(double radius){
//        if (instance == null) {
//            instance = new CircleSingleTone(radius);
//        }
//        return instance;
//    }

//    public Circle(double radius) {
//        if (radius < 0) return;
//        this.radius = radius;
//    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    ;

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle{radius=" + radius + "}";
    }
}
