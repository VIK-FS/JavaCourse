package lesson12;

public class PrintFormat {
    public static void main(String[] args) {
        double result = 20.0 / 7;
        int age = 25;
        String name = "Alice";

        System.out.println("Name: " + name + ", Age: " + age + ", score: " + result);
        System.out.printf("Name: %s, Age: %d, score: %.3f\n", name, age, result);

        /*
        Место, куда я хочу вставить значение переменной всегда помечается значком %
        %d - целое число
        %f - float число
        %.3f - количество знаков после запятой
        \n - перевод каретки
        %n - работает только в printf

        sout - println
        souf - printf
         */
    }
}
