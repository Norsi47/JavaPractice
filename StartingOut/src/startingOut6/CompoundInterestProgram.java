package startingOut6;

public class CompoundInterestProgram {
    public static void main(String[] args) {

        //Amount, Principle, Rate
        //A = P(1+R)^n

        //double works well with decimal numbers
        /*double amount;
        double principle = 10000;
        double rate = .01;

        for(int day = 1; day <= 20; day++) {
            amount = principle *Math.pow(1 + rate, day);
            System.out.println(day + "  "+ amount);
        }*/

        double amount;
        double principle = 10000;
        double rate = 0.1;

        for (int day = 1; day <=20; day++) {
            amount = principle * rate * Math.pow(1+ rate, day);
            System.out.println(day + "  " + amount);

        }



    }
}
