package lesson_49.hw_lesson_49.validate;

public class PersonValidator {
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
        /*
        пепебираю все символы в строке. Проверяю текущий символ
        Если нахожу хоть один не правильный - возвращаю false
         */
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

    public static void validatePassword(String password) throws PasswordValidateException {
        if (password == null || password.length() < 0) throw new PasswordValidateException("password should be not null");

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

        if (!isLongEnought) throw new PasswordValidateException("Password must be at least 8 characters");
        if (!hasDigit) throw new PasswordValidateException("Password must contain at least one digit");
        if (!hasLowerCase) throw new PasswordValidateException("Password must contain at least one lowercase letter");
        if (!hasUpperCase) throw new PasswordValidateException("Password must contain at least one uppercase letter");
        if (!hasSpecialChar) throw new PasswordValidateException("Password must contain at least one special character");

    }
}
