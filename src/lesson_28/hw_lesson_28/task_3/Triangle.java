    package lesson_28.hw_lesson_28.task_3;

    public class Triangle extends Figure {
        private double leg1;
        private double leg2;

        public Triangle(String name, double leg1, double leg2) {
            super(name);
            this.leg1 = leg1;
            this.leg2 = leg2;
        }

        @Override
        public void calculateArea() {
            System.out.printf("%s с катетами %.1f см. и %.1f см. имеет площадь %.2f см\u00B2.\n"
                    , getName(), leg1, leg2,(leg2 * leg1)/2);
        }
    }
