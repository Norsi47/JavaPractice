package RandomJButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsingJButton extends JFrame implements ActionListener {

    private JButton jButton;

public UsingJButton () {
    super("JButtonBox");
    setLayout(new FlowLayout());

    jButton = new JButton("Calculate");
    add(jButton);

    jButton.addActionListener(this);

    jButton.setActionCommand("Flex");
    add(jButton);


}


    @Override
    public void actionPerformed(ActionEvent e) {
    String action = e.getActionCommand();
    if (action.equals("Flex")) {
        System.out.println("Button Pressed");
    }

    }



    }


