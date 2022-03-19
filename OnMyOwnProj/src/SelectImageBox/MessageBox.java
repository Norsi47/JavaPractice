package SelectImageBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MessageBox extends JFrame {

    private JComboBox jComboBox;
    private JLabel jLabel;

    public static String[] picFiles = {"image1.jpg", "image2.jpg"};
    public Icon[] savedFiles = {new ImageIcon(getClass().getResource(picFiles[0])), new ImageIcon(getClass().getResource(picFiles[1]))};

    public MessageBox() {
        super("ImageMessageBox");
        setLayout(new FlowLayout());

        //default picture that will show first
        jLabel = new JLabel(savedFiles[0]);
        add(jLabel);

        //first thing message box will show
        jComboBox = new JComboBox(picFiles);
        add(jComboBox);

        //add item listener which is what will happen when user clicks button
        jComboBox.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent itemEvent) {
                        if (itemEvent.getStateChange() == ItemEvent.SELECTED)
                            jLabel.setIcon(savedFiles[jComboBox.getSelectedIndex()]);
                    }
                }
        );






    }


}
