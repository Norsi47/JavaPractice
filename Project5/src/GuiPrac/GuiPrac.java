package GuiPrac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;

public class GuiPrac extends JFrame {

    private JButton button1;
    private JButton button2;

    public GuiPrac () {
        super("ButtonBox");
        setLayout(new FlowLayout());

        button1 = new JButton("First Box");
        add(button1);

        Icon icon = new ImageIcon(getClass().getResource("Water.jpg"));
        Icon icon1 = new ImageIcon(getClass().getResource("SpiderMan.jpg"));

        button2 = new JButton("Random Button", icon);
        button2.setRolloverIcon(icon1);
        add(button2);

        Handler handler = new Handler();
        button1.addActionListener(handler);
        button2.addActionListener(handler);


    }

    public class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, String.format("%s",actionEvent.getActionCommand()));

        }
    }


}
