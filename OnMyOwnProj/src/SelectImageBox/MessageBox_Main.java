package SelectImageBox;

import javax.swing.*;

public class MessageBox_Main {
    public static void main(String[] args) {
        MessageBox messageBoxMain = new MessageBox();
        messageBoxMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageBoxMain.setSize(500,300);
        messageBoxMain.setVisible(true);
    }
}
