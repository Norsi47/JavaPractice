package ArrayForLoops;

public class ArraysLoop {
    public static void main(String[] args) {

        int [][] userAge = {{12, 24, 34, 35, 21}};
        int [][] randomNum = new int[3][2];
        randomNum[0] [0] =12;
        randomNum [0] [1] = 45;
        randomNum [1] [1] = 44;

        int [] ranArray = {1, 2, 3};
        //to print out array
        for (int[] user: userAge ) {
            System.out.println("Advance" +user);

        }

        for (int i = 0; i < ranArray.length; i++) {
            System.out.println(ranArray[i]);

        }
    }
}
