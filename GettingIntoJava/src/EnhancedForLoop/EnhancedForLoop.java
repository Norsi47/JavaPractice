package EnhancedForLoop;

import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {

/*        int bucky [] = {3, 4, 5, 6, 7};
        int total = 0;

        //inside the loop the left side is called type, middle is identifier and last is the name
        for (int x: bucky) {
            //will add everything inside array
            //this is also the same as total = total + x
            total += x;
        }
        System.out.println(total);*/

        //on my own

        String shoppingList [] = {"Fish", "Yams", "Vinegar", "Almond Milk"};

        for (String i : shoppingList) {
            System.out.println("Printing out the whole Array: "+i);


        }
        System.out.println(shoppingList);
        //this is needed to print out string arrays
        System.out.println("Using Arrays.toString: "+Arrays.toString(shoppingList));



        //another try with numbers
        int randomNumbers[] = {1, 1, 1, 1, 1};
        int total = 0;

        for (int x : randomNumbers) {
            total += x;
            System.out.println("Will print all numbers"+x);


        }
        System.out.println("The total is: "+total);


    }
}
