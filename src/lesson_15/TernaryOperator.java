package lesson_15;

public class TernaryOperator {
    public static void main(String[] args) {

        //Тернарный оператор - краткая форма записи if - else
        //
        //Введите ваш возраст

        int age = 20;
        String status;

        if (age >= 18) {
            status = "Совершеннолетний";
        } else {
            status = "Несовершеннолетний";
        }
        System.out.println(status);

        // переменная = (условие) ? значение_если_True : значение_если_FALSE
        String result = (age >= 18) ? "Совершеннолетний" : "Несовершеннолетний";
        System.out.println("result " + result);

        int x = 20;

        System.out.println("Значение в переменной х: " + ((x >= 0) ? "положительное" : "отрицательное"));


    }
}
