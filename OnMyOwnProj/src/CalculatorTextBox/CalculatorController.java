package CalculatorTextBox;

import javax.swing.*;
import java.awt.*;

public class CalculatorController {

    public static void main(String[] args) {


        CalculatorService calculatorService = new CalculatorService();
        calculatorService.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorService.setSize(300,300);
        calculatorService.setVisible(true);


    }
}
