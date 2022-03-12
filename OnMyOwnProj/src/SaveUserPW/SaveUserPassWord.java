package SaveUserPW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


    public static void main(String[] args) {

        //start with this for text box if not extending JFrame
        //Jframe means outside and Jpanel inside
        JFrame frame = new JFrame("Users_Info_Box");
        JPanel panel = new JPanel();

        //initiating textbox name, size and so on
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        //this is for order of what is inside box
        panel.setLayout(null);

        //naming of outside box
        userLabel = new JLabel("User Id: ");
        //setting size of space between "User Id:"  and text field box
       //also position inside the who box
        userLabel.setBounds(10, 10, 90, 25);
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
        button.setBounds(10, 80, 80, 25);
        //action listener needed to make button work
        //reading from the contructor class name
        //where we implemented action listener
        button.addActionListener(new SaveUserPassWord());
        panel.add(button);





        //need to put this at the end of line of code
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
