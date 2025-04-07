package lab4;

public class BookstoreCheck {
    public static boolean isDuplicate(Book book1, Book book2) {
        return book1.getTitle().equalsIgnoreCase(book2.getTitle()) &&
               book1.getAuthor().equalsIgnoreCase(book2.getAuthor()) &&
               book1.getPublisher().equalsIgnoreCase(book2.getPublisher());
    }

    public static Book getThickerBook(Book book1, Book book2) {
        return (book1.getPageCount() > book2.getPageCount()) ? book1 : book2;
    }
}
