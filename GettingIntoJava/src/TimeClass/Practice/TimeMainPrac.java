package TimeClass.Practice;

public class TimeMainPrac {
    public static void main(String[] args) {

        TimePrac timePrac = new TimePrac();

        System.out.println(timePrac.setMilitaryTime());
        System.out.println(timePrac.toString());

        timePrac.setTime(13,27,6);
        System.out.println(timePrac.setMilitaryTime());

        System.out.println(timePrac.toString());





    }
}
