import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUILogIn implements ActionListener {

    //static is used to access it "easier"
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        //not too sure how it matches with passwordLabel
        //this will make password show dots instead of showing
        passwordText = new JPasswordField();
        //bounds matches the text field
        passwordText.setBounds(100, 50, 165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUILogIn());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        //needs to be at the bottom
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String user = userText.getText();
        //the slash means it is not being supported anymore but should work for example
        String passWord = passwordText.getText();
//        System.out.println(user + ", " +passWord);

        //if it matches print out password
        if (user.equals("Norsi") && passWord.equals("Spiderman45")) {
            success.setText("Login Successful!");
        }
        else {
            success.setText("UserName or PassWord is Incorrect!" );
            //to add color if pw is wrong
            success.setForeground(Color.RED);
        }


    }
}
