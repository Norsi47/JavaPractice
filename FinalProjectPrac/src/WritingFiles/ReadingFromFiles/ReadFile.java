package WritingFiles.ReadingFromFiles;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

    private Scanner scanner;

    public void openFile() {
        try {
            //instead of reading from keyboard it will read from the chinese.txt file
            scanner = new Scanner(new File("chinese.txt"));
        }
        catch (Exception e) {
            System.out.println("Could not find file");
        }

    }

    public void readFile() {
        //while loop until it reaches end of file
        //loop will continue as long as theres something there
        while (scanner.hasNext()) {

            String varA = scanner.next();
            String varB = scanner.next();
            String varC = scanner.next();

            System.out.printf("%s %s %s\n", varA, varB, varC);


        }
    }
    public void closeFile() {
        scanner.close();
    }
}
