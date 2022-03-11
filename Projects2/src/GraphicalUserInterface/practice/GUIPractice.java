package GraphicalUserInterface.practice;

import javax.swing.*;

public class GUIPractice {

    public static void main(String[] args) {

        //the display box
        String firstNum = JOptionPane.showInputDialog("What is the First Number: ");
        String secondNum = JOptionPane.showInputDialog("What is the Second Number: ");

        //the numbers being added up
        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);
        //the sum of the two
        int sum = num1 + num2;

        //the after display box
        JOptionPane.showMessageDialog(null, "Answer Between the two: "+sum, "This is the Final Answer ",JOptionPane.PLAIN_MESSAGE);


    }


}
