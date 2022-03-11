package startingOut;

import java.util.Scanner;

public class IncrementOperators {
    //using Scanner 2

    public static void main(String args[]) {

        Scanner norsi = new Scanner(System.in);

        int tuna = 5;
        int bass = 18;

        // ++ is an increment, will add to 6
//        ++tuna;
        // can be done this way as well
//        System.out.println(++tuna);

        //will add first but will not print anything until second print is set
        //-- also works the same way but opposite
//        System.out.println(tuna++);
//        System.out.println(tuna);

        // can be done this way as well
        //tuna += 8 ;

        // for multiplying
        tuna *= 8;

//        tuna = tuna + 5;
        System.out.println(tuna);

    }
}
