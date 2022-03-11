package SummingElementsofArrays;

public class SummingElementsofArrays {
    public static void main(String[] args) {
        int norsi[] = {21, 16, 18, 86, 21, 3};
        //this is = 0 because we want it to start from that
        int sum = 0;

        for(int i = 0; i< norsi.length; i++) {
            sum += norsi[i];
        }

        System.out.println("Sum of these nnumbers " +sum);

    }
}
