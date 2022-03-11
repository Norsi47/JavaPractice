package startingOut6;

import java.util.Scanner;

public class SimpleAveragingProgram {

    public static void main (String []args){

        Scanner input = new Scanner(System.in);
//        int total = 0;
//        int grade;
//        //using double instead of int for average will remove decimal numbers
//        double average;
//        int counter = 0;
//
//        while (counter < 10) {
//            //added this to make it easier to enter number
//            System.out.printf("Enter Number here: ");
//            //use . after and object is used, input is the obj in this case
//            grade = input.nextInt();
//            total = total + grade;
//            // this is needed to end look
//            counter++;
//        }
//        average = total/10;
//        System.out.println("Your average is "+average);

        //my example
         int grade  ;
         int total = 0;
         int average;
         int counter = 0;

         while(counter < 5) {
             System.out.printf("Enter number here:");
             grade = input.nextInt();
             total = total + grade;
             counter++;


         }
        average = total/10;
        System.out.println("Average is: "+average);





    }
}
