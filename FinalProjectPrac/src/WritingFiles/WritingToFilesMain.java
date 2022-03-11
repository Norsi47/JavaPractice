package WritingFiles;

public class WritingToFilesMain {
    public static void main(String[] args) {

        WritingToFiles writingToFiles = new WritingToFiles();
        writingToFiles.openFile();
        writingToFiles.addRecords();
        writingToFiles.closeFile();

    }
}
