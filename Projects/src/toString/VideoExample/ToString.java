package toString.VideoExample;

public class ToString {
    private int month;
    private int day;
    private int year;

    //constructor
    public  ToString (int m, int d, int y) {
        month = m;
        day = d;
        year = y;

        // will take one string argument %s
        System.out.printf("The constructor for this is %s\n",this);

    }

    public String toString() {
        //%d is for the date format
        return String.format("%d/%d/%d", month, day, year);
    }

}
