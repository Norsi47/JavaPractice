package SummingElementsofArrays;

public class PracticeSummingArrays {
    public static void main(String[] args) {

        int age[] = {2, 2, 2, 2};
        int sum = 0;


        for (int i = 0; i < age.length; i++) {
            sum += age[i];
            System.out.println(age[i]);
            int average = sum/4;

            System.out.println("Sum is: "+i+ " Average is: "+average);
        }


    }
}
