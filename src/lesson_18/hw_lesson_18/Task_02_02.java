package lesson_18.hw_lesson_18;

public class Task_02_02 {
    public static void main(String[] args) {
//        String[] strArray = new String[]{null, "Three", null, "Two", "Four", "Five", "Eleven", "Six", "Seven"};
        String[] strArray = new String[]{};
//        String[] strArray = new String[]{null,null, null,null, null, null, null, null, null};
        String[] resultStrArray = findOfShortestAndLongestStr(strArray);

        if (strArray != null && strArray.length != 0) {
            System.out.println("Самая короткая строка изначального массива: " + resultStrArray[0]);
            System.out.println("Самая длинная строка изначального массива : " + resultStrArray[1]);
        } else if (strArray == null){
            System.out.println("Массив == null.");
        }else {
            System.out.println("Длина массива равна нулю");
        }
    }

    public static String[] findOfShortestAndLongestStr(String[] strArray) {
        if (strArray == null || strArray.length == 0) {
            return new String[]{"", ""};
        }

        String shortest = null;
        String longest = null;

        // Найдем первую не-null строку для инициализации
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] != null) {
                shortest = strArray[i];
                longest = strArray[i];
                break;
            }
        }

        // Если в массиве нет ни одной не-null строки
        if (shortest == null) {
            return new String[]{"", ""};
        }

        // Основной цикл для поиска короткой и длинной строк
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] == null) {
                continue;
            }

            if (strArray[i].length() < shortest.length()) {
                shortest = strArray[i];
            }

            if (strArray[i].length() > longest.length()) {
                longest = strArray[i];
            }
        }

        return new String[]{shortest, longest};
    }

}
