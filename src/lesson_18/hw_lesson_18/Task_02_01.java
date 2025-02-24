package lesson_18.hw_lesson_18;

public class Task_02_01 {
    public static void main(String[] args) {
        String[] strArray = new String[]{null, "Three", null, "Two", "Four", "Five", "Eleven", "Six", "Seven"};
//        String[] strArray;
//        String[] strArray = new String[]{null,null, null,null, null, null, null, null, null};
        String[] resultStrArray = findOfShortestAndLongestStr(strArray);

        System.out.println("Самая короткая строка изначального массива: " + resultStrArray[0]);
        System.out.println("Самая длинная строка изначального массива : " + resultStrArray[1]);
    }

    public static String[] findOfShortestAndLongestStr(String[] strArray) {
        if (strArray == null || strArray.length == 0) {
            return new String[]{"", ""};
        }

        String longest = null;
        String shortest = null;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == null) {
                continue;
            }
                System.out.println("strArray[i]" + strArray[i]);

            if (shortest == null || strArray[i].length() < shortest.length()) {
                shortest = strArray[i];
            }

            if (longest == null || strArray[i].length() > longest.length()) {
                longest = strArray[i];
            }
        }

        if (shortest == null) shortest = "";
        if (longest == null) longest = "";

        return new String[]{shortest, longest};
    }
}

