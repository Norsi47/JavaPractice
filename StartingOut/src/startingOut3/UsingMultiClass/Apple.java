package startingOut3.UsingMultiClass;

import java.util.Scanner;

public class Apple {

    public static void main(String args[]) {

//        AppleJack returnsAppleJacks = new AppleJack();
//        returnsAppleJacks.returnAppleJack();
//        returnsAppleJacks.returnCinnamonRoles();
//
//    }
        AppleJack appleJack = new AppleJack();

        Scanner input = new Scanner(System.in);
        System.out.println("What do you like?: ");

        String name = input.nextLine();

        appleJack.appleJackName(name);


    }
}
