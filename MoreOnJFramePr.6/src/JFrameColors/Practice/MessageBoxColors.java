package JFrameColors.Practice;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MessageBoxColors extends JFrame {

    private JList jList;
    private static String colorNames [] = {"Blue", "Orange", "Pink", "Yellow", "Cyan"};
    private static Color colors [] = {Color.BLUE, Color.ORANGE, Color.PINK, Color.YELLOW, Color.CYAN};

 public MessageBoxColors() {

     super("Text Box Colors");
     setLayout(new FlowLayout());

     jList = new JList(colorNames);
     jList.setToolTipText("Pick Colors here");
     jList.setVisibleRowCount(5);
     jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     add(new JScrollPane(jList));

     jList.addListSelectionListener(
             new ListSelectionListener() {
                 @Override
                 public void valueChanged(ListSelectionEvent e) {
                     getContentPane().setBackground(colors[jList.getSelectedIndex()]);
                 }
             }
     );


    }









    }

