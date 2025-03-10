package homeworks.hw_29.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) return;
        this.radius = radius;
    }

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
