package toString.VideoExample;

public class StringTO {
    private String name;
    //coming from the ToString class, this is called composition
    private ToString birthday;

    //constructor
    public StringTO(String theName, ToString theBdate) {
        name = theName;
        birthday = theBdate;

    }

    public String toString() {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}
