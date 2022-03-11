package Enumeration.Practice;

//need to add enum to do this
public enum Enumaration {
    AbellaDanger ("Thick" , 22),
    SashaGrey ("Nice asset", 36),
    LanaRhodes ("Nice Tattoo", 23),
    VioletMyers("Hispanic", 24),
    Adrianna("nice teeth", 26),
    Arleen("My thick Gal", 28),
    TeannaTrump("Nice Brain", 25);

    private final String desc;
    private final int age;

    Enumaration (String description, int birthAge) {
        desc = description;
        age = birthAge;
    }

    public String getDesc() {
        return desc;
    }

    public  int getAge() {
        return age;
    }


}
