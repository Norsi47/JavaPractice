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

    JButton[] functionButtons = new JButton[10];
    JButton addButton, subButton, delButton, multiButton,
            clrButton, equalButton;

    //for fruit button pics
    JButton[] fruitButtonPics = new JButton[3];
    JButton tomatoButton, bananaButton, appleButton;

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
        frame.setSize(1020, 800);
        frame.setLayout(null);

        displayBox = new JTextField();
        //for size and display
        displayBox.setBounds(200, 50, 500, 60);
        displayBox.setFont(myFont);
        displayBox.setEditable(false);

        panel = new JPanel();
        panel.setBounds(200, 110, 500, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.CYAN);

        //picture for tomatoe
        tomatoButton = new JButton();
        tomatoButton.setToolTipText("Tomato Button");
        tomatoButton.addActionListener(this);
        try {
            //another way to add
//            Image tomatoImg = ImageIO.read(getClass().getResource(
//                    "Tomato.jpg"));

            Image tomatoImg = new ImageIcon("OnMyOwnProj/src/ShoppingButtons/ButtonPixelPics_JavaProj/Tomato.jpg").getImage();
            //Finally figured out how to fix size
            Image image = tomatoImg.getScaledInstance(100, 100,
                    Image.SCALE_SMOOTH);
            tomatoButton.setIcon(new ImageIcon(image));

        } catch (Exception e) {
            System.out.println(e);
        }

        //banana pic
        bananaButton = new JButton();
        bananaButton.setToolTipText("Banana Button");
        bananaButton.addActionListener(this);

        try {
            //another way to add
//            Image tomatoImg = ImageIO.read(getClass().getResource(
//                    "banana.jpg"));
            Image bananaImg = new ImageIcon("OnMyOwnProj/src/ShoppingButtons/ButtonPixelPics_JavaProj/banana.jpg")
                    .getImage();
            //Finally figured out how to fix size
            Image image = bananaImg.getScaledInstance(100, 100,
                    Image.SCALE_SMOOTH);
            bananaButton.setIcon(new ImageIcon(image));

        } catch (Exception e) {
            System.out.println(e);
        }

        //apple pic
        appleButton = new JButton();
        appleButton.setToolTipText("AppleButton");
        //this is what will make the apple button work when pressed
        appleButton.addActionListener(this);

        try {
            Image appleImg = new ImageIcon("OnMyOwnProj/src/ShoppingButtons/ButtonPixelPics_JavaProj/apple.png")
                    .getImage();
            Image image = appleImg.getScaledInstance(85, 70, Image.SCALE_SMOOTH);
            appleButton.setIcon(new ImageIcon(image));
        }
        catch (Exception e) {
            System.out.println(e);
        }



        //buttons display
        addButton = new JButton("+");
        subButton = new JButton("Sub(-)");
        delButton = new JButton("Del");
        multiButton = new JButton("Multi(*)");
        clrButton = new JButton("Clr");
        equalButton = new JButton("=");

        //the function keys
        functionButtons[0] = clrButton;
        functionButtons[1] = multiButton;
        functionButtons[2] = delButton;
        functionButtons[3] = addButton;
        functionButtons[4] = subButton;
        functionButtons[5] = equalButton;

        //to make buttons show outside panel and inside jframe
        clrButton.setBounds(250, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);

        //easier to get all num buttons working
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
        }

        //for function buttons to work
        for (int i = 0; i < 6; i++) {
            //makes all function buttons in array work
            functionButtons[i].addActionListener(this);
            //sets font for all keys
            functionButtons[i].setFont(myFont);

        }


        //adds the pic buttons into the app
        panel.add(tomatoButton);
        panel.add(bananaButton);
        panel.add(appleButton);

        //adds it into panel
        panel.add(subButton);
        panel.add(delButton);
        panel.add(multiButton);
        panel.add(addButton);


        //adding numbers into app
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(numberButtons[0]);
        panel.add(equalButton);


        frame.add(clrButton);
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

        /*what will happen if user click foodPic button
        need to display price
        */
        if (e.getSource() == appleButton) {
           displayBox.setText("Apple Info: ");
        }

        //for banana button
        if (e.getSource() == bananaButton) {
            displayBox.setText("Banana Info: ");

        }

        if (e.getSource() == tomatoButton) {
            displayBox.setText("Tomato Info: ");
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(displayBox.getText());
            symbolsOperator = '+';
            displayBox.setText("");

        }

        if (e.getSource() == multiButton) {
            num1 = Double.parseDouble(displayBox.getText());
            symbolsOperator = '*';
            displayBox.setText("");
        }


        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(displayBox.getText());
            symbolsOperator = '-';
            displayBox.setText("");
        }

        //when clr button is pressed make displaybox empty
        if (e.getSource() == clrButton) {
            displayBox.setText("");

        }

        if (e.getSource() == delButton) {
            String string = displayBox.getText();
            displayBox.setText("");

            for (int i = 0; i < string.length() - 1; i++) {
                displayBox.setText(displayBox.getText() + string.charAt(i));
            }
        }

        //using equal to button
        if (e.getSource() == equalButton) {
            num2 = Double.parseDouble(displayBox.getText());
            switch (symbolsOperator) {
                case '+' :
                    result = num1 + num2;
                    break;
                case '-' :
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;

            }
            //display on display box
            displayBox.setText(String.valueOf(result));
            num1 = result;

        }


    }

    public static void main(String[] args) {
        ShoppingButtonsService shoppingButtonsService = new ShoppingButtonsService();
    }
}


//can use "fix me", no space to remmind to fix
/*TODO:Create Buttons with pictures of food items
*  if Users press food button let it say what food it is and the price*/
//TODO: Make sure all buttons function properly
/*
 * TODO:save selected files into a txt file
 *  show seleced items in files on console or on jpanel output*/