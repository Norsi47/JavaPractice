package GraphicalUserInterface.MoreExamplePractice;

import javax.swing.*;

public class GUIPracticeMain {
    public static void main(String[] args) {

        GUIPractice guiPractice = new GUIPractice();
        //default JFrame.Exit layout is needed to allow user exit
       guiPractice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //size of text box
guiPractice.setSize(100,50);
        //makes it Visible
        guiPractice.setVisible(true);
    }

    /*
    * //Random Notes
    * Get other class
    * //Set default Layout
    * otherClassName.setDefault(JFrame.Exit)
    * //layoutsize
    * otherClassName.setSiz(int, int)
    * //make visible
    * otherclassname.setVisible
    * */
}
