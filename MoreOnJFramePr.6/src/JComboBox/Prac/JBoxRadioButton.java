package JComboBox.Prac;

import javax.swing.*;
import java.awt.*;

public class JBoxRadioButton extends JFrame {

//    private JTextField jTextField;
    private JLabel jLabel;
    private Font plainFont, boldFont, italicFont,
    boldItalicFont;
    //reset button
    private AbstractButton plainButton;
    //circular button
    private JRadioButton boldButton, italicButton,
            boldItalicButton ;
    //groups the buttons
    private ButtonGroup buttonGroup;

    public void randomClass() {
        JBoxPrac jBoxPrac1 = new JBoxPrac();
        JTextField jTextField;
        jBoxPrac1.getClass().getResource(String.valueOf(jTextField = new JTextField("Fisher",45)));
        add(jTextField);

    }



}
