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
                if (fileLine % 2 == 1) {
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

    public void findMax() {
        ArrayList<String[]> rows = new ArrayList<>();
        try (
                Scanner fileInput = new Scanner(new File("src/chapter15/matrix.txt"));
                PrintStream fileOutput = new PrintStream(OUTPUT_FILE)
        ) {
            final int N = fileInput.nextInt();
            int[][] matrix = new int[N][N];

            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    matrix[i][j] = fileInput.nextInt();
                }
            }

            int maxSum = Integer.MIN_VALUE;
            for (int i=0; i<N-1; i++) {
                for (int j=0; j<N-1; j++) {
                    maxSum = Integer.max(maxSum, matrix[i][j] + matrix[i+1][j] + matrix[i][j+1] +
                            matrix[i+1][j+1]);
                }
            }
            fileOutput.print(maxSum);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void replaceWord() {
        try (
                Scanner fileInput = new Scanner(new File("src/chapter15/text.txt"));
                PrintStream fileOutput = new PrintStream(OUTPUT_FILE)
        ) {
            while (fileInput.hasNextLine()) {
//                String line = fileInput.nextLine().replace("start", "finish");
                String line = fileInput.nextLine().replaceAll("\\bstart\\b", "finish");
                fileOutput.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
