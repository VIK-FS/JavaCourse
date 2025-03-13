package homeworks.hw_32.task_3;

public class NumericPair<T extends Number, E extends Number> {
    private T first;
    private E second;

    public NumericPair(T first, E second) {
        this.first = first;
        this.second = second;
    }
    public Double sum(){
        return first.doubleValue() + second.doubleValue();
    }

    public static void main(String[] args) {
//        NumericPair
//        System.out.println(doublePair.sum()); // Bnboa: 10.0 double d = 15;
//        System.out.println(d);
//        NumericPair<Double, Double> doublePair2 =
//                System.out.printin(doublePair2.sum()); //
//        new NumericPair<>(Double.value£f( d: 5), 4.5);
//        Bhboa: 10.0
//        Byte btVal = 10;
//        NumericPair<Number, Byte> OytePair = new
//                NumericPair<>(4.5, btVal) ;|
    }

}
