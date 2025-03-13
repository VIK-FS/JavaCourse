package homeworks.hw_32.task_1;

public class Pair<E> {
    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public void swap() {
        E temp = first;
        first = second;
        second = temp;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "Java");
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }

}
