package lesson_14;

import javax.sound.midi.Soundbank;

public class BooleanExample {
    public static void main(String[] args) {
        boolean bol1 = true;
        bol1 = false;

        System.out.println(bol1);

        int x = 10;
        int y = 5;

        boolean b1 = x == y;
        System.out.printf("%s == %s -> %s\n", x, y, b1);

        b1 = x != y;
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        // больше >
        b1 = x > y;
        System.out.printf("%s > %s -> %b\n", x, y, b1);

        y = 10;
        b1 = x > y;
        System.out.printf("%s > %s -> %s\n", x, y, b1);

        // больше или равно >=

//        y = 10;
        b1 = x >= y;
        System.out.printf("%s >= %s -> %s\n", x, y, b1);

        // меньше <
        x = 7;
        b1 = x < y;
        System.out.printf("%s < %s -> %b\n", x, y, b1);

        // меньше или равно <=
//        x = 7;
        b1 = x <= y;
        System.out.printf("%s <= %s -> %b\n", x, y, b1);

        String str = "Java is the best";
        // Поиск вхождения подстроки
        // contains -
        boolean contains = str.contains("Java");// строка str содержит последовательность символов (подстроку)
        System.out.println("str.contains(\"Java\"): " + contains);
        System.out.println("str.contains(\"Java\"): " + str.concat("java"));

        //
        boolean startsWith = str.startsWith("Ja");
        System.out.println("str.startsWith(\"Ja\"): " + startsWith);
        System.out.println("str.startsWith(\"ava\"): " + str.startsWith("ava"));
        System.out.println("tr.contains(\"is t\")" + str.contains("is t"));

        // Rename - Shift + F6

        boolean endsWith = str.endsWith("best");
        System.out.println("str.endsWith(\"best\"): " + endsWith);
        System.out.println("str.endsWith(\"Java\"): " + str.endsWith("Java"));

        System.out.println("===============Логические операции==================\n");


        boolean b2 = !false;
        System.out.println("!false: " + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5): " + b2);

        // Составные сравнения - два условия
        /*
        Логическое И - &
         */

        b2 = true & true;
        System.out.println("true & true: " + b2);


        int input = 50;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 100: " + b2);
        input = 150;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 150: " + b2);

//        Логическое ИЛИ - "|"
        //достаточно   1  истинно

        b2 = true | true;
        System.out.println("true & true: " + b2);
        System.out.println("true  | true:   " + (true | true));
        System.out.println("true  | false:  " + (true | false));
        System.out.println("false | false: " + (false | false));
        System.out.println("false | false: " + (false | false));


//        Логическое исключающее ИЛИ  (XOR)- "^"
        b2 = true ^ false;
        System.out.println("true  ^ false: " + b2);
        System.out.println("false ^ true:  " + (false ^ true));
        System.out.println("true  ^ true:  " + (true ^ true));
        System.out.println("false ^ false: " + (false ^ false));


//        Логическое сокращенное И - &&
        // Выдает true только если обе части выражения возвращают true

        b2 = true && true;
        System.out.println("true && true: " + b2);
        System.out.println("false && true: " + (false && true));

        int a = 10;
        int b = 0;

        // b = 0; 0 != 0 -> false
        // false && ? -> false


        boolean bol = (b != 0) && a / b > 2;
        System.out.println("bol: " + bol);
//        boolean bolFull = (b != 0) & a / b > 2; //
//        System.out.println("bolFull: " +bolFull);

        b = 1;
        bol = (b != 0) && a / b > 2;
        System.out.println("bol: " + bol);
        System.out.println("====================================\n");


//        Логическое сокращенное ИЛИ - "||"
        //
        // true || ? -> true
        //сокращенное ИЛИ НЕ будет считать правую часть, а обычное ИЛИ будет

        bol = true || (a / b > 2);
        System.out.println("bol: " + bol);


        System.out.println("=================Приоритет логических операций===================\n");

        /*
        ! & ^ | && || - Приоритет логических операций
         */
        System.out.println(true ^ true & false);
        System.out.println(true ^ false);
        System.out.println(true);

        System.out.println();

        System.out.println(true ^ true && false);
        System.out.println(false ^ false);
        System.out.println(false);


    }

}
