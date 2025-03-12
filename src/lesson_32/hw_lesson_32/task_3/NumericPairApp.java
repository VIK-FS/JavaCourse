package lesson_32.hw_lesson_32.task_3;

public class NumericPairApp {
    public static void main(String[] args) {
        NumericPair<Integer> intPair = new NumericPair<>(10,20);
        System.out.println(intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(5.5,4.5);
        System.out.println(doublePair.sum());
    }
}
