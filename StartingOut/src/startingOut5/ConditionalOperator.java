package startingOut5;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main (String []args) {
//        int age = 21;
//
//        System.out.println(age > 50 ? "You are old": "You are young");

        // my example
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you? ");
        age = input.nextInt();

        System.out.println(age > 50? "You are old": "You are young");

    }
}
