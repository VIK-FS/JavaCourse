/*
Task 1
Написать метод, принимающий на вход строку. Метод должен вывести на экран число,
 соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */
package lesson_17.hw_lesson_17;


public class Task_01 {
    public static void main(String[] args) {
        String str = "hello";
        receivingMethod(str);
    }

    public  static void receivingMethod(String str){
        int lenString = str.length();
        System.out.printf("В метод пришла строка '%s' и в ней '%d' символов.\n",str,lenString);
    }

}

