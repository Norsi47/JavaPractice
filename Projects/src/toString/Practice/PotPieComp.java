package toString.Practice;

public class PotPieComp {
    private String name;
    //composition
    private Potpie birthDay;

    //constructor
    public PotPieComp (String userName, Potpie bDay) {
        name = userName;
        birthDay = bDay;


    }

    //toString method
    public String toString() {
        return String.format("My name is %s, my birthday is on %s ",name,birthDay);
    }

}
