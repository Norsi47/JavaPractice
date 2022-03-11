package VariableLengthArguments;

import java.util.Locale;

public class VariableLengthPrac {
    public static void main(String[] args) {


        System.out.println("Average is " + average(2, 2, 2, 2, 2));

        System.out.println("Letters: "+letters("Fish", "American", "Guns"));

    }

    public static String letters(String...alpha) {
        for (String s : alpha) {
            System.out.println(s);

        }



        return alpha[0].toUpperCase(Locale.ROOT);
    }
    public static int average(int ... num) {
        int total = 0;
        for(int x : num) {
            total += x;
            System.out.print("The Loop: "+ x + " ");

        }
        return total/ num.length;
    }

}
