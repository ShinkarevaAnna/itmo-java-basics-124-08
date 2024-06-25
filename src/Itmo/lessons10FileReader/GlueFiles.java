package Itmo.lessons10FileReader;

import java.io.*;

public class GlueFiles {
    public void glueFiles(File file, File file2) {
        File line;
        try (BufferedReader readerFileOne = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            line = new File("files/file2.txt");
            BufferedReader readerFileTwo = new BufferedReader(new FileReader(line));
            String input;
            while ((input = readerFileOne.readLine()) != null) {
                writer.write(input + "\n");
            }
            String lineInFile;
            while ((lineInFile = readerFileTwo.readLine()) != null) {
                writer.append(lineInFile + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
