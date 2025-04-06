package lesson_49.hw_lesson_49.validate;

public class PasswordValidateException extends RuntimeException {

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | " + super.getMessage();
    }

}

