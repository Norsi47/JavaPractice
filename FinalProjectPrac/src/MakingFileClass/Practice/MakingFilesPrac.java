package MakingFileClass.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;

public class MakingFilesPrac {
    public static void main(String[] args) throws FileNotFoundException {
//final means it can not be used again
        final Formatter formatter = new Formatter("norsiTheGreat.txt");

        try {
            System.out.println("You Created a file");
        }
        catch (Exception e) {
            System.out.println("there is an error");

        }

        //this is to check if the file exists 
        File file = new File("C:\\Users\\NorsiTheGreat\\IdeaProjects\\JavaPractice\\norsiTheGreat.txt");

        if (file.exists())
            System.out.println(file.getName() + " the file exists");
        else
            System.out.println("It does not exist");




    }
}
