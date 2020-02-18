package chapter14;

import java.util.ArrayList;

public class Library {

    private static String name = null;
    private static ArrayList<Books> books = new ArrayList<>();

    public static void addBook(Books book) {
        books.add(book);
    }

    public static void deleteBook(Books book) {
        books.remove(book);
    }

    public static ArrayList<Books> searchBooksByAuthor(String author) {
        ArrayList<Books> authorBooks = new ArrayList<>();
        for (Books book : books) {
            if (book.getAuthor().equals(author)) {
                Books.printInfo(book);
                authorBooks.add(book);
            }
        }
        return  authorBooks;
    }

    public static void printLibraryInfo() {
        for (Books book :  books) {
            Books.printInfo(book);
        }
    }
}
