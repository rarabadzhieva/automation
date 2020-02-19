package chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Exercises {

    private final String OUTPUT_FILE = "src/chapter15/output-text.txt";

    public void readOddLines() {
        int fileLine = 0;
        try (Scanner fileInput = new Scanner(new File("src/chapter15/input-text.txt"), "UTF-8")) {
            while (fileInput.hasNextLine()) {
                fileLine++;
                String line = fileInput.nextLine();
                if (fileLine % 2 == 0) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void sortNames() {
        ArrayList<String> names = new ArrayList<>();
        try (
            Scanner fileInput = new Scanner(new File("src/chapter15/names.txt"), "UTF-8");
            PrintStream fileOutput = new PrintStream(OUTPUT_FILE, "UTF-8")
        ) {
            while (fileInput.hasNextLine()) {
                names.add(fileInput.nextLine());
            }
            Collections.sort(names);
            for (String name : names) {
                fileOutput.println(name);
            }
        } catch (FileNotFoundException|UnsupportedEncodingException e) {
            System.err.println(e.getMessage());
        }
    }
}
