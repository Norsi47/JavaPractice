package JComboBox.Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JBoxPrac extends JFrame {

  private JComboBox jComboBox;
  private JLabel jLabel;



  public static String[] picNames = {"Icon.jpg", "Icon1.jpg"};

  public Icon[] picSave = {new ImageIcon(getClass().getResource(picNames[0])),
  new ImageIcon(getClass().getResource(picNames[1]))};

  public JBoxPrac() {
      super("MessagePictureBox");
      setLayout(new FlowLayout());

      jComboBox = new JComboBox(picNames);
      add(jComboBox);

      //default
      jLabel = new JLabel(picSave[0]);
      add(jLabel);

jComboBox.addItemListener(
        new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                    jLabel.setIcon(picSave[jComboBox.getSelectedIndex()]);
            }
        }
);



    }



}
