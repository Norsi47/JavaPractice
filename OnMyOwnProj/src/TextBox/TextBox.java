package TextBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextBox extends JFrame {

    private JTextField textBox1;
    private JTextField textBox2;
    private JTextField textBox3;
    private JPasswordField passwordField;

    public TextBox() {

        super("TitleBox");
        setLayout(new FlowLayout());

        textBox1 = new JTextField("Might not need", 10);
        add(textBox1);

        textBox2 = new JTextField("Can not Edit",10);
        textBox2.setEditable(false);
        textBox2.setToolTipText("No need");
        add(textBox2);

        textBox3 = new JTextField(10);
        add(textBox3);

        passwordField = new JPasswordField("For PW");
        //passwordField.setEnabled(true);
        add(passwordField);

        EventHandler eventHandler = new EventHandler();
        textBox1.addActionListener(eventHandler);
        textBox2.addActionListener(eventHandler);
        textBox3.addActionListener(eventHandler);
        passwordField.addActionListener(eventHandler);



    }

    private class EventHandler implements ActionListener {


        public void actionPerformed(ActionEvent actionEvent) {
            String string = "";

            if (actionEvent.getSource()==textBox1)
                string = String.format("This is box 1: %s", actionEvent.getActionCommand());
            else if (actionEvent.getSource()== textBox2)
                string = String.format("This is Box 2: %s",actionEvent.getActionCommand());
            else if (actionEvent.getSource()== textBox3)
                string = String.format("This is Box 3: %s",actionEvent.getActionCommand());
            else if (actionEvent.getSource()== passwordField)
                string = String.format("The Password: %s",actionEvent.getActionCommand());

            JOptionPane.showMessageDialog(null, string);

        }
    }


}
