package lab4;

import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookstoreTest bookstore = new BookstoreTest();

        System.out.println("Introduceti numarul de carti:");
        int numBooks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numBooks; i++) {
            System.out.println("Introduceti titlul cartii:");
            String title = scanner.nextLine();
            System.out.println("Introduceti autorul cartii:");
            String author = scanner.nextLine();
            System.out.println("Introduceti editura cartii:");
            String publisher = scanner.nextLine();
            System.out.println("Introduceti numarul de pagini:");
            int pageCount = scanner.nextInt();
            scanner.nextLine();

            if (pageCount <= 0) {
                System.out.println("Numarul de pagini trebuie sa fie mai mare decat 0. Se seteaza la 1 implicit.");
            }

            bookstore.createBook(new Book(title, author, publisher, pageCount));
        }

        System.out.println("Cartile introduse:");
        bookstore.displayBooks();

        if (numBooks > 1) {
            System.out.println("Introduceti titlul primei carti pentru comparatie:");
            String t1 = scanner.nextLine();
            System.out.println("Introduceti titlul celei de-a doua carti pentru comparatie:");
            String t2 = scanner.nextLine();

            Book b1 = bookstore.readBook(t1);
            Book b2 = bookstore.readBook(t2);

            if (b1 != null && b2 != null) {
                boolean duplicate = BookstoreCheck.isDuplicate(b1, b2);
                System.out.println("Cartile sunt duplicate: " + duplicate);

                Book thicker = BookstoreCheck.getThickerBook(b1, b2);
                System.out.println("Cartea mai groasa este:");
                System.out.println(thicker);
            } else {
                System.out.println("Una dintre carti nu a fost gasita.");
            }
        }

        scanner.close();
    }
}
