package chapter12;

public class FileParseException extends Exception {

    public FileParseException(String s, int line) {
        super(s + " at line " + Integer.toString(line));
    }
}
