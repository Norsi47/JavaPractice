package EventHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandPrac extends JFrame {

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public EventHandPrac() {
        super("Message Box");
        setLayout(new FlowLayout());

        item1 = new JTextField(20);
        add(item1);

        item2 = new JTextField("Enter Text here");
        add(item2);

        item3 = new JTextField("Can not edit",20);
        item3.setEditable(false);
        item3.setToolTipText("Still can not Edit");
        add(item3);

        passwordField = new JPasswordField("Password");
        add(passwordField);

        itemHandler itemHandlers = new itemHandler();
        item1.addActionListener(itemHandlers);
        item2.addActionListener(itemHandlers);
        item3.addActionListener(itemHandlers);
        passwordField.addActionListener(itemHandlers);

    }

    public class itemHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            String string = "";

            if (event.getSource()==item1)
                string = String.format("You entered first: %s",event.getActionCommand());
            else if (event.getSource()==item2)
                string = String.format("You entered Second: %s",event.getActionCommand());
            else if (event.getSource()==item3)
                string = String.format("You entered Third: %s",event.getActionCommand());
            else if (event.getSource()==passwordField)
                string = String.format("You entered Password: %s",event.getActionCommand());

            JOptionPane.showMessageDialog(null,string);
        }
    }








}