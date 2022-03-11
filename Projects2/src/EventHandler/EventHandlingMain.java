package EventHandler;

import javax.swing.*;

public class EventHandlingMain {
    public static void main(String[] args) {

        EventHandlingClass eventHandlingClass = new EventHandlingClass();
        //so clicking x will close
        eventHandlingClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting size
        eventHandlingClass.setSize(350,100);
       //setting visibility
        eventHandlingClass.setVisible(true);

    }
}
