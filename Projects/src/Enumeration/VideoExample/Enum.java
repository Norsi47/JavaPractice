package Enumeration.VideoExample;

public enum Enum {
    //constants that are also objects
    norsi("nice", "22"),
    kelsey("cutie", "10"),
    julia("bigmistake", "12"),
    nicole("italian", "13"),
    Candy("different", "14"),
    Erin("iWish", "16");


    //called final since we do not want it to change
    private final String desc;
    private final String year;


    //enumartion constructor
    Enum (String desciption , String birthday) {
        desc = desciption;
        year = birthday;
    }
    public String getDesc() {
        //will return string of description
        return desc;
    }

   public String getYear() {
        return year;
   }

}
