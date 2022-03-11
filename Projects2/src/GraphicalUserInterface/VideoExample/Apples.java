package GraphicalUserInterface.VideoExample;

import javax.swing.*;

public class Apples {
    public static void main(String[] args) {
        //showInputDialog only shows string, this is for input
        String fn = JOptionPane.showInputDialog("Enter First Number");
        String sn = JOptionPane.showInputDialog("Enter Second Number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;

        //showMessageDialog for displaying
        JOptionPane.showMessageDialog(null, "The Answer is " +sum, " The Title",JOptionPane.PLAIN_MESSAGE);

    }


}
