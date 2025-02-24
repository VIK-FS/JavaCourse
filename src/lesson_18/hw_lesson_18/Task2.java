/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
package lesson_18.hw_lesson_18;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String[] strings = {"One", "Java", "Python", "JS", "Hello"};
        String[] result = getArrayWithSmallest(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("=================================");

        strings = null;
        strings = new String[0];
        result = getArrayWithSmallest(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("===============null==================");
        strings = new String[]{"One", "Java", null, "JS", "Hello"};
        result = getArrayWithSmallest(strings);
        System.out.println(Arrays.toString(result));

        System.out.println("===============null=First=============");
        strings = new String[]{null, "One", "Java", "Python", null, "JS", "Hello"};
        result = getArrayWithSmallest(strings);
        System.out.println(Arrays.toString(result));


    }

    public static String[] getArrayWithSmallest(String[] strings) {

        if (strings == null || strings.length == 0) {
            return new String[0];
        }

        String notNullValue = findFirstNotNullValueInArray(strings);
        System.out.println("notNullValue: " + notNullValue);

        if (notNullValue == null){
            System.out.println("Not-Null not found in array");
            return new String[0];
        }
//        String smallest = strings[0];
//        String biggeest = strings[0];

        String smallest = notNullValue;
        String biggeest = notNullValue;



        for (int i = 0; i < strings.length; i++) {

            System.out.println("Текущий: " + strings[i] + ", ");

            if (strings[i] != null && strings[i].length() < smallest.length()) {
                smallest = strings[i];
            }
            if (strings[i] != null && strings[i].length() > biggeest.length()) {
                biggeest = strings[i];
            }

        }
        return new String[]{smallest, biggeest};
    }

    private static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) return strings[i];
        }

        return null;
    }


}
