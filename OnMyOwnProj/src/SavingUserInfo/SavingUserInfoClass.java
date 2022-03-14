package SavingUserInfo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SavingUserInfoClass {

    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;


    Scanner userInput = new Scanner(System.in);


    public void savingFile() {

        try {
            //naming the file
            fileWriter = new FileWriter("SavedUserInfoFiles.txt");
            //adding filewriter obj into buffered
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (Exception e) {
            System.out.println("Error!!!");
        }

    }

    public void readingFile() throws FileNotFoundException {
        userInput = new Scanner(new File("SavedUserInfoFiles.txt"));

        while(userInput.hasNext()) {
            String lines = userInput.nextLine();
            System.out.printf("%s \n", lines);



        }

    }

    public void addingUserInfo() throws IOException {
        System.out.print("Hello Enter Name: ");
        String userName = userInput.nextLine();
        bufferedWriter.write(userName);
        bufferedWriter.newLine();

        System.out.print("Hello: " + userName + " Now Enter Age please: ");
        String userAge = userInput.nextLine();
        bufferedWriter.write(userAge);
        bufferedWriter.newLine();


        bufferedWriter.append("Adding More Content Inside Text File");
        bufferedWriter.flush();
        System.out.println("File Created" + " Check Project Files");



        userInput.close();
        fileWriter.close();
        bufferedWriter.close();

    }


}
