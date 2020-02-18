package chapter14;

import java.util.ArrayList;

public class LibraryTest {

    public static void testAddBook() {
        Books javaBook = new Books("Introduction to Java", "Svetlin Nakov", "SoftUNI", 2014, "1234567890");
        Books underTheDome = new Books("Under the dome", "Stephen King", "Scribner", 2009, "1439148503");
        Books it = new Books("It", "Stephen King", "Scribner", 1986, "0450411435");
        Library.addBook(javaBook);
        Library.addBook(underTheDome);
        Library.addBook(it);

        Books.printInfo(javaBook);
        System.out.println("1st version:");
        Library.printLibraryInfo();
        System.out.println("Search version:");
        Library.searchBooksByAuthor("Steven King");
    }

    public static void deleteAuthorBooks(String author) {
        ArrayList<Books> authorBooks = Library.searchBooksByAuthor(author);
        for (Books book : authorBooks) {
            Library.deleteBook(book);
        }
        System.out.println("Final version:");
        Library.printLibraryInfo();
    }
}
