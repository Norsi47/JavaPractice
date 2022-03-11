package JComboBox.Prac;

import javax.swing.*;

public class JBoxPracMain {
    public static void main(String[] args) {
        JBoxPrac jBoxPrac = new JBoxPrac();
        jBoxPrac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jBoxPrac.setSize(500, 300);
        jBoxPrac.setVisible(true);

        JBoxRadioButton jBoxRadioButton = new JBoxRadioButton();
        jBoxRadioButton.randomClass();
    }
}
