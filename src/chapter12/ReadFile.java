package chapter12;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    public String readFileString(String fileName) throws IOException {
        File file = new File(fileName);
        StringBuilder fileContent = new StringBuilder();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            fileContent.append(input.next() + "\n");
        }
        input.close();
        return fileContent.toString();
    }

    public ByteArrayOutputStream readFileBytes(String fileName) throws IOException {
        FileInputStream file = new FileInputStream(fileName);
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        byte[] data = new byte[7];
        while (true) {
            int size = file.read(data);
            if (size <= 0) {
                break;
            }
            byteArray.write(data, 0, size);
        }
        file.close();
        return byteArray;
    }

    public void writeByteFile(ByteArrayOutputStream byteOutput, String fileName) throws IOException {
        FileOutputStream file = new FileOutputStream(fileName);
        file.write(byteOutput.toByteArray());
        file.close();
    }

    public void readNumberFile(String fileName) throws FileParseException, IOException {
        FileReader file = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(file);
        int line = 1;
        while (reader.ready()) {
            try {
                Integer.valueOf(reader.readLine());
                line++;
            } catch (NumberFormatException e) {
                reader.close();
                throw new FileParseException(fileName + " has non-digit value", line);
            }
        }
        reader.close();
    }
}
