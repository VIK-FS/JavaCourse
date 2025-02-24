package lesson13;

public class StringExample {
    public static void main(String[] args) {
        String greeting = "Hello World!"; // Объявление и инициализация переменной типа String

        String string1 = new String(("Hello!"));//Также создание новой строки (не рекрмендуемый)

        System.out.println(greeting);
        System.out.println(string1);


//        greeting.length();// Вызов метода length() -
//      Метод length() - получить количество символов в строке
        int length = greeting.length();// Вызов метода length() - считает количество символов в этой строке
        System.out.println("length: " + length);

        System.out.println("Hello".length());

        // метод, который позволяет перевести все символы в верхний регистр
        System.out.println(greeting.toUpperCase());

        System.out.println("greeting " + greeting);

        // String иммутабельна (неизменна)
        // Если я хочу сохранить результат работы метода - я должен сохранить  его в какую-то переменную

        String stringCase = greeting.toUpperCase();
        System.out.println("stringCase: " + stringCase);
        System.out.println("greeting " + greeting);
        greeting = greeting.toUpperCase();// x = x + 5;
        System.out.println("greeting: " + greeting);
        System.out.printf("greeting format: %s\n", greeting);


        System.out.println("=========================\n");

        // Различные варианты конкатенации (склеивания / объединения) строк
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);
        System.out.println(1 + 3 + " : " + 2 + 3);

        // 1+3=4
        // 4 + " : " -> "4"

        // Изменили приоритет операциий
        System.out.println(1 + 3 + " : " + (2 + 3));

        // Конкатенация 2
        String сoncatStr2 = str1.concat(str2);
        сoncatStr2 = сoncatStr2.concat(str3);
        System.out.println("сoncatStr2: " + сoncatStr2);


        String concatStr3 = str1.concat(str2).concat(str3).concat("!!!");
        System.out.println("concatStr3: " + concatStr3);

        // Конкатенация 3
        // Склеить несколько строк, вставляя между ними одинаковый разделитель

        String concatStr5 = String.join("|||", "Hello", "World", "Test");
        System.out.println("concatStr5: " + concatStr5);

        // Приведение типов. Когда есть строка и знак "+" - это знак конкатенации. Второй тип данных будет приведен
        // в String

        int a = 1;
        int b = 2;
        String str = "Сумма a + b = " + a + b; // Сумма a + b = 12
        System.out.println("str: " + str);


        str = "Сумма a + b = " + (a + b); // Сумма a + b = 12
        System.out.println("str: " + str);

        System.out.println("============================\n");

        String digits = "0123456789";
        System.out.println("digits.length(): " + digits.length());

        //  charAt(index) Взять символ из строки
        char symbol = digits.charAt(3);
        System.out.println("symbol: " + symbol);

        char first = digits.charAt(0);
        char last = digits.charAt(digits.length() - 1);

        System.out.println("first: " + first);
        System.out.println("last: " + last);

        System.out.println("===========================\n");

        // выделение подстроки

        String subString = digits.substring(2);
        System.out.println("subString: " + subString);

        System.out.println("digits: " + digits);

        String subString2 = digits.substring(2, 7); // c "2" ВКЛ до "7" НЕ ВКЛ
        System.out.println("subString2: " + subString2);

        System.out.println("================================\n");

        //Замена частей строки
        //replace(), replaceFirst(), replaceAll()

//        replace() - заменяет все совпадения заданной строки на другую строку

        String string = "One World One";
        String replStr = string.replace("One", "WWW");
        System.out.println("repStr: " + replStr);

        //replaceFirst()
        replStr = string.replaceFirst("One", "WWW");
        System.out.println("repStr: " + replStr);

//        replaceAll() -заменяет все совпадения заданной строки на другую строку
//        и поддерживает регулярные выражения
        replStr = string.replaceAll("One", "WWW");
        System.out.println("repStr: " + replStr);

        String stringReg = "One World One Onix O";
        replStr = stringReg.replaceAll("\\bO\\w*", "Replaced");
        System.out.println("replStr: "+replStr);

    }
}
