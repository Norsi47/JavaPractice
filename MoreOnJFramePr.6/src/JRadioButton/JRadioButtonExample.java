package JRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JRadioButtonExample extends JFrame {

    private JTextField textField;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalicFont;
    private AbstractButton plainButton;
    private JRadioButton boldButton;
    private JRadioButton italicButton;
    private JRadioButton boldItalicButton;
    private ButtonGroup buttonGroup;

    public JRadioButtonExample() {
        super("The Title");
        setLayout(new FlowLayout());

        textField = new JTextField("Norsi is Awesome",25);
        add(textField);

        plainButton = new JRadioButton("plain",true);
        add(plainButton);
        boldButton = new JRadioButton("Bold", false);
        add(boldButton);
        italicButton = new JRadioButton("Italic", false);
        add(italicButton);
        boldItalicButton = new JRadioButton("Bold and Italic", false);
        add(boldItalicButton);

        //need to group them know when each other is checked and not checked
        //will reset when ever a button is clicked
        buttonGroup = new ButtonGroup();
        buttonGroup.add(plainButton);
        buttonGroup.add(boldButton);
        buttonGroup.add(italicButton);
        buttonGroup.add(boldItalicButton);

        plainFont = new Font("Serif", Font.PLAIN,14);
        boldFont = new Font("Serif", Font.BOLD,14);
        italicFont = new Font("Serif",Font.ITALIC,14);
        boldItalicFont = new Font("Serifc",Font.BOLD + Font.ITALIC,14);
        textField.setFont(plainFont);

        plainButton.addItemListener(new Handler(plainFont));
        boldButton.addItemListener(new Handler(boldFont));
        italicButton.addItemListener(new Handler(italicFont));
        boldItalicButton.addItemListener(new Handler(boldItalicFont));




    }

    private class Handler implements ItemListener{
        private Font font;

        public Handler(Font f) {
            font = f;
        }

        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            textField.setFont(font);

        }
    }


}
