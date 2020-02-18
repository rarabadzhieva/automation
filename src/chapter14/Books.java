package chapter14;

public class Books {

    private String title = null;
    private String author = null;
    private String publisher = null;
    private int year = 0;
    private String isbnNumber = null;

    public Books(String title, String author, String publisher, int year, String isbnNumber) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public static void printInfo(Books book) {
        System.out.printf("Book: %s with author %s, published by %s in %d, IBSN-number - %s%n",
                book.getTitle(), book.getAuthor(), book.getPublisher(), book.getYear(), book.getIsbnNumber());
    }
}
