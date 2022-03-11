package MakingFileClass.VideoExample;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {

        //this will give info about the class
        File file = new File("C:\\Users\\NorsiTheGreat\\Documents\\JavaFilesTestandExample\\videoExample.txt");


        if (file.exists())
            //get name is used to get the name of the file
            System.out.println(file.getName() + " exist!");
        else
            System.out.println("This thing does not exists");

    }
}
