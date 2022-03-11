import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        //this is random object is the name
//        Random dice = new Random();
//        int number;
//
//        for (int counter = 1; counter <= 10; counter++) {
//
//            //used 6 because total numbers in dice
//            //adding 1+dice...will make it start from 1-6 instead of 0-5
//            number = 1+dice.nextInt(6);
////            number = dice.nextInt(6);
//            System.out.println(" " +number);
//        }

        //My example

        // call in Random Object
        Random dice = new Random();
        int numBer;
        int total = 0;
        int average;


        for (int counter = 0; counter <=10; counter++) {
            numBer = dice.nextInt(6);
            total = total + numBer;
            System.out.println(" "+numBer);
        }
        average = total/10;
        System.out.println("The Average is: " +average);

//    Random random = new Random();
//    int num;
//    for (int i = 0; i <= 4; i++) {
//        num = random.nextInt(3);
//        System.out.println("Random Numbers: "+num);
//
//    }



    }
}
