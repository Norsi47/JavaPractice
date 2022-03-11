package Final.VideoEx;

public class FinalClass {
    public static void main(String[] args) {
        SecondFInalClass secondFInalClass = new SecondFInalClass(10);

        for (int i = 0; i < 5; i++) {
            secondFInalClass.add();
            System.out.printf("Loop is : %s", secondFInalClass);
        }

    }
}
