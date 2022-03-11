package ArrayElementsAsCounters;

import java.util.Random;

public class ArrayElementsTest {
    public static void main(String[] args) {

        //trying

        Random random = new Random();

        int freq[] = new int[100];

        for (int i = 1; i <= 1000; i++) {
            ++freq[1+random.nextInt(20)];

        }
        System.out.println("Loop\tFrequency");

        for (int rand = 1; rand < freq.length; rand++) {
            System.out.println(rand+"\t"+freq[rand]);

        }


    }


    }

