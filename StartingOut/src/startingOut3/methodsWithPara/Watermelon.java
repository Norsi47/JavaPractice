package startingOut3.methodsWithPara;

import java.util.Scanner;

public class Watermelon {

    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        Orange orangeObject = new Orange();

        System.out.print("Enter name here: ");
        String name = input.nextLine();

        orangeObject.simpleMessage(name);


    }
}
