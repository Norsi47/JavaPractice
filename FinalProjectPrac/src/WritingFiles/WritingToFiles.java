package WritingFiles;

import java.util.Formatter;

public class WritingToFiles {

    //try using FileWriter or BufferedWriter
    //used for making files
    private Formatter formatter;

    public void openFile() {

        try {
            formatter = new Formatter("chinese.txt");
        }
        catch (Exception e) {
            System.out.println("You have an error");

        }

    }

    public void addRecords() {
        // the \n is needed for new line
        formatter.format("%s %s %s\n", "20", "Norsi", "Onye");
        formatter.format("%s %s %s\n", "24", "Bryce","Acosta");
        formatter.format("%s %s %s\n", "45","Jackson", "Peterson");
    }

    //need this to close files
    public void closeFile() {
        formatter.close();
    }



}
