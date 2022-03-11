package startingOut;

import java.util.Scanner;

public class BasicCalculator {

    //Using Scanner 1

    public static void main (String args[]) {
//        Scanner norsi = new Scanner(System.in);
//
//        //using the same type, double is the type, put random names in it because they are all doubles
//        double fnum, snum, answer;
//
//        System.out.println("Enter first num: ");
//        //using nextDouble because we want a number in there
//        fnum = norsi.nextDouble();
//
//        System.out.println("Enter second num: ");
//        snum = norsi.nextDouble();
//
//        //this is to add it all
//        answer = fnum + snum;
//        System.out.println(answer);


        Scanner input = new Scanner(System.in);


        String name;
        double firstNum, secondNum, answer;

        System.out.print("Hey What is your name? ");
        name = input.nextLine();
        System.out.println("Hello " +name);

        System.out.print("Enter first number: ");
        firstNum = input.nextDouble();
        System.out.println("You Entered: "+firstNum);

        System.out.print("What is the second number? ");
        secondNum = input.nextDouble();
        System.out.println("You Entered "+secondNum+ " this time.");

        answer = firstNum + secondNum;
        System.out.println("Adding "+firstNum+ " with "+secondNum+ " will get you => "+answer);






    }
}
