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
        userLabel.setBounds(5, 10, 90, 25);
        //will make sure it shows
        panel.add(userLabel);

        //to show text box for user textBox
        userTextField = new JTextField(25);
        //x and y for position, width height for length of box
        userTextField.setBounds(100, 20, 155, 20);
        panel.add(userTextField);





        //need to put this at the end of line of code
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
