/*
Task 3
Опционально
Написать метод, возвращающий первый неповторяющийся символ в строке

public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(StrUtil.getFirstUniqueChar(string));
    }

    //Output:
    e

 */
package lesson_44.hw_lesson_44.task_3;

public class StrUtilApp {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = new String("abcdefj ab,cdf,");
        strings[1] = new String("aabbccddeeff");
        strings[2] = new String("xyzxyzpq");

        for (String string : strings) {
            char result = StrUtil.getFirstUniqueChar(string);
            if (result == '\0') {
                System.out.printf("В строке \"%-46s\" : нет уникальных символов\n", string);
            } else {
                System.out.printf("Первый неповторяющийся символ в строке \"%-16s\" : '%s'\n", string, result);
            }
        }
    }
}
