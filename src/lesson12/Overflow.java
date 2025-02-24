package lesson12;

public class Overflow {
    public static void main(String[] args) {
        //
        byte bytevar = 127;
        System.out.println("byte: " + bytevar);
        bytevar++;
//        bytevar += 5;
//        bytevar++;
        System.out.println("byte: " + bytevar);
        bytevar--;
        System.out.println("byte: " + bytevar);

        short shortVar = 32767;
        System.out.println(shortVar);
        shortVar += 5;
        System.out.println(shortVar);


    }
}
