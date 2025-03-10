package lesson_30.interfaces;

public class Application {
    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита", "М. Булгаков");

        book.print();
        book.defaultMethod();

        System.out.println("==================");

        Journal journal = new Journal("Cosmopoliten", 154);

        journal.print();
        journal.defaultMethod();

        System.out.println("=======================");

        // Тип ссылки типа интерфейс
        // Набор методов, доступных по ссылке- методы
        // Объект сласса, который реализовал данный интерфейс
        Printable printable = journal; // неявное автоматическое приведение типа ссылки
        Printable printable2 = new Book("Философия Java", "Б. Эккель");
        printable2.print();

        System.out.println("\n==========================");

        Printable.testStaticMethod("Hello!");

        System.out.println("\n==========================");

        ColorPrintable presentation = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP"
        );

        presentation.print();
        presentation.defaultMethod();
        presentation.colorPrint();
        //


    }
}
