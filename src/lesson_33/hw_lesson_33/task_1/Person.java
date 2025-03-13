package lesson_33.hw_lesson_33.task_1;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
//        this.email = email;
//        this.password = password;
    }

    /*
    1. Длина пароля >= 8 символов
    2. Должна быть мин 1 цифра
    3. Должна быть мин 1 маленькая буква
    4. Должна быть мин 1 большая буква
    5. Должна быть мин 1 спец символ: "!%$@&*()[],.-"

    Пароль должен удовлетворять ВСЕМ требованиям сразу.
    5 boolean переменных. Каждая отвечает за свой пункт.
    Пароль будет подходить только если все пять - имеют true


    */


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }
    /*
    test@gmail.com
    1. Должна присуствовать @ и только одна
    2. Точка после собаки
    3. после последней точки есть 2 или более символов
     */

    private boolean isEmailValid(String email) {
        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        // 2. точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3 после последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() - 2) return false;

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
            if (!isPass) return false; // делай что-то, если переменная false
        }

        // 5. До собаки должен быть хотябы один символ
        if (indexAt == 0) return false;

        // 6. Первый символ должен быть буква

        if (!Character.isLetter(email.charAt(0))) return false;


        // все проверки пройдены. Email подходит
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    private boolean isPasswordValid(String password) {

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

        String specialChars = "!%$@&*()[],.-";
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) hasDigit = true;
            if (Character.isLowerCase(ch)) hasLowerCase = true;
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            if (specialChars.indexOf(ch) != -1) hasSpecialChar = true;
        }


        // если все условия выполнены -> return true
        return isLongEnought && hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
