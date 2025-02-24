package lesson13;

public class CharExample {
    public static void main(String[] args) {
        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // Переменная будет хранить букву А латинского алфавита (65 в десятеричной)
        char a2 = 0x41; // Переменная будет хранить букву А латинского алфавита (65 в шестнадцатеричной)
//        a2 = 0x0041;
        char a3 = '\u0041';
        char x = '\u15EE';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        System.out.println("==============================================\n");

        char letter = 'A';
        letter++;
        System.out.println("letter: " + letter);

        char digit = 48;
        System.out.println("digit: " + digit);

        digit += 5;
        System.out.println("digit: " + digit);

        /*
        0...9 - соответствуют кодам 48...57
        a...z - соответствуют кодам 97...122
        A...Z - соответствуют кодам 65...90
         */

//        digit = digit + 3;
        digit = (char) (digit + 3);
        byte b1 = 120;
//        b1 = b1 + 1;
        b1 = (byte) (b1 + 1);

        //Чтобы получить код символа в десятиричной системе нужно привести тип char к типу int
//        digit = 'A';

        System.out.println("int из char даст 10-десятичный код символа " + digit + ": " + (int) digit);
        System.out.println(0 + digit);


        System.out.println("b1: " + b1);

        char x1 = 12853;
        System.out.println("x1: " + x1);


    }
}
