package Final.VideoEx.Practice;

public class UsingFInalMain {
    public static void main(String[] args) {
        UsingFinal usingFinal = new UsingFinal(2);
        //for loop to print it out 5 times
        for (int i = 0; i < 5; i++){
            usingFinal.add();
            System.out.println("Input "+usingFinal);
//            System.out.printf("Ending: %s\n",usingFinal);

        }

    }
}
