package JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class UsingJCheckBox extends JFrame {
    private JTextField textField;
    private JCheckBox checkBox;
    private JCheckBox checkBox2;


    public UsingJCheckBox() {
        super("The Title");
        setLayout(new FlowLayout());

        textField = new JTextField("This is a Sentence", 20);

        // textField.setEditable(false); add to not let user edit inside box
        // how to set font
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);

        checkBox = new JCheckBox("Bold");
        add(checkBox);
        checkBox2 = new JCheckBox("Italic");
        add(checkBox2);

        //use itemListener for check box and action listener for text box
        Handler handler = new Handler();
        checkBox.addItemListener(handler);
        checkBox2.addItemListener(handler);


    }

    private class Handler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            Font font = null;

            if (checkBox.isSelected() && checkBox2.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (checkBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);

            else if (checkBox2.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);

            else
                font = new Font("Serif", Font.PLAIN, 14);

            textField.setFont(font);


        }
    }

}
