package Itmo.lessonFileReader;

import java.io.*;

public class ChangeInFiles {
    public void changeOnDollar(File file, File file2) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                writer.write(input.replaceAll("[^\\p{L}\\p{N}]+", "\\$") + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}