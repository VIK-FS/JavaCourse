package lesson_32;

public class Wrappers {
    // Классы-обертки используются для представления примитивных типов как объектов (как ссылочных)
    /*
    Byte - обертка byte
    Short - обертка short
    Integer - обертка int
    Long - обертка long
    Float - обертка float
    Double - обертка double
    Character - обертка char
    Boolean - обертка boolean
     */

    public static void main(String[] args) {
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

        // Поддержка null
        // int x = null;
        maxValue = null;

        // приведение типов. Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // Автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспаковка. Из типа Integer автоматически преобразовано в примитив int
        System.out.println(primitiveInt);
        System.out.println("\n==============================");

        // Сравнение объектов по значению-> следует использовать метод equals
        Integer a = 127; // Создан объект с адресом в памяти @2A85698
        Integer b = 127; // Объект с таким значением уже есть, новый не создаются
        // сравниваем значения ,записанные в переменных (ссылки объектов в памяти)
        System.out.println("127.equals(127) " + (a.equals(b))); // true

        Integer c = 128; // Создан объект с адресом в памяти @D454598
        Integer d = 128; //
        System.out.println("128.equals(128) " + (c.equals(d))); // true

        System.out.println("\n===================================");

        // Общие (или схожие) методы, которыми обладают классы-обертка
        // .valueOf() - преобразует явным образом примитив или строку
        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");
        System.out.println(e + " | " + e1);

        Double dbl = Double.valueOf(154.5);
        System.out.println("dbl: " + dbl);

        Boolean b1 = Boolean.valueOf("true");
        System.out.println("b1: " + b1);

        // parseXXX() -
        double dblP = Double.parseDouble("456"); // возращает примитив
        Double dblD = Double.valueOf("456"); // возращает ссылочный тип

        System.out.println(dblP + " | " + dblD);

        System.out.println(Integer.parseInt("123"));

        // toString - переопределяет метод, который возвращает строковое представление числа
        // equals - сравнивает два объекта по значению

        Integer i1 = 127;
        Integer i2 = 256;

        System.out.println(i1 > i2);

        // compareTo -  сравнивает текущий объект с другим объектом
        //
        System.out.println("127.compareTo(256): " + i1.compareTo(i2));
        System.out.println("256.compareTo(127): " + i2.compareTo(i1));
        System.out.println("256.compareTo(256): " + i2.compareTo(i2));
        /*
         i1>i2 -> пол
         i1<i2 -> отр
         i1=i2 -> 0
         */

        System.out.println("\n======================");

        // xxxValue() - возвращает значение объекта как примитивный тип

        Double d2 = 125.67; // Автоупаковка
        d2 = Double.valueOf(125.67); // Явная / принудительная упаковка
        double dPrimitive = d2; // Автораспаковка
        dPrimitive = d2.doubleValue(); // Явная  / принудительная распаковка

        System.out.println("\n============================");


        /*
        Абсрактного класса Number. Все числовые обертки наследуются от абстрактного класса Number
        Byte, Short; Integer, Long, Float, Double
         */

        /*
        byteValue
        shortValue
        intValue
        longValue
        floatValue
        doubleValue
         */
        //
        Integer integer = 31844;
        double dVal = integer.doubleValue();
        System.out.println(dVal);

        System.out.println(integer.floatValue());

        Double dWrapper = 245.78;
        int iVal = dWrapper.intValue();
        System.out.println(iVal);

        System.out.println("dWrapper.byteValue(): " + dWrapper.byteValue());
        System.out.println("dWrapper.intValue(): " + dWrapper.intValue());



    }
}
