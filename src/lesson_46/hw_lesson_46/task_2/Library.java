package lesson_46.hw_lesson_46.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Optional<Book> findBookByPredicate(Predicate<Book> predicate) {
        for (Book book : books) {
            if (predicate.test(book)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
