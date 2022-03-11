package startingOut5;

import java.util.Scanner;

public class NestedIFstatements {

    public static void main (String []args){

        int age;
        System.out.print("Hello Enter age Here pls: ");

        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        if(age == 60) {
            System.out.println("Your age is Identical");
        } else {
            System.out.println("You are too young");
        }
        if(age > 75) {
            System.out.println("you are wayyy too old");

        }else {
            System.out.println("You are welcome to join");
        }

    }

}
