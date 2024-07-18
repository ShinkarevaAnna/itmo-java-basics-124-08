package Itmo.lessonFileReader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/file.txt");
        ReadFiles read = new ReadFiles();
        read.fileReader(file);
        String line = "my java is cool";
        WriteInFile writeInFile = new WriteInFile();
        writeInFile.writeInFile(line);
        File fileWriterForGlue = new File("files/file3.txt");
        GlueFiles glueFiles = new GlueFiles();
        glueFiles.glueFiles(file, fileWriterForGlue);
        File fileReaderForChange = new File("files/file4.txt");
        File fileWriterForChange = new File("files/file5.txt");
        ChangeInFiles changeInFiles = new ChangeInFiles();
        changeInFiles.changeOnDollar(fileReaderForChange, fileWriterForChange);
    }
}
