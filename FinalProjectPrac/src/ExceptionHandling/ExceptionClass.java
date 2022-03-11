package ExceptionHandling;

import java.util.Scanner;

public class ExceptionClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 1;
        //we are using do while loop when so it will keep loop until it is right
        //need to add x = 1 or loop will not stop
        do {
            //try this first
            try {
                System.out.print("Enter First Num: ");
                int n1 = input.nextInt();

                System.out.print("Enter Second Num: ");
                int n2 = input.nextInt();

                int sum = n1 / n2;
                System.out.println("Answer is: " + sum);
                x = 2;
            }
//and if there is an error do this
            catch (Exception e) {
                System.out.println("You cant do that");

            }
        } while (x==1);

    }

}
