package JCheckBoxPrac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxPrac extends JFrame {

    private JTextField textField;
    private JCheckBox boldCheckBox;
    private JCheckBox italicCheckBox;

    //adding button group
    private ButtonGroup buttonGroup;

    public JCheckBoxPrac () {
        super("MessageBox");
        setLayout(new FlowLayout());

        textField = new JTextField("Display Sentence");
        //will not allow text box to be edited
        textField.setEditable(false);
        //will show hover message
        textField.setToolTipText("Can not edit here");
        textField.setFont(new Font("Serif", Font.PLAIN,20));
        add(textField);

        boldCheckBox = new JCheckBox("Bold");
        add(boldCheckBox);

        italicCheckBox = new JCheckBox("Italics");
        add(italicCheckBox);


            //can not uncheck already clicked box but will
        buttonGroup = new ButtonGroup();
        buttonGroup.add(boldCheckBox);
        buttonGroup.add(italicCheckBox);

        //handler needed so when box is clicked something happens
        Handler handler = new Handler();
        boldCheckBox.addItemListener(handler);
        italicCheckBox.addItemListener(handler);


    }

    //this method class will make it happen when box is clicked
    public class Handler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            Font font = null;

            if (boldCheckBox.isSelected() && italicCheckBox.isSelected())
                font = new Font("Serif",Font.BOLD + Font.ITALIC,20);
            else if (boldCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD,20);
            else if (italicCheckBox.isSelected())
                font = new Font("Serif",Font.ITALIC,20);
            else
                font = new Font("Serif",Font.PLAIN,20);

            textField.setFont(font);





        }
    }





}
