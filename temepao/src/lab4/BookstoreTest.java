package lab4;

import java.util.ArrayList;

public class BookstoreTest {
    private ArrayList<Book> books = new ArrayList<>();

    public void createBook(Book book) {
        books.add(book);
    }

    public Book readBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void updateBook(String title, String newAuthor, String newPublisher, int newPageCount) {
        Book book = readBook(title);
        if (book != null) {
            book.setAuthor(newAuthor);
            book.setPublisher(newPublisher);
            book.setPageCount(newPageCount);
        }
    }

    public void deleteBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
            System.out.println("--------------------");
        }
    }
}
