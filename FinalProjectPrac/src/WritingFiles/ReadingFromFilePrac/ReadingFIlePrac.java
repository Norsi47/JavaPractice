package WritingFiles.ReadingFromFilePrac;

import java.io.File;
import java.util.Scanner;

public class ReadingFIlePrac {

    private Scanner scanner;

    public void openFile() {

        try {
            //doing this to look for file and not look for keyboard
            scanner = new Scanner(new File("UserInfoPrac.txt"));
        }

        catch (Exception e) {
            System.out.println("File not found");
        }


    }

    public void readingFile() {

        //to loop through everything inside file
        while (scanner.hasNext()) {

            String lines1 = scanner.next();
////            String s = "Norsi";
////            String lines2 = scanner.findInLine(s);
//            String lines3 = scanner.next();
            String lines4 = scanner.nextLine();

            //to print the lines
            System.out.printf("%s %s\n", lines1, lines4);



        }

    }
    //needs to be outside previous method to work properly
    public void closingScanner() {
        scanner.close();
    }




}
