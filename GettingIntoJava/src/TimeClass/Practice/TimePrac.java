package TimeClass.Practice;

public class TimePrac {

    private int hour;
    private int second;
    private int minute;

    //use void when not returning anything
    public void setTime (int hour, int second, int minute) {
//        hour = (h >= 0 && h <=24) ? h : 0;
//        minute = (m >= 0 && m <=60) ? m : 0;
//        second = (s >= 0 && s <=24) ? s : 0;

        this.hour = 4;
        this.minute = 5;
        this.second = 6;


    }
    public String setMilitaryTime () {
        //will only print out 2 decimal numbers
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12)
                ?12:hour%12), minute, second, (hour < 12? "AM": "PM"));
    }


    }


