package JFrameColors.Example;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListProgramColors extends JFrame {

    private JList jList;
    private static String [] colorNames = {"black", "blue", "red", "White"};
    private static Color [] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};

    public JListProgramColors() {
        super("Title");
        setLayout(new FlowLayout());

        jList = new JList(colorNames);
        //all the rows for the color
        jList.setVisibleRowCount(4);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //adds scroll window if necessary
        add(new JScrollPane(jList));

        //what user will do when button is clicked
        jList.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent listSelectionEvent) {
                        //this will set background
                        getContentPane().setBackground(colors[jList.getSelectedIndex()]);


                    }
                }

        );
    }
}
