import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorServiceClass implements ActionListener {

    JFrame frame;
    JTextField textField;
    //array of JButtons
    JButton[] numberButtons = new JButton[10];
    //8 array list buttons
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, multiButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    //JPanel is needed to hold all buttons. beautify the text box
    JPanel panel;

    //for font
    Font myFont = new Font("Ink Free" ,Font.BOLD,30);

    double num1 = 0, num2 = 0, result = 0;
    //the symbols
    char operator;

    public  CalculatorServiceClass() {

        frame = new JFrame("CalculatorBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        //this is for frame
        frame.setLayout(null);

        textField = new JTextField();
        //this is for position of textfield
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = multiButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        //helps each button work on functions side
        //also helps set each button to font easily
        for (int i = 0; i<9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            //for some "annoying" thing not to show
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i<10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(myFont);
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
        }

        //on seperate layout
        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);


        //jpanel to hold all diff buttons in frame
        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        //the 10 is for 10spaces on each side
        panel.setLayout(new GridLayout(4,4,10,10));
        //temp background color to see
//        panel.setBackground(Color.DARK_GRAY);

        //the numbers
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add((numberButtons[3]));
        panel.add(addButton);
        //second row
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add((numberButtons[6]));
        panel.add(subButton);
        //third row
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add((numberButtons[9]));
        panel.add(multiButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(negButton);
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*this is how each button will work,
         this will display the button pressed on the textfield on the box
         it will */

        //when numberbuttons are pressed to keep working
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
            //will make decimal button work when pressed
            if (e.getSource() == decButton) {
                textField.setText(textField.getText().concat("."));
            }

            //for add button
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';

            /*this just means when the plus sign
            * is pressed, make the text field empty*/
            textField.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == multiButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());
            //used switch to determine math symbol being used
            switch (operator) {
                case '+' :
                    result = num1 + num2;
                    break;
                case '-' :
                    result = num1 - num2;
                    break;
                case '*' :
                    result = num1 * num2;
                    break;
                case '/' :
                    result = num1 / num2;
                    break;
            }
            //should print out value of result at the top
            textField.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == clrButton) {
            textField.setText("");
        }

        if (e.getSource() == delButton) {
            String string = textField.getText();
            textField.setText("");

            //it will go back and delete the last num everytime del button is pressed
            for (int i = 0; i<string.length()-1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
            }
        }

        if (e.getSource() == negButton) {
            double temp = Double.parseDouble(textField.getText());
            //take value in text field and makes it negative
            temp*=-1;
            textField.setText(String.valueOf(temp));
        }



    }

    public static void main(String[] args) {
        CalculatorServiceClass calculatorServiceClass = new CalculatorServiceClass();

    }

}
