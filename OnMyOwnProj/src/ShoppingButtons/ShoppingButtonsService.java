package ShoppingButtons;

import javax.swing.*;

public class ShoppingButtonsService {
    //outside frame
    JFrame frame;
    //inside
    JPanel panel;

    /*Array for dif buttons
    need to set function for reach button*/

    JButton[] functionButtons = new JButton[9];

    //for calculations
    double num1 = 0, num2 = 0, result = 0;

    //these are for the symbols
    char symbolsOperator;

    public ShoppingButtonsService() {
        //the name of box
        frame = new JFrame("ShopButtonBox");
        //to close box when x is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setLayout(null);






        //has to be at the bottom
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        ShoppingButtonsService shoppingButtonsService = new ShoppingButtonsService();
    }


}

//can use "fix me", no space to remmind to fix
//TODO:Create Buttons with pictures of food items
//TODO: Make sure all buttons function properly
/*
* TODO:save selected files into a txt file
*  show seleced items in files on console or on jpanel output*/