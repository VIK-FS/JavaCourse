package lesson12;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;
        int result;


        result = 15 + 6;
        System.out.println("result: " + result);


        result = var1 + var2;
        System.out.println("va1 + var2: " + result);

        result = var1 - var2;
        System.out.println("va1 - var2: " + result);

        result = var1 * var2;
        System.out.println("va1 * var2: " + result);


//        целочисленное деление
        result = var1 / var2;
        System.out.println("va1 / var2: " + result);

//        взятие остатка от деления
        result = var1 % var2;
        System.out.println("va1 % var2: " + result);

        System.out.println("5 / 10 = " + (5 / 10));
        System.out.println("5 % 10 = " + (5 % 10));

        System.out.println("=============================================\n");

        double doubleVar = 20.0;
        double doubleVar2 = 7.0d; // явное указание формата double

        double doubleRes = doubleVar/doubleVar2;
        System.out.println("doubleRes " + doubleRes);



    }
}
