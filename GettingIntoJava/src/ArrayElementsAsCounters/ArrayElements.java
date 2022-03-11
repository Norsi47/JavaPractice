package ArrayElementsAsCounters;

import java.util.Random;

public class ArrayElements {
    public static void main(String[] args) {

        Random random = new Random();
      /*  every number in array is equal to zero, the 7 on the right side,
         just means there are 7 numbers inside the array, 0-6, this means 7 values,
         can be added into the array, but in default it will equal zero cuz not assigned
         */

        int freq[] = new int[7];

        for (int i =1; i <= 1000; i++) {

            /*adding the +1 in front of random makes the generator start from 1 and not zero
            the random numbers will start from 1-6 and not 0-6 cuz of the 1+infront of random
            using ++freq adds a number to the array
            * */

            ++freq[1+random.nextInt(6)];


        }

        System.out.println("Face\tFrequency");

        for (int face = 1; face < freq.length; face++) {
            //starting from 1 will make numbers start from 1 and not 0
            System.out.println(face+" \t "+freq[face]);

        }


    }

}
