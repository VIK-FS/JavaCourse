/*
Task4 * (Опционально)
Final параметр метода
•	Напишите метод printMessage(final String message), который выводит сообщение на экран.
•	Попробуйте изменить значение параметра message внутри метода.
•	Объясните результат и поведение компилятора.
 */
package lesson_25.hw_lesson_25.task_04;

public class FinalString {
    private final String message;

    public FinalString(final String message) {
        this.message = message;
    }

    void printMessage(final String message) {
//        message = "New Hello, World!"; //java: final parameter message may not be assigned
    /*
    В строке с комментарием message = "New Hello, World!"; мы пытаемся изменить значение параметра message,
     который был объявлен как final. Это вызывает ошибку компиляции, так как компилятор запрещает
     изменение значений final параметров.
     Когда мы объявляем параметр метода как final, это только означает,
     что переменная не может быть переназначена внутри метода.
     Однако это не значит, что сам объект, на который указывает ссылка, тоже не может быть изменен (если это объект).
     В данном случае мы не пытаемся изменить объект, а пытаемся переназначить саму переменную message,
     что и запрещает компилятор.
     */
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        FinalString finalString = new FinalString("Hello!");
        finalString.printMessage("Hello, World!");
    }
}
