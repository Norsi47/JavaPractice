package Final.VideoEx;

public class SecondFInalClass {
    private int sum;
    //constant, in caps cuz Constants are in caps
    //final means it can not be modified, stays the same
    private final int NUMBER;

    public SecondFInalClass(int x) {
        NUMBER = x;

    }
    public void add() {
        sum += NUMBER;
    }
    public String toString() {
        return String.format("sum = %d\n", sum);
    }

}
