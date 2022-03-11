package MoreOnGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class GUI extends JFrame {

    private JButton reg;
    private JButton custom;


    //using constructor because we want window to always pop up and not user always having to call the method
    public GUI() {
        super("The Title");
        setLayout(new FlowLayout());

        reg = new JButton("Reg Button");
        add(reg);


        Icon icon = new ImageIcon(getClass().getResource("Water.jpg"));
        Icon icon1 = new ImageIcon(getClass().getResource("SpiderMan.jpg"));

        //will show pic on icon
        custom = new JButton("Custom", icon);
        custom.setRolloverIcon(icon1);
        add(custom);


        // this is needed when ever you click on the button something happens
        Handler handler = new Handler();
        reg.addActionListener(handler);
        custom.addActionListener(handler);
    }



        private class Handler implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JOptionPane.showMessageDialog(null,String.format("%s", actionEvent.getActionCommand()));

            }




        }


    }

