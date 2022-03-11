package GraphicalUserInterface.MoreExample;

// need to import java flowlayout
//JFrame import gives x
//Jlabel gives line of text and images

import javax.swing.*;
import java.awt.*;

public class GUITuna extends JFrame {

    private JLabel item1;

    //constructor
    public GUITuna () {
        //this is the title of the window
        super("The title bar");

        //this one is for default layout
        setLayout(new FlowLayout());

        //this is for text on screen
        item1 = new JLabel("This is a Sentence");

        //what will hover when we click on it
        item1.setToolTipText("This is will show up on hover");

        //this adds item to the window, need this to work
        add(item1);

    }
}
