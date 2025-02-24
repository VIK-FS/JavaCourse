/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
package lesson_18.hw_lesson_18;

public class Task_02 {
    public static void main(String[] args) {
        String[] strArray = new String[]{null, "Three", null, "Two", "Four", "Five", "Eleven", "Six", "Seven"};
        String[] resultStrArray = findOfShortestAndLongestStr(strArray);

        System.out.println("Самая короткая строка изначального массива: " + resultStrArray[0]);
        System.out.println("Самая длинная строка изначального массива : " + resultStrArray[1]);

    }

    public static String[] findOfShortestAndLongestStr(String[] strArray) {
        if (strArray == null || strArray.length == 0) {
            return new String[]{"", ""};
        }
        String Longest = strArray[0];
        String Shortest = strArray[0];
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() < Shortest.length()) {
                Shortest = strArray[i];
            }
            if (strArray[i].length() > Longest.length()) {
                Longest = strArray[i];
            }
        }
        return new String[]{Shortest, Longest};
    }
}
