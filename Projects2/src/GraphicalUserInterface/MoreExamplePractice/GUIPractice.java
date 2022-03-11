package GraphicalUserInterface.MoreExamplePractice;

import javax.swing.*;
import java.awt.*;

//must extend jfram first
public class GUIPractice extends JFrame {

    //need to call in Jlabel
    private JLabel textBox;


    public GUIPractice () {

        //the title of text box
        super("Message Box");

        //set layout is needed
        setLayout(new FlowLayout());

        //text on screen, need JLabel
        textBox = new JLabel("Hello Guy");

        //when you hover, need setTool
        textBox.setToolTipText("Message Here");

        //adding item to window
        add(textBox);


    }
    /*Random
    * class name extend JFram
    * private JLabel name
    *
    * //Constructor
    * public Constructor name() {
    * super("name of box")
    *
    * //layout
    * setLayout(new FlowLayout)
    *
    * //now start setting
    * name from Jlabel = new Jlabel ("use text in here")
    *
    * //hover message
    * name from Jlabel.setTool...("Message")
    *
    * add(jlabelText)
    *
    * }
    * */

}
