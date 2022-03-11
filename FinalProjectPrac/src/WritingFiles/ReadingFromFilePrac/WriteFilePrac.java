package WritingFiles.ReadingFromFilePrac;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFilePrac {

    //formatter to create the file name

    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;

    String line1 = "Norsi is not going to India";
    String line2 = "Julia is from India";
    String line3 = "What is dead may never die";

    String num1 = "24";
    String num2 = "26";
    String num3 = "2020";


    //making method to create the file
    public void createFile() {

        try {
            //fileWriter creates the new file
            fileWriter = new FileWriter("UserInfoPrac.txt");
            //puts the text file into bufferedWriter
            bufferedWriter = new BufferedWriter(fileWriter);

        } catch (Exception e) {
            System.out.println("There is an Error");
        }

    }

    public void addingInfo() throws IOException {

        bufferedWriter.write(line1);
        bufferedWriter.newLine();
        bufferedWriter.write(line2);
        bufferedWriter.newLine();
        bufferedWriter.write(line3);

        bufferedWriter.newLine();
        bufferedWriter.write(num1);
        bufferedWriter.newLine();
        bufferedWriter.write(num2);
        bufferedWriter.newLine();
        bufferedWriter.write(num3);
        //manually edits file
        bufferedWriter.append("\nManually added this");

        //this is needed not too sure why
        bufferedWriter.flush();
        System.out.println("File is created" + "Check File Content");


        fileWriter.close();
        bufferedWriter.close();

    }


}
