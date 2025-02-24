/*
Task 2
1.Создайте строки:
    "Java"
    "is"
    "a"
    "powerful"
    "language"
2. Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
3. Выведите на экран получившуюся строку и её длину.
 */
package lesson13.hw_lesson13;

public class Task_02 {
    public static void main(String[] args) {
        String strJava = "Java";
        String strIs = "is";
        String strA = "a";
        String strPowerful = "powerful";
        String strLanguage = "language";


        String concatStr = strJava.concat(" ")
                .concat(strIs).concat(" ")
                .concat(strA).concat(" ")
                .concat(strPowerful).concat(" ")
                .concat(strLanguage);
        System.out.printf("Первый способ получения строки: %s\n", concatStr);

        // Второй способ получения строки

        concatStr = String.join(" ", "Java", "is", "a", "powerful", "language");
        System.out.printf("Второй способ получения строки: %s\n", concatStr);

        System.out.println("Длина получившейся строки '" + concatStr + "': " + concatStr.length());
        /*
        Task 2.2
        1. Замените в результирующей строке слово "powerful" на "super".
        2. Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        3.Выведите на экран значение этой переменной.
         */

        String replStr = concatStr.replace("powerful", "super");
        boolean bol = replStr.contains("age");

        System.out.printf("После замены слова 'powerful' на 'super' результирующая строка стала '%s' \n", replStr);
        System.out.printf("содержит ли строка '%s' подстроку 'age' ? %b\n", replStr,bol);
    }
}
