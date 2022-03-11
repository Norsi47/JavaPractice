package EventHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//need to extend jfram to let you use window
public class EventHandlingClass extends JFrame {

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    //constructor method is needed to create window
    public EventHandlingClass() {
        super("The Title");
        setLayout(new FlowLayout());

        //text fields
        //the 10 in the argument is the length
        item1 = new JTextField(10);
        //need to do this to add item to window
        add(item1);

        //default text inside
        item2 = new JTextField("Enter Text Here");
        add(item2);

        //user can not edit this
        item3 = new JTextField("Uneditable", 20);
        //user can not edit because of this
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("myPass");
        add(passwordField);

        theHandler handler = new theHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);

    }

    private class theHandler implements ActionListener {

        //has to be called actionPerformed
        public void actionPerformed(ActionEvent event) {
            String string = "";

            if (event.getSource()==item1)
                    string=String.format("field 1: %s", event.getActionCommand());
            else if (event.getSource()==item2)
                string=String.format("field 2: %s", event.getActionCommand());
            else if (event.getSource()==item3)
                string=String.format("field 3: %s", event.getActionCommand());
            else if (event.getSource()==passwordField)
                string=String.format("password field is : %s", event.getActionCommand());

            JOptionPane.showMessageDialog(null, string);
        }

    }






}
