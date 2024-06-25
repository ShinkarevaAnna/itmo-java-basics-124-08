package Itmo.lessons10FileReader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File(".idea/files/file.txt");
        ReadFiles read = new ReadFiles();
        read.fileReader(file);
        String line = "my java is cool";
        WriteInFile writeInFile = new WriteInFile();
        writeInFile.writeInFile(line);
        File fileWriterForGlue = new File(".idea/files/file3.txt");
        GlueFiles glueFiles = new GlueFiles();
        glueFiles.glueFiles(file, fileWriterForGlue);
        File fileReaderForChange = new File(".idea/files/file4.txt");
        File fileWriterForChange = new File(".idea/files/file5.txt");
        ChangeInFiles changeInFiles = new ChangeInFiles();
        changeInFiles.changeOnDollar(fileReaderForChange, fileWriterForChange);
    }
}
