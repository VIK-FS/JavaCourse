package lesson_16;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int number = 1;
        while (number <= 5) {
            System.out.print(number + ", ");
            number++;
        }
        System.out.println();

        System.out.println("Цикла закончен");

        number = 1;
        while (number <= 5) {
            System.out.print(number + ", ");
            number++;
        }
        System.out.println();

        //распечатать числа от
        number = 100;
        while (number >= 1) {
            System.out.print(number + ", ");
//            if (number % 33 == 0){
//                System.out.println();
//            }
            number--;
        }
        System.out.println();

        number = 100;
        while (number >= 90) {
            System.out.println(number-- + ", ");
        }

        //найти сумму чисел от 1 до 100
        /*
        1. Перебрать от 1 до 100
        2. Каждое число добавить
         */

//        number = 1;
//        int total = 1;
//
//        while (number <= 10) {
//            total *= number;
//            number++;
//        }

//        System.out.println("result: " + total);


        int i = 1;
        while (i <= 21) {
            System.out.println("Число, которое проверяем: " + i);
            if (i % 2 == 0) {
                System.out.print(i++ + ", ");//i++
            }
            i++;
        }
        System.out.println();
        System.out.println("=============================================");

        // Распечатать каждый символ в этой строке
        /*
        1 Перебрать все индексы
        2 0 - (len-1)
        3.
         */

        String str = "Hello!";
        int idx = 0;
        while (idx < str.length()) {
            System.out.println(str.charAt(idx));
            idx++;
        }


        String str1 = "Hello!";
        int idx1 = 0;
        while (idx1 < str1.length()) {
            System.out.printf("%d-й символ строки - '%s'\n", idx1 + 1, str1.charAt(idx1));
            idx1++;
        }

        String str2 = "Hello!";
        int idx2 = 0;
        while (idx2 < str2.length()) {
        char c = str2.charAt(idx2);
            System.out.println(c);
            idx2++;
        }

        System.out.println("=================OPT2==================");

        idx = 0;
        while (idx < str.length()){
            System.out.println(str2.charAt(idx++));
        }

        System.out.println("===================================");

        //Полтзователь ввел число больше нуля
        // пока не ввел, программа не продолжиться
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int input = sc.nextInt();
        sc.nextLine();

        while (input <= 0){
            System.out.println("Введите положительное число: ");
            input = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Спасибо, вы ввели: " +input);

        //Цикл с постусловием
        // цикл do-while - всегда выполняется тело цикла один раз, независимо от условия
        //

        /*
        do{
        тело цикла
        }
         */
        int num;

        do {
            System.out.println("Введите число больше 0: ");
            num = sc.nextInt();
            sc.nextLine();
        }while (num <= 0);

        System.out.println("Спасибо, вы ввели: "  + num);
    }


}
