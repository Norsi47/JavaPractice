package ShoppingButtons;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingButtonsService {
    //outside frame
    JFrame frame;
    //inside
    JPanel panel;

    //for displayBox
    JTextField displayBox;

    /*Array for dif buttons
    need to set function for reach button*/

    JButton[] functionButtons = new JButton[9];

    //for fruit button pics
    JButton[] fruitButtonPics = new JButton[3];
    JButton fruitButtons;

    //for calculations
    double num1 = 0, num2 = 0, result = 0;

    //these are for the symbols
    char symbolsOperator;

    //for font
    Font myFont = new Font("TimesRoman", Font.BOLD, 40);

    public ShoppingButtonsService() {
        //the name of box
        frame = new JFrame("ShopButtonBox");
        //to close box when x is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setLayout(null);

        displayBox = new JTextField();
        //for size and display
        displayBox.setBounds(200, 50, 400, 60);
        displayBox.setFont(myFont);
        displayBox.setEditable(false);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.CYAN);

        //adding images to button
        List<JButton> buttonsList = new ArrayList<JButton>();
        String[] paths = {"apple.png", "banana.jpg", "Tomato.jpg" };
        for(int i = 0; i < 3; i++) {
            ImageIcon imageIcon = new ImageIcon(paths[i]);

            fruitButtons = new JButton(imageIcon);
            buttonsList.add(fruitButtons);
            panel.add(fruitButtons);



        }









        frame.add(panel);
        frame.add(displayBox);
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