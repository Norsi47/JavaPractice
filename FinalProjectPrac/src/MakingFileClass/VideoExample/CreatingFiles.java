package MakingFileClass.VideoExample;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class CreatingFiles {
    public static void main(String[] args) {

//        can be done this way as well
//        final Formatter formatter = new Formatter();
        final Formatter formatter;

        //using exception handling

        //this way creates a file using formater
        try {
            formatter = new Formatter("Fred.txt");
            System.out.println("You Created a file");
        }
        catch (Exception e) {
            System.out.println("You got an Error");
        }

    }
}
