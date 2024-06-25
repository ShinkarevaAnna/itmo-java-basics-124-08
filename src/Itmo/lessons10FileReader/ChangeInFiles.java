package Itmo.lessons10FileReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ChangeInFiles {
    public void changeOnDollar(File file, File file2) {

        try (InputStream is = new FileInputStream(file);
             OutputStream os = new FileOutputStream(file2)) {
            StringBuilder stringBuilder = new StringBuilder();
            while (is.available() > 0) {
                stringBuilder.append((char) is.read());
            }
            String modified = stringBuilder.toString();
            modified = modified.replaceAll("[^a-zA-Z0-9]", "\\$");
            System.out.println(modified);
            os.write(modified.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}