package SaveUserPW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SaveUserPassWord implements ActionListener {

    //this is for the name of textbox outside panel
    private static JLabel userLabel;
    //for text box
    private static JTextField userTextField;
    //pw label name outside box
    private static JLabel passwordLabel;
    //textbox for password
    private static JPasswordField passwordTextField;
    //the button
    private static JButton button;
    //it will show this if successful
    private static JLabel success;

    private BufferedWriter bufferedWriter;


    public static void main(String[] args) throws IOException {


        //start with this for text box if not extending JFrame
        //Jframe means outside and Jpanel inside
        JFrame frame = new JFrame("Users_Info_Box");
        JPanel panel = new JPanel();

        //initiating textbox name, size and so on
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        //this is for order of what is inside box
        panel.setLayout(null);

        //naming of outside box
        userLabel = new JLabel("User Id: ");
        //setting size of space between "User Id:"  and text field box
        //also position inside the who box
        userLabel.setBounds(10, 20, 90, 25);
        //will make sure it shows
        panel.add(userLabel);

        //to show text box for user textBox
        userTextField = new JTextField(25);
        //x and y for position, width height for length of box
        userTextField.setBounds(100, 20, 155, 20);
        panel.add(userTextField);

        //naming password outside
        passwordLabel = new JLabel("Password: ");
        //space between and position
        passwordLabel.setBounds(10, 50, 90, 25);
        panel.add(passwordLabel);

        //text box for inside
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(100, 50, 165, 20);
        panel.add(passwordTextField);

        //adding button
        button = new JButton("LOGIN");
        button.setBounds(200, 80, 80, 25);
        //action listener needed to make button work
        //reading from the contructor class name
        //where we implemented action listener
        button.addActionListener(new SaveUserPassWord());
        panel.add(button);

        //success panel
        success = new JLabel("");
        success.setBounds(200, 110, 200, 30);
        panel.add(success);


        //need to put this at the end of line of code
        frame.setVisible(true);

    }

    //will get buttons to work when clicked
    @Override
    public void actionPerformed(ActionEvent e) {



        // saving file
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("SavedUserInfoLogIn.txt"));
            bufferedWriter.write("Users ID: " + userTextField.getText());
            bufferedWriter.newLine();
            bufferedWriter.write("Users PassWord: " + passwordTextField.getText());
            bufferedWriter.newLine();

            bufferedWriter.append("User Info 2: ").append(userTextField.getText());
            bufferedWriter.newLine();
            bufferedWriter.append("User Info 2:").append(passwordTextField.getText());
            bufferedWriter.flush();

            bufferedWriter.close();
        } catch (Exception exception) {
            System.out.println("Error");

        }

//        //this means get text from user id text field(the box)
        String user = userTextField.getText();
//
//        //same logic for the button text field, similar to userTextField
        String passWord = passwordTextField.getText();
//
        if (user.equals("Norsi") && passWord.equals("Spiderman45")) {
            success.setText("Login Successful");
        } else {
            success.setText("Error! Please try again");
        }


    }




}
