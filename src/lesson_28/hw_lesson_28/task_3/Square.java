package lesson_28.hw_lesson_28.task_3;

public class Square extends Figure{
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public void calculateArea(){
        System.out.printf("%s с длиной стороны %.1f см. имеет площадь %.2f см\u00B2.\n"
                ,getName(),side, side*side);
    }
}
