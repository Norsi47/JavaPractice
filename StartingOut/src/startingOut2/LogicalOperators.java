package startingOut2;

public class LogicalOperators {
    //multiple tests 2

    public static void main (String args[]) {
        int boy, girl;
        boy = 18;
        girl = 68;

        //will not be true if both does not equal but is true if either side are true
        if (boy > 10 && girl < 60) {
            System.out.println("You can enter");

        } else {
            System.out.println("You can not enter");
        }

    }
}
