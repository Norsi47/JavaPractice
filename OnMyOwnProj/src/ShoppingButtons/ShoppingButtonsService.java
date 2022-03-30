package ShoppingButtons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShoppingButtonsService implements ActionListener {


    //outside frame
    JFrame frame;
    //inside
    JPanel panel;

    //for displayBox
    JTextField displayBox;

    /*Array for dif buttons
    need to set function for reach button
    the numbers in [] is how many buttons there will be
     */
    JButton[] numberButtons = new JButton[10];

    JButton[] functionButtons = new JButton[5];
    JButton addButton, subButton, delButton, multiButton, clrButton;

    //for fruit button pics
    JButton[] fruitButtonPics = new JButton[3];
    JButton tomatoButton;

    //for calculations
    double num1 = 0, num2 = 0, result = 0;

    //these are for the symbols
    char symbolsOperator;

    //for font
    Font myFont = new Font("TimesRoman", Font.BOLD, 20);

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
        panel.setBounds(200, 110, 400, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.CYAN);

        tomatoButton = new JButton();
        try {
            Image tomatoImg = ImageIO.read(getClass().getResource(
                    "Tomato.jpg"));
            tomatoButton.setIcon(new ImageIcon(tomatoImg));

        } catch (Exception e) {
            System.out.println(e);

        }
        //buttons display
        addButton = new JButton("+");
        subButton = new JButton("Sub(-)");
        delButton = new JButton("Del");
        multiButton = new JButton("Multi(*)");
        clrButton = new JButton("Clr");

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
        }


        //adds the buttons into the app
        panel.add(tomatoButton);

        panel.add(subButton);
        panel.add(delButton);
        panel.add(multiButton);
        panel.add(clrButton);

        //adding numbers into app
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);


        frame.add(panel);
        frame.add(displayBox);
        //has to be at the bottom
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //will make number buttons show in display box when pressed
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                displayBox.setText(displayBox.getText().concat(String.valueOf(i)));
            }


        }
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