package lesson11;

public class Variables {
    public static void main(String[] args) {

//  Java - язык строгой типизации
//  Python - язык динамической типизации
//        Java - строго типизированный язык программирования, a Python - динамически типизированный язык
// Python: х = 10 # Python сам понимает / определяет тип переменной - число / строка
/*
Строгая типизация - Каждая переменная должна иметь определенный тип данных, который не может измениться.
 Тил данных определяет какие значения могут храниться в переменной и
  какие операции можно выполнить со значением этой переменной

  Объявляя переменную мы должны указать тип данных и выбрать уникальное имя
  Имена переменных ВСЕГДА пишутся с маленькой буквы и в camelCase нотации
*/

        int myFirstVariable; // Объявление переменной типа int


        // Инициализация переменной - первое присвоение значения
        myFirstVariable = 10;
        System.out.println("myFirstVariable  " + myFirstVariable);


        int mySecondVariable = 25;

        System.out.println("mySecondVariable " + mySecondVariable);

        mySecondVariable = 50;
        System.out.println("mySecondVariable " + mySecondVariable + " myFirstVariable " + myFirstVariable);

        byte byteVar = 125;
        byteVar = 0;
        System.out.println("Значение переменной byteVar: " + byteVar);

        // Имя переменной должно быть уникально в границах видимости.

        short shortVar = 31000;
        long longVariable = 2_100_000_000_000_000L; // L в конце числа
        System.out.println("Значение переменной longVariable: " + longVariable);
        // В коде любое целое число воспринимается компилятором как число в формате int

        double doubleVar = 10.5421;
        System.out.println("Значение переменной doubleVar: " + doubleVar);

        float floatVar = 123.465f; // f/F указать, что число в формате float

    }
}
