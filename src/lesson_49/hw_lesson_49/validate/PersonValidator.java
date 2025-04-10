package lesson_49.hw_lesson_49.validate;

import java.util.ArrayList;
import java.util.List;

public class PersonValidator {

/*
    public static void validateEmail(String email)throws EmailValidateException {

        // throw - Ключевое слово используется для явного выброса исключения
        // (создание)
        if (email == null) throw new EmailValidateException("email should be not null");

//            if (email == null || email.length() < 0) return false;
        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) throw new EmailValidateException("@ error");

        // 2. точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

        // 3 после последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) throw new EmailValidateException("last . error");

        // 4. Проверка символов
//
//        пепебираю все символы в строке. Проверяю текущий символ
//        Если нахожу хоть один не правильный - возвращаю false
//
    // String.toCharArray() -> char[]
        for (char ch : email.toCharArray()) {
        // проверка символов на правилльность
        boolean isPass = Character.isAlphabetic(ch)
                || Character.isDigit(ch)
                || ch == '-'
                || ch == '_'
                || ch == '.'
                || ch == '@';
        // Если символ не подходит (isPass = false) возвращаем false
        if (!isPass) throw new EmailValidateException("Illegal symbol"); // делай что-то, если переменная false
    }

    // 5. До собаки должен быть хотябы один символ
        if (indexAt == 0) throw new EmailValidateException("@ should be not first");

    // 6. Первый символ должен быть буква

        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");


    // все проверки пройдены. Email подходит


}
*/

    public static void validateEmail(String email) throws EmailValidateException {
        List<String> errors = new ArrayList<>();

        if (email == null) {
            throw new EmailValidateException("Email must not be null");
        }

        if (email.length() < 7 || email.length() > 254) {
            errors.add("Email length must be between 7 and 254 characters");
        }

        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');

        if (indexAt == -1) {
            errors.add("Email must contain '@' character");
        } else if (indexAt != lastAt) {
            errors.add("Email must contain only one '@'");
        } else {
            // '@' есть и он один
            if (indexAt == 0 || indexAt == email.length() - 1) {
                errors.add("'@' must not be the first or last character");
            }

            int dotAfterAt = email.indexOf('.', indexAt + 1);
            if (dotAfterAt == -1) {
                errors.add("Email must contain '.' after '@'");
            }

            String domain = email.substring(indexAt + 1);
            if (domain.startsWith("-") || domain.startsWith(".") || domain.endsWith("-") || domain.endsWith(".")) {
                errors.add("Domain must not start or end with '-' or '.'");
            }
        }

        int lastDot = email.lastIndexOf('.');
        if (lastDot != -1) {
            int domainLength = email.length() - lastDot - 1;
            if (domainLength < 2 || domainLength > 63) {
                errors.add("Domain must have between 2 and 63 characters after the last dot");
            }
        }

        if (!email.matches("^[a-zA-Z0-9@._-]+$")) {
            errors.add("Email contains invalid characters. Only letters, digits, @, ., _, - are allowed");
        }

        char firstChar = email.charAt(0);
        if (!Character.isLetterOrDigit(firstChar)) {
            errors.add("First character must be a letter or digit");
        }

        if (email.contains("..")) {
            errors.add("Email must not contain consecutive dots ('..')");
        }

        if (email.contains(" ")) {
            errors.add("Email must not contain spaces");
        }

        if (email.chars().noneMatch(codePoint -> Character.isLetterOrDigit(codePoint))) {
            errors.add("Email must contain at least one letter or digit");
        }

        if (!errors.isEmpty()) {
            throw new EmailValidateException(String.join("\n", errors));
        }
    }


    public static void validatePassword(String password) throws PasswordValidateException {
        List<String> errors = new ArrayList<>();

        if (password == null || password.length() < 0)
            throw new PasswordValidateException("password should be not null");

//    1. Длина пароля >= 8
//    2. Должна быть мин 1 цифра
//    3. Должна быть мин 1 маленькая буква -> Character.isLowerCase()
//    4. Должна быть мин 1 большая буква
//    5. Должна быть мин 1 специальный символ: "!%$@&*()[],.-"

        boolean isLongEnought = password.length() >= 8;
        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        // альтернативный способ объявления переменных
//        boolean[] result = new boolean[4]; // false, false, false, false


        String specialChars = "!%$@&*()[],.-";
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) hasDigit = true;
            if (Character.isLowerCase(ch)) hasLowerCase = true;
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            if (specialChars.indexOf(ch) != -1) hasSpecialChar = true;
        }
//        System.out.printf("%s | %s | %s | %s\n", hasDigit, hasLowerCase, hasUpperCase, hasSpecialChar);

        // если все условия выполнены -> return true
//        return isLongEnought && hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;
/*
        if (!isLongEnought) throw new PasswordValidateException("Password must be at least 8 characters");
        if (!hasDigit) throw new PasswordValidateException("Password must contain at least one digit");
        if (!hasLowerCase) throw new PasswordValidateException("Password must contain at least one lowercase letter");
        if (!hasUpperCase) throw new PasswordValidateException("Password must contain at least one uppercase letter");
        if (!hasSpecialChar) throw new PasswordValidateException("Password must contain at least one special character");
*/
        if (!isLongEnought) errors.add("Password must be at least 8 characters");
        if (!hasDigit) errors.add("Password must contain at least one digit");
        if (!hasLowerCase) errors.add("Password must contain at least one lowercase letter");
        if (!hasUpperCase) errors.add("Password must contain at least one uppercase letter");
        if (!hasSpecialChar) errors.add("Password must contain at least one special character (!%$@&*()[],.-)");

        if (!errors.isEmpty()) {
            throw new PasswordValidateException(String.join("\n", errors));
        }
    }
}
