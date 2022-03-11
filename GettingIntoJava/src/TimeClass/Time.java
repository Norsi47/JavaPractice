package TimeClass;

public class Time {

    private int hour;
    private int minute;
    private int second;

    //use void here when it wont return anything;

    public void setTime(int h, int m, int s) {
        //if hour is > 0 and is h less than 24 ? then h = 0 by default
        // the 60 is for seconds and minuts
        hour = ((h >= 0 && h < 24) ? h : 0);
        minute = ((m >= 0 && m < 60) ? m : 0);
        second = ((s >= 0 && s < 60) ? s : 0);

    }

    //no arguments which is () is needed since it is only displaying
    public String toMilitary(){
        //format is saying display in 2 decimal places
        return String.format("%02d:%02d:%02d", hour, minute, second);

    }


}
