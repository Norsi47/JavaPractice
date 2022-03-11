package WritingFiles.ReadingFromFiles;

public class ReadFileMain {
    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        readFile.openFile();
        readFile.readFile();
        readFile.closeFile();

    }
}
