package SelectImageBox;

import javax.swing.*;

public class MessageBox {
    public static void main(String[] args) {
        MessageBoxMain messageBoxMain = new MessageBoxMain();
        messageBoxMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageBoxMain.setSize(500,300);
        messageBoxMain.setVisible(true);
    }
}
