package JComboBox.VideoExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComboBoxExample extends JFrame {

    private JComboBox box;
    //for the picture
    private JLabel picture;

    //for storing path, path is string
    private static String[] fileName = {"Icon.jpg", "Icon1.jpg"};

    //this is to store the files
    private Icon[] pics = {new ImageIcon(getClass().getResource(fileName[0])), new ImageIcon(getClass().getResource(fileName[1]))};

    public JComboBoxExample() {
        super("Title");
        setLayout(new FlowLayout());

        //will take array of options, in this case the fileName array
        box = new JComboBox(fileName);

        //need to add box
        //can be here
        add(box);
        picture = new JLabel(pics[0]);
        add(picture);

        //another way instead of making handler class
        box.addItemListener(
                new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent itemEvent) {
                        //when you select button
                        if(itemEvent.getStateChange()==ItemEvent.SELECTED)
                            picture.setIcon(pics[box.getSelectedIndex()]);

                    }
                }

        );
    /*    //need to add box
        // or here
        add(box);
        picture = new JLabel(pics[0]);
        add(picture);*/
    }



}
