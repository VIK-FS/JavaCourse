package lesson_49.hw_lesson_49.validate;

// extends RuntimeException = для непроверяемых исключений
// extends Exceptions - для проверяемых исключений
public class EmailValidateException extends RuntimeException {
    /*
    getMessage() - возвращает строку с коротким описанием исключения
    getCause() - возвращает исключение, которое вызвало текущее исключение
    toString() - строковое представление исключения
    printStackTrace() - выводит трассировку исключения

      */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }


}
