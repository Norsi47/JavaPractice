package startingOut5;

import java.util.Locale;
import java.util.Scanner;

public class ElseIfStatements {

    public static void main (String []args) {
//        int age = 55;
//
//        if(age >= 60) {
//            System.out.println("You are a Senior Citizen");
//        }else if (age >=50) {
//            System.out.println("You are in your 50s");
//
//        } else if (age >=40) {
//            System.out.println("You are in your 40s");
//        }
//        else {
//            System.out.println("You are a young buck");
//        }

        //My Example
        int userAge;
        String userName;
        Scanner input = new Scanner(System.in);
        System.out.printf("What is your name?: ");
        userName = input.nextLine();
        System.out.println("Hello: "+ userName);
        System.out.printf("Now enter your Age please: ");
        userAge = input.nextInt();

        if(userAge >= 20){
            System.out.println("Hello "+userName+ " You Entered: "+userAge+ " So, You are in your 20s enjoy life and learn");

        }else if (userAge >= 30) {
            System.out.println("Hello "+userName+ " You Entered: "+userAge+ " So, You are in your 30s enjoy life and learn");
        } else if (userAge >= 60) {
            System.out.println("Hello "+userName+ " You Entered: "+userAge+ " So, You are really old");

        }
        else {
            System.out.println("Error");
        }




    }
}
