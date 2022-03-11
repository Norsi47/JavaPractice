package Part1;

import java.util.Scanner;

public class UserNameMain {
    public static void main(String[] args) {

        UserName userName = new UserName();

        Scanner input = new Scanner(System.in);




        System.out.print("Hello Enter your name pls ");
        userName.name = input.nextLine();
        System.out.println("Your Name is: "+userName.getName());

        System.out.print("Ok now what is your age?: ");
        userName.age = input.nextInt();
        System.out.println("Your age is: "+userName.age);

        //does the same thing as top
        System.out.println("Age From Other Class: "+userName.getAge());


// this is needed to get what is in body of method
        userName.info();
        System.out.println("From Class UserName, method info(): " +userName);
        System.out.printf("Age: %d, Name: %s",userName.getAge(), userName.getName());











    }
}
