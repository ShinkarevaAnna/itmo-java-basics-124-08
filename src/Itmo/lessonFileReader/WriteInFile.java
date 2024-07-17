package Itmo.lessonFileReader;

import java.io.*;

public class WriteInFile {

    public void writeInFile(String line) {
        FileWriter file = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new FileWriter("files/file2.txt");
            bufferedWriter = new BufferedWriter(file);
            bufferedWriter.write(line);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (file != null) {
                    bufferedWriter.close();
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
