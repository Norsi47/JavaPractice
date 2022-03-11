package VariableLengthArguments;

public class VariableLengthArg {
    public static void main(String[] args) {

        System.out.println("Average is: "+average(43, 56, 76, 8));


    }

    //using ... is used when you do not know how many numbers is needed
    public static int average(int...numbers) {
        int total= 0;
        for(int x : numbers)
            total += x;
            return total/ numbers.length;

    }

}
