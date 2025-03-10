package homeworks.hw_29.shapes;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA < 0 || sideB < 0 | sideC < 0) return;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isValidSides(double sideA, double sideB,double sideC) {
        return sideA < sideB + sideC &&
                sideB < sideA + sideC &&
                sideC < sideB + sideA;
    }

    @Override
    public double area(){
        double p2= perimeter();
        double area = Math.sqrt(p2*(p2-sideA)*(p2-sideB)*(p2-sideC));
        return  area;
    }
    @Override
    public double perimeter(){
        return sideA+sideB+sideC;
    }


}
