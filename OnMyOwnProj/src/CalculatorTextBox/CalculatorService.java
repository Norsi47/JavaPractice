package CalculatorTextBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.EventHandler;

public class CalculatorService extends JFrame implements ActionListener {

    private static final long serialVersionUID = 353853209832607592L;

    private JTextField userNumber;
    public JTextField textBox1;
    public JTextField textInput ;
    public JButton calculateBtn;
    private AbstractButton abstractButton;
    private JRadioButton jRadioButton;
    //this displays the text on textbox
    public JLabel jLabel;


    public CalculatorService () {

        super("CalculatorBox");
        setLayout(new FlowLayout());

        textBox1 = new JTextField(" ",10);
        add(textBox1);

        jLabel = new JLabel("Hello");
        add(jLabel);

//        textInput = new JTextField(" ", 10);
//        textInput.setToolTipText("User input for number");
//        add(textInput);

        calculateBtn = new JButton("Calculate");
        calculateBtn.addActionListener(this);
        add(calculateBtn);

        abstractButton = new JRadioButton("abstract",true);
        add(abstractButton);

        jRadioButton = new JRadioButton("JRadioButton");
        add(jRadioButton);

        jRadioButton.addItemListener(e -> textBox1.getText());


        //another way. use e-> instead
//        calculateBtn.addActionListener(e -> System.out.println("Flex"));
//        calculateBtn.addItemListener(
//                new ItemListener() {
//                    @Override
//                    public void itemStateChanged(ItemEvent e) {
//                        String string = "";
//
//                        if (calculateBtn.isSelected());
//                        textBox1.setText("You selected "+textBox1);
//                    }
//                }
//        );


    }




    @Override
    public void actionPerformed(ActionEvent e) {

//        String user = textInput.getText();
//        System.out.println(user);

        String action = e.getActionCommand();
        if (action.equals("Calculate")) {
//            System.out.println(textInput);
            jLabel.setText(textBox1.getText());

            textBox1.setText(" ");

        }

    }






    }









