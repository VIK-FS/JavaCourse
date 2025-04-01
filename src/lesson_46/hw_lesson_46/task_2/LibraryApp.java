/*
Task 2
Поиск книги в библиотеке
Создайте класс Library, в котором хранится список книг. У каждой книги есть название (title) и автор (author).

Реализуйте метод:
Optional<Book> findBookByTitle(String title)

Он должен возвращать Optional — книгу, если она найдена, или Optional.empty(), если такой книги нет.

Что нужно сделать:
Создайте класс Book с полями title и author, и сделайте для них геттеры.
Создайте класс Library, в котором будет список книг.
Реализуйте метод findBookByTitle, который ищет книгу по названию.
В main() методе попробуйте:
Найти книгу, которая точно есть.
Найти книгу, которой нет.
Вывести информацию о книге, если она найдена.
Вывести "Книга не найдена", если её нет.
 */
package lesson_46.hw_lesson_46.task_2;

import java.util.Optional;
import java.util.function.Predicate;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "Джордж Оруэлл"));
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков"));
        library.addBook(new Book("Преступление и наказание", "Фёдор Достоевский"));
        library.addBook(new Book("Война и мир", "Лев Толстой"));
        library.addBook(new Book("Гарри Поттер и философский камень", "Дж. К. Роулинг"));
        library.addBook(new Book("Алиса в Стране чудес", "Льюис Кэрролл"));
        library.addBook(new Book("Три товарища", "Эрих Мария Ремарк"));
        library.addBook(new Book("Сто лет одиночества", "Габриэль Гарсия Маркес"));
        library.addBook(new Book("Шерлок Холмс", "Артур Конан Дойл"));
        library.addBook(new Book("Колыбель для кошки", "Курт Воннегут"));

        System.out.println("Книги в библиотеке:");
        library.showBooks();
        System.out.println();


        // Найти книгу, которая точно есть.
        String searchTitle = "Три товарища";
        Predicate<Book> titlePredicate = book -> book.getTitle().equalsIgnoreCase(searchTitle);
        Optional<Book> foundBook = library.findBookByPredicate(titlePredicate);
        foundBook.ifPresentOrElse(
                book -> System.out.println("Найдена книга: " + book),
                () -> System.out.println("Книга \"" + searchTitle + "\" не найдена")
        );
        // Найти книгу, которой нет.
        String searchTitle1 = "Фантомас";
        Predicate<Book> titlePredicate1 = book -> book.getTitle().equalsIgnoreCase(searchTitle1);
        Optional<Book> foundBook1 = library.findBookByPredicate(titlePredicate1);
        foundBook1.ifPresentOrElse(
                book -> System.out.println("Найдена книга: " + book),
                () -> System.out.println("Книга \"" + searchTitle1 + "\" не найдена")
        );

        System.out.println();

        // Найти книгу, которая точно есть.
        String searchAuthor = "Артур Конан Дойл";
        Predicate<Book> authorPredicate = book -> book.getAuthor().equalsIgnoreCase(searchAuthor);
        foundBook = library.findBookByPredicate(authorPredicate);
        foundBook.ifPresentOrElse(
                book -> System.out.println("Найдена книга автора \"" + searchAuthor + "\": " + book),
                () -> System.out.println("Книги автора \"" + searchAuthor + "\" не найдены")
        );
        // Найти книгу, которой нет.
        String searchAuthor1 = "Пьер Сувестр";
        Predicate<Book> authorPredicate1 = book -> book.getAuthor().equalsIgnoreCase(searchAuthor1);
        foundBook1 = library.findBookByPredicate(authorPredicate1);
        foundBook1.ifPresentOrElse(
                book -> System.out.println("Найдена книга автора \"" + searchAuthor1 + "\": " + book),
                () -> System.out.println("Книги автора \"" + searchAuthor1 + "\" не найдены")
        );

        System.out.println();

        Predicate<Book> longTitlePredicate = book -> book.getTitle().length() > 10;
        Optional<Book> longTitleBook = library.findBookByPredicate(longTitlePredicate);
        longTitleBook.ifPresentOrElse(
                book -> System.out.println("Найдена книга с длинным названием: " + book),
                () -> System.out.println("Книги с длинным названием не найдены")
        );
    }
}

