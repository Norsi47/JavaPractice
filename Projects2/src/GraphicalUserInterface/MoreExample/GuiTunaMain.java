package GraphicalUserInterface.MoreExample;

import javax.swing.*;

public class GuiTunaMain {

    public static void main(String[] args) {

        // need to import jfram first

        GUITuna guiTuna = new GUITuna();
        //will let the text box close when x is pressed
        guiTuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //for the size
        guiTuna.setSize(275,180);
        //allows you to use it
        guiTuna.setVisible(true);
    }

}
